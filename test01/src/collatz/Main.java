package collatz;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution(1));
		
	}
	
    public static int solution(int num) {
        
    	boolean isNotOne = true;
    	int cnt = 0;
    	
    	if(num!=1) {
        	while(isNotOne) {
        		if(cnt!=500) {
        			if(num%2==0) {
        				num = num/2;
        			}else {
        				num = num*3 + 1;
        			}
        			
        			cnt++;
        			
        			if(num==1) {
        				isNotOne = false;
        			}
        		} else {
        			cnt = -1;
        			isNotOne = false;
        		}
        	}
    	}
    	
    	int answer = cnt;
        return answer;
    }
    
}
