package twoOfUsPassword;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println(solution("aukks", "wbqd", 5));
	}
	
	public static String solution(String s, String skip, int index) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        char[] arr = s.toCharArray();
        char[] skipArr = skip.toCharArray();

        List<Character> list = new ArrayList<>();
        for (char c : skipArr) {
            list.add(c);
        }

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            int cnt = 0;
            while (cnt < index) {
                ch++;
                if(ch > 'z') {
                    ch = 'a';
                }
                if (list.contains(ch)) {
                    continue;
                }
                cnt++;
            }
            stringBuilder.append(ch);
        }

        answer = stringBuilder.toString();
        return answer;
    }

}
