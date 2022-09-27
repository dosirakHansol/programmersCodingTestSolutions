package sumNotExistNum;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,6,7,8,0};
		
		System.out.println(solution(numbers));
		
	}
	
	public static int i;
	
	public static int solution(int[] numbers) {
		
        int answer = 0;
        
        Main m = new Main();
        
        for(i = 1; i < 10; ++i) {
        	answer += Arrays.stream(numbers).anyMatch(x -> x == i) ? 0 : i;
//        	if(!IntStream.of(numbers).anyMatch(x -> x == i)) {
//        		System.out.println(i + "는 없다!");
//        	}
        }
        
        return answer;
    }

}
