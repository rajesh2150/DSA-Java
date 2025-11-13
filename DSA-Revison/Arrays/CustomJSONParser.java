package Arrays;

import java.util.*;

public class CustomJSONParser {

    enum TokenType {
        LEFT_BRACE, RIGHT_BRACE, LEFT_BRACKET, RIGHT_BRACKET,
        COLON, COMMA, STRING, NUMBER, TRUE, FALSE, NULL, EOF
    }

    static class Token {
        TokenType type;
        String value;

        Token(TokenType type, String value) {
            this.type = type;
            this.value = value;
        }

        public String toString() {
            return type + (value != null ? "(" + value + ")" : "");
        }
    }

    static class Lexer {
        private final String input;
        private int pos = 0;

        Lexer(String input) {
            this.input = input.trim();
        }

        List<Token> tokenize() {
            List<Token> tokens = new ArrayList<>();
            while (pos < input.length()) {
                char c = input.charAt(pos);
                switch (c) {
                    case '{': tokens.add(new Token(TokenType.LEFT_BRACE, "{")); pos++; break;
                    case '}': tokens.add(new Token(TokenType.RIGHT_BRACE, "}")); pos++; break;
                    case '[': tokens.add(new Token(TokenType.LEFT_BRACKET, "[")); pos++; break;
                    case ']': tokens.add(new Token(TokenType.RIGHT_BRACKET, "]")); pos++; break;
                    case ':': tokens.add(new Token(TokenType.COLON, ":")); pos++; break;
                    case ',': tokens.add(new Token(TokenType.COMMA, ",")); pos++; break;
                    case '"': tokens.add(readString()); break;
                    default:
                        if (Character.isWhitespace(c)) pos++;
                        else if (Character.isDigit(c) || c == '-') tokens.add(readNumber());
                        else if (input.startsWith("true", pos)) { tokens.add(new Token(TokenType.TRUE, "true")); pos += 4; }
                        else if (input.startsWith("false", pos)) { tokens.add(new Token(TokenType.FALSE, "false")); pos += 5; }
                        else if (input.startsWith("null", pos)) { tokens.add(new Token(TokenType.NULL, "null")); pos += 4; }
                        else throw new RuntimeException("Unexpected character at position " + pos + ": " + c);
                }
            }
            tokens.add(new Token(TokenType.EOF, null));
            return tokens;
        }

        private Token readString() {
            StringBuilder sb = new StringBuilder();
            pos++; // skip "
            while (pos < input.length()) {
                char c = input.charAt(pos++);
                if (c == '"') break;
                if (c == '\\') {
                    if (pos < input.length()) {
                        char next = input.charAt(pos++);
                        sb.append(next);
                    }
                } else {
                    sb.append(c);
                }
            }
            return new Token(TokenType.STRING, sb.toString());
        }

        private Token readNumber() {
            int start = pos;
            while (pos < input.length() && (Character.isDigit(input.charAt(pos)) || input.charAt(pos) == '.' || input.charAt(pos) == '-')) {
                pos++;
            }
            return new Token(TokenType.NUMBER, input.substring(start, pos));
        }
    }

    static class Parser {
        private final List<Token> tokens;
        private int pos = 0;

        Parser(List<Token> tokens) {
            this.tokens = tokens;
        }

        void parse() {
            parseValue();
            expect(TokenType.EOF);
        }

        private void parseValue() {
            Token token = peek();
            switch (token.type) {
                case LEFT_BRACE -> parseObject();
                case LEFT_BRACKET -> parseArray();
                case STRING, NUMBER, TRUE, FALSE, NULL -> advance();
                default -> throw error("Unexpected token: " + token);
            }
        }

        private void parseObject() {
            expect(TokenType.LEFT_BRACE);
            if (match(TokenType.RIGHT_BRACE)) return; // empty object
            do {
                expect(TokenType.STRING);
                expect(TokenType.COLON);
                parseValue();
            } while (match(TokenType.COMMA));
            expect(TokenType.RIGHT_BRACE);
        }

        private void parseArray() {
            expect(TokenType.LEFT_BRACKET);
            if (match(TokenType.RIGHT_BRACKET)) return; // empty array
            do {
                parseValue();
            } while (match(TokenType.COMMA));
            expect(TokenType.RIGHT_BRACKET);
        }

        private Token peek() {
            return tokens.get(pos);
        }

        private Token advance() {
            return tokens.get(pos++);
        }

        private boolean match(TokenType type) {
            if (peek().type == type) {
                advance();
                return true;
            }
            return false;
        }

        private void expect(TokenType type) {
            if (peek().type != type)
                throw error("Expected " + type + " but found " + peek());
            advance();
        }

        private RuntimeException error(String message) {
            return new RuntimeException("Syntax Error: " + message + " at position " + pos);
        }
    }

    public static void main(String[] args) {
        String[] tests = {
            "{}",                               // ✅ valid
            "{\"key\":\"value\"}",               // ✅ valid
            "{\"a\":1,\"b\":true,\"c\":null}",   // ✅ valid
            "{\"nested\":{\"x\":[1,2,3]}}",     // ✅ valid
            "{\"array\": [1, 2, 3, 4]}",        // ✅ valid
            "{",                                // ❌ invalid (missing brace)
            "{\"key\":}",                       // ❌ invalid (missing value)
            "{\"key\": [1, 2, }",               // ❌ invalid (extra comma)
            "{\"key\": [1, 2, 3]",              // ❌ invalid (missing closing bracket)
            "{\"key\": true false}"             // ❌ invalid (missing comma)
        };

        for (String input : tests) {
            System.out.println("\nTesting JSON: " + input);
            try {
                Lexer lexer = new Lexer(input);
                Parser parser = new Parser(lexer.tokenize());
                parser.parse();
                System.out.println("✅ VALID JSON");
            } catch (Exception e) {
                System.err.println("❌ INVALID JSON → " + e.getMessage());
            }
        }
    }

}
