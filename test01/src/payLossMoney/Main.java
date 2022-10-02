package payLossMoney;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(solution(3, 20, 4));
		
	}
	
	public static long solution(int price, int money, int count) {
		
		long sum = money;
		
        for(int i = 1; i <= count; ++i) {
        	sum -= price * i;
        }
        
        if(sum >= 0) return 0;
        else return Math.abs(sum); 
        
    }

}
