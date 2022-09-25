package sumNotExistNum;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,6,7,8,0};
		
		System.out.println(solution(numbers));
		
	}
	
	int i = 0;
	
	public static int solution(int[] numbers) {
        int answer = 0;
        Main a = new Main();
        for(int i = 1; i < 11; ++i) {
        	answer += Arrays.stream(numbers).anyMatch(x -> x == a.i) ? 0 : i; 
        }
        
        return answer;
    }

}
