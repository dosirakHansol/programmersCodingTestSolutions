package minmaxNum;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println(solution("-1 -2 -3 -4"));
	}
	public static String solution(String s) {
		String[] strArr = s.split(" ");
		int length = strArr.length;
		int[] intArr = new int[length];
		for(int i = 0; i < length; ++i) intArr[i] = Integer.parseInt(strArr[i]);
		Arrays.sort(intArr);
		
		int min = intArr[0];
		int max = intArr[length - 1];

		String answer = min + " " + max;
        return answer;
    }

}
