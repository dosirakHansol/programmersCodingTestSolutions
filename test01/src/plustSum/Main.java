package plustSum;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution(3,5));
		
	}
	
    public static long solution(int a, int b) {
    	long answer = 0;
    	
    	if(a!=b) {
    		int x,y;
    		if(a<b) {x = a; y = b;} else {x = b; y = a;}
    		for(int i = x; i < y+1; i++) {answer += i;}
    	} else {answer = a;}
    	
        return answer;
    }

}
