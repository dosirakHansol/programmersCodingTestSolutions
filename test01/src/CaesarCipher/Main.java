package CaesarCipher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution("a B y", 1));
		
	}
	public static String solution(String s, int n) {
		String answer = "";
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		for(int i = 0; i < s.length(); ++i) {
			String str = Character.toString(s.charAt(i));
			int numOne = alphabet.indexOf(str); 
			int numTwo = alphabet.indexOf(str.toLowerCase()); 
			if(numOne >= 0) {
				if(numOne + n > 25) answer += Character.toString(alphabet.charAt(n-1-(25-numOne))); 
				else answer += Character.toString(alphabet.charAt(numOne + n));
			}else if(numTwo >= 0){
				if(numTwo + n > 25) answer += Character.toString(alphabet.charAt(n-1-(25-numTwo))).toUpperCase(); 
				else answer += Character.toString(alphabet.charAt(numTwo + n)).toUpperCase();
			}else {
				answer += " ";
			}
		}
        return answer;
    }

}
