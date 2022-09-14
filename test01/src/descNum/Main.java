package descNum;

import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution(1234545));
		
	}
	
    public static long solution(long n) {

    	String num = Long.toString(n);
    	Long[] numArr = new Long[num.length()];
    	String numDesc = "";
    	
    	for(int i = 0; i < num.length(); ++i) {
    		numArr[i] = Long.parseLong(String.valueOf(num.charAt(i)-'0'));
    	}

    	//문자열 배열을 내림 차순으로 정렬
    	Arrays.sort(numArr, Collections.reverseOrder());
    	
    	for(int i = 0; i < num.length(); ++i) {
    		numDesc += numArr[i];
    	}
    	
    	long answer = Long.parseLong(numDesc);
        return answer;
    }
}
