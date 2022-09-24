package watermelon;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution(4));
		
	}
	
	public static String solution(int n) {
        String answer = "";
        
        if(n%2==0) {
        	for(int i = 0; i < n/2; ++i) {
        		answer += "수박";
        	}
        } else {
        	for(int i = 0; i < n; ++i) {
        		if(i%2==0) {
        			answer += "수";
        		} else {
        			answer += "박";
        		}
        	}
        }
        
        return answer;
    }

}
