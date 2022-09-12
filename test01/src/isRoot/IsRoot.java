package isRoot;

public class IsRoot {

	public static void main(String[] args) {

		System.out.println(solution(121));
		
	}
	
    private static long solution(int n) {
    	long answer = -1;
    	
        long x = (long)Math.sqrt(n); //n의 제곱근
        
        if(Math.pow(x, 2) == n) { //x를 실제로 두번 곱했을 때 n이 나오는지 (n의 제곱근이 실수인지 판별)
        	answer = (long)Math.pow(x+1, 2);
        } 
        
        return answer;
    }

}
