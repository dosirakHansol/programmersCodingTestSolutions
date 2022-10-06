package strangeStr;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution(" t ry hello world      "));
		
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
		
		int x = s.length() - answer.length();
		
		if(s.length() != answer.length()) {
			for(int i = 0; i < x; i++) {
				answer += " ";
			}
		}
		
        return answer;
    }
	
}
