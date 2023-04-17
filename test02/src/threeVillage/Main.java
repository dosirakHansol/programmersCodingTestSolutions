package threeVillage;

public class Main {

	public static void main(String[] args) {
		System.out.println("정답 ::: " + solution(15));
	}
	
	public static int solution(int n) {
        int[] arr = new int [n+1];
        int num = 1;
        
        for(int i = 1; i < n+1; i++){
            num = checkValid(num);
            arr[i] = num;
            num++;
        }
        
        return arr[n];
    }
	
	private static int checkValid(int n) {
		if(n%3 == 0 || Integer.toString(n).contains("3")) {
			n = checkValid(n+1);
		}
		return n;
	}

}
