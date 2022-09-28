package descString;

import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));
	}
	
    public static String solution(String s) {
    	
    	String[] strArr = s.split("");
    	Arrays.sort(strArr, Collections.reverseOrder());
    	
    	
        String answer = String.join("", strArr);
        return answer;
    }

}
