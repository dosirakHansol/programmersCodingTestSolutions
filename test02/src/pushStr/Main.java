package pushStr;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("hello", "ohell"));
	}
	
	public static int solution(String A, String B) {
        char c = A.charAt(0);
        
        int x = B.indexOf(c);
        
        int answer = Math.abs(0 - x);
        return answer;
    }

}
