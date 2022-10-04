package maximumYaksuBaesu;

public class Main {

	public static void main(String[] args) {

		for(int i : solution(3, 12)) {
			System.out.println(i);
		}
		
	}
	
	public static int[] solution(int n, int m) {
		
		int a,b;
		
		if(n > m) {a = m; b = n;} 
		else {a = n; b = m;}
		
		int maxY = 0;
		int minB = 0;
		
		for(int i = 1; i <= a; ++i) {
			if(a%i==0 && b%i==0) {
				maxY = i;
			}
		}
		
		for(int i = 1; i <= a*b; ++i) {
			if(i%a==0 && i%b==0) {
				minB = i;
				break;
			}
		}
		
		
        int[] answer = {maxY, minB};
        return answer;
	}

}
