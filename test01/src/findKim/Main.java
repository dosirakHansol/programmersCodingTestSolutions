package findKim;

public class Main {

	public static void main(String[] args) {

		String[] seoul = {"Jane","Kim"};
		
		System.out.println(solution(seoul));
		
	}
	
	public static String solution(String[] seoul) {
		
		int i = 0;
		while(true) {
			if(seoul[i].equals("Kim")) break;
			else i++;
		}
		String location = Integer.toString(i);
		
        String answer = "김서방은 " + location + "에 있다";
        return answer;
    }

}
