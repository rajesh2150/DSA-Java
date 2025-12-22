package SlidingWindow;

public class AllPossibleSubArrays {
    static void allPossibleSubArrays(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                }
                System.out.println();
            }

            System.out.println("------------");

        }

    }

    static void allPossibleSubArrays2(int[] nums) {
        for (int k = 1; k <= nums.length; k++) {
            System.out.println("SubArray length : "+k);
            for (int point = 0; point <= nums.length - k; point++) {
                for (int i = point; i < point + k; i++) {
                    System.out.print(nums[i] + " ");
                }
                System.out.println();

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        allPossibleSubArrays2(nums);

    }
}
