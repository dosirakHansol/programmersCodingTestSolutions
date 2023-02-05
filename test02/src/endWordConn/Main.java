package endWordConn;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		
		
		System.out.println(solution(3, words));

	}
	
    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        Stack<String> wordStack = new Stack<String>();
        
        for(int i = 0; i < words.length; i++) {
        	
//        	System.out.println("when break? ::: " + i);
        	
        	//첫번째는 검사 해 줄 필요 없음
        	if(i != 0) {
        		//1. 앞사람이 말한 단어의 마지막 문자인지
            	if(words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1)) break;
            	
            	//2. 이전에 등장했던 문자인지
            	if(wordStack.contains(words[i])) break;
        	}
        	
        	//3. 한글자인지
        	if(words[i].length() == 1) break;
        	
        	wordStack.add(words[i]);
        	
//        	System.out.println(wordStack.peek());
        	
        }
        
        int s = wordStack.size();
        
//        System.out.println(s);
//        System.out.println(words.length);
        
        if(s != words.length) {
        	if((s+1)%n == 0) {
        		answer[0] = n; 
        		answer[1] = (s+1)/n;
        	} else {
        		answer[0] = (s+1)%n; 
        		answer[1] = ((s+1)/n)+1;
        	}
//        	System.out.println(answer[0]);
//        	System.out.println(answer[1]);
        } else {
        	answer[0] = 0; 
        	answer[1] = 0;
        }
        
        return answer;
    }
    
    

}
