package createSoSu;

public class Main {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4};
		
		System.out.println(solution(arr));
		
	}
	
	private static boolean[] prime = new boolean[3001];

    public static int solution(int[] nums) {
        setPrimeArr();
        int count = 0;
        for(int i = 0; i < nums.length - 2; i++) 
            for(int j = i + 1; j < nums.length - 1; j++) 
                for(int k = j + 1; k < nums.length; k++) 
                    if (!prime[nums[i] + nums[j] + nums[k]]) count++;

        return count;
    }

    private static void setPrimeArr() {
        for(int i = 2; i * i <= 3000; i++)
            for(int j = i; i * j <= 3000; j++)
                prime[i * j] = true;
    }

}
