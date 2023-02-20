package myStrSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		String[] arr = {"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"};
		String[] arr2 = {"sun", "bed", "car"};
		System.out.println(solution(arr, 2));
//		System.out.println(solution(arr2, 1));
		
	}
	
	public static String[] solution(String[] strings, int n) {
		String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }

}
