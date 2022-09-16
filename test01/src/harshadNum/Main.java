package harshadNum;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution(11));
		
	}
	
	public static boolean solution(int x) {
        boolean answer = true;
        
        String num = Integer.toString(x);
        int pNum = 0;
        
        for(int i = 0; i < num.length(); ++i) {
        	pNum += (num.charAt(i)-'0');
        }
        
        if(x%pNum!=0) {
        	answer = false;
        }
        
        
        return answer;
    }

}
