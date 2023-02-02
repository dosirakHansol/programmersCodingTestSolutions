package nestBigNum;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(solution(78));

	}

	public static int solution(int n) {
        String nTwoStr = Integer.toString(n, 2);
        int oneCnt = 0;
        for(int i = 0; i < nTwoStr.length(); i++) {
        	if(nTwoStr.charAt(i) == '1') oneCnt++;
        }
        
        while(true) {
        	n++;
        	nTwoStr = Integer.toString(n, 2);
        	int nextNumCnt = 0;
        	for(int i = 0; i < nTwoStr.length(); i++) {
            	if(nTwoStr.charAt(i) == '1') nextNumCnt++;
            }
        	if(oneCnt == nextNumCnt) {
        		break;
        	}
        }
        
        return n;
    }
	
}
