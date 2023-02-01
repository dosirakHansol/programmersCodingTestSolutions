package fibonacciNum;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(solution(3));

	}
	
	public static int solution(int n) {
        int[] pNumArr = new int[n+1];
        
        pNumArr[0] = 0;
        pNumArr[1] = 1;
        pNumArr[2] = 1;
        
        for(int i = 3; i < pNumArr.length; i++) {
        	pNumArr[i] = (pNumArr[i-1] + pNumArr[i-2])%1234567;
        }
        
        return pNumArr[n];
    }

}
