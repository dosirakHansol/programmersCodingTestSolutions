package removeTogether;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		System.out.println(solution("baabaa"));
		System.out.println(solutionStack("baabaa"));
	}

	static int solutionStack(String s) {
	
		int answer = -1;
		
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        answer = (stack.size() == 0) ? 1 : 0;
        return answer;
	}
	
	public static int solution(String s) {

//		boolean loopBool = true;
        
        List<String> sArr = new ArrayList<String>();
        
        for(int i = 0; i < s.length(); i++) sArr.add(Character.toString(s.charAt(i)));
        
		for(int i = 0; i < sArr.size()-1; i++) {
			if(sArr.get(i).equals(sArr.get(i+1))) {
				sArr.remove(i);
				sArr.remove(i);
				i = i == 0 ? i-1 : i-2;
			} else if(i == sArr.size()-2) {
				break;
			}
		}
        	
        
        return sArr.size() > 0 ? 0 : 1;
        
    }

}
