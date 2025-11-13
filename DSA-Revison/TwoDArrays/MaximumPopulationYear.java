package TwoDArrays;

public class MaximumPopulationYear {

	public static void main(String[] args) {
		int[][] logs = {
			    {1950, 1961},
			    {1960, 1971},
			    {1970, 1981}
			};

		System.out.println(maximumPopulation(logs));

	}

	 public static int maximumPopulation(int[][] log) {
		 
		 int[] lives = new int[2050];
		 
		 for(int i=0;i<log.length;i++) {
			 int birth = log[i][0];
			 int death = log[i][1];
			 
			 for(int j=birth;j<death;j++) {
				 lives[j]++;
			 }
		 }
		 
		 int max=0;
		 int year=0;
		 
		 for(int i=0;i<lives.length;i++) {
			 if(max<lives[i]) {
				 max=lives[i];
				 year=i;
			 }
		 }
		 
		 return year;
		 
	 }
}
