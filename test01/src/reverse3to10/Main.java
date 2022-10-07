package reverse3to10;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution(45));
		
	}
	
	public static int solution(int n) {
		
		String str = Integer.toString(n, 3);
		String[] strArr = str.split("");
		ArrayList<String> a = new ArrayList<String>();
		a = (ArrayList<String>) Arrays.asList(strArr);
		
		for(String i : a) {
			System.out.println(i);
		}
		
        int answer = 0;
        return answer;
    }
	
	

}
