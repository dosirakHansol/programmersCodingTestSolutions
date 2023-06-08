package timeArr;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		System.out.println(Arrays.toString(solution(arr)));
	}
	
	public static int[] solution(int[] numbers) {
        return Arrays.stream(numbers)
                .map(num -> num * 2)
                .toArray();
    }

}
