package numSequence;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution(2,5));
		
	}
	
    public static long[] solution(long x, int n) {
    	
    	long[] answer = new long[n];
    	long num = x;
    	
    	for(int i = 0; i < n; ++i) {
    		answer[i] = num;
    		num = num + x;
    	}
    	
        return answer;
    }

}
