package closeAlphabet;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("banana")));
	}
	
	public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if(i == 0) {
        		answer[i] = -1;
        	} else {
        		for(int j = i-1; j >= 0; j--) {
        			char c1 = s.charAt(j);
        			char c2 = s.charAt(i);
        			if(c1 == c2) {
        				answer[i] = i-j;
        				break;
        			} else {
        				if(j==0) {
        					answer[i] = -1;
        				}
        			}
        		}
        	}
        }
        
        return answer;
    }

}
