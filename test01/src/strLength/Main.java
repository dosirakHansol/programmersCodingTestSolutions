package strLength;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution("1234"));
		
	}
	
	public static boolean solution(String s) {
		int l = s.length();
		String str = s.replaceAll("[a-zA-Z]", "");
		
		if(s.equals(str) && (l==4 || l==6)) {
			return true;
		} else {
			return false;
		}
		
    }

}
