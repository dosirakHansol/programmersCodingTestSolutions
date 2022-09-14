package reverseNumArr;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution(12345));
		
	}
	
    public static int[] solution(long n) {
        
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        
        for(int i = 0; i < str.length(); ++i) {
        	answer[i] = (str.charAt(str.length()-1-i) - '0');
        	System.out.println(answer[i]);
        }
        
        return answer;
    }

}
