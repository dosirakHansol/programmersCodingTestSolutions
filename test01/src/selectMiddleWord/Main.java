package selectMiddleWord;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution("abcdee"));
		
	}
	
	public static String solution(String s) {
		
		int l = s.length();
		
		String answer =  l%2==0 ? s.substring(l/2-1, l/2+1) : s.substring(l/2, l/2+1); 
        
        return answer;
    }

}
