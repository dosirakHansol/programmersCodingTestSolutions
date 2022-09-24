package sumPlusMinus;

public class Main {

	public static void main(String[] args) {

		int[] a = {4,7,12};
		boolean[] s = {true,false,true};
		
		System.out.println(solution(a,s));
		
	}
	
	public static int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		for(int i = 0; i < absolutes.length; ++i) {
			answer += signs[i] == true ? absolutes[i] : -absolutes[i];
		}
		
        return answer;
    }

}
