package NumberSelect;

public class Main {

	public static void main(String[] args) {

		int num = 0;
		System.out.println(solution(num));
		
	}
	
    public static String solution(int num) {
        String answer = "";
        
        if(num%2==0) {
        	answer = "Even";
        } else {
        	answer = "Odd";
        }
        
        return answer;
    }

}
