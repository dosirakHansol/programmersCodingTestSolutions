package myWallet;

public class Main {

	public static void main(String[] args) {
		int[][] arr = {
				{60,50},
				{30,70},
				{60,30},
				{80,40}
				};
		System.out.println(solution(arr));
	}
	
	public static int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        
        for(int i = 0; i < sizes.length; i++) {
        	int a = 0;
        	int b = 0;
        	if(sizes[i][0] > sizes[i][1]) {
        		a = sizes[i][0];
        		b = sizes[i][1];
        	} else {
        		a = sizes[i][1];
        		b = sizes[i][0];
        	}
        	if(a > maxW) maxW = a;
        	if(b > maxH) maxH = b;
        }
        
        
        return maxW * maxH;
    }

}
