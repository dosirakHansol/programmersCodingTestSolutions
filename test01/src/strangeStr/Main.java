package strangeStr;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution("  tRy hello  WORLD    "));
		
	}
	
	public static String solution(String s) {
		String answer = "";
		String[] strArr = s.split(" ");
		
		for(int i = 0; i < strArr.length; ++i) {
			ArrayList<String> strList = new ArrayList<String>();
			for(int j = 0; j < strArr[i].length(); ++j) {
				char a = strArr[i].charAt(j);
				if(j%2==0) {
					strList.add(Character.toString(a).toUpperCase());
				} else {
					strList.add(Character.toString(a).toLowerCase());
				}
			}
			for(String k : strList) {
				answer += k;
			}
			if(i != strArr.length-1) {
				answer += " ";
			}
		}
		
		if(s.length() != answer.length()) {
			for(int i = 0; i < s.length() - answer.length(); i++) {
				answer += " ";
			}
		}
		
        return answer;
    }
	
}
