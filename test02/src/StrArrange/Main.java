package StrArrange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println(solution("Bxcad"));
		
	}
	
	public static String solution(String str) {
		
		str = str.toLowerCase();
		
//		List<String> strList = new ArrayList<String>();
		
		String[] strArr = new String[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			
			strArr[i] = Character.toString(str.charAt(i));
			
		}
		
		
		Arrays.sort(strArr);
		
		str = "";
		
		for(int i = 0; i < strArr.length; i++) {
			str += strArr[i];
		}
		
        return str;
    }
	
}
