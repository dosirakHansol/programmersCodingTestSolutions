package payLossMoney;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(solution(3, 20, 4));
		
	}
	
	public static long solution(int price, int money, int count) {
        
		Long answer = 0;
		
        for(int i = 1; i <= count; ++i) {
        	money -= price * i;
        }
        
        if(money >= 0) return 0;
        else return Math.abs(money); 
        
    }

}
