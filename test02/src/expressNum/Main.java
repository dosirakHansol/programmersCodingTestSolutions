package expressNum;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution(15));
		
	}
	
	public static int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i < n+1; i++) {
        	boolean isDone = true;
        	int j = i;
        	int cnt = 1;
        	while(isDone) {
        		if(j>n) isDone = false;
        		else if(j == n) {
        			answer ++;
        			isDone = false;
        		}
        		j += i+cnt;
        		cnt ++;
        	}
        }
        
        return answer;
    }

}
