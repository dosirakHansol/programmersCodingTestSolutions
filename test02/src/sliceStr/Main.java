package sliceStr;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(String s) {
		char first = s.charAt(0);
		int firstNum = 0;
		int diff = 0;
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (firstNum == diff) {
				result++;
				first = s.charAt(i);
			}
			if (s.charAt(i) == first) firstNum++;
			else diff++;
		}
		return result;
	}

}
