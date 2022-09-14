package casePY;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution(""));
		
	}
	
    public static boolean solution(String s) {
        boolean answer = true;

        int pCnt = 0;
        int yCnt = 0;
        
        String str = s.toLowerCase(); // 대소문자 구분 X
        
        for(int i = 0; i < str.length(); ++i) {
        	if(str.charAt(i) == 'p') {
        		pCnt++;
        	} else if(str.charAt(i) == 'y'){
        		yCnt++;
        	}
        }
        
        if(pCnt != yCnt) {
        	answer = false;
        } 

        return answer;
    }
	
}
