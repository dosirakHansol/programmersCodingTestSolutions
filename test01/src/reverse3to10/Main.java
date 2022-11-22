package reverse3to10;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution(45));
		
	}
	
	public static int solution(int n) {
		String str = Integer.toString(n, 3);
		StringBuffer sb = new StringBuffer(str);
		String reversedStr = sb.reverse().toString();
		int answer = Integer.parseInt(reversedStr,3);
		
        return answer;
    }
	
	

}
