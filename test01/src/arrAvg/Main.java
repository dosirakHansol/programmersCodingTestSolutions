package arrAvg;

public class Main {

	public static void main(String[] args) {

		int[] x = {1,2,3,4};
	
		System.out.println(solution(x));;
		
	}
	
	    public static double solution(int[] arr) {
	        double answer = 0;
	        
	        for(int i : arr) {answer += i;}
	        answer = answer/arr.length;
	        
	        return answer;
	    }

}
