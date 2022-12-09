package correctGwalho;

public class Main {

	public static void main(String[] args) {
		System.out.println(solution("())(()"));
	}
	
	static boolean solution(String s) {
		boolean answer = false;
		
		int cntL = 1;
		int cntR = 0;
		
		if(s.charAt(0)=='(' && s.charAt(s.length()-1)==')') {
			for(int i = 1; i < s.length(); ++i) {
				if(s.charAt(i) == '(') {
					cntL++;
				} else {
					cntR++;
					if ( cntR > cntL ) break;
				}
			}
			answer = cntL == cntR  ? true : false;
		}

		return answer;
	} 
	
}
