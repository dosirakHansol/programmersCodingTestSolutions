package quoArr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		int[] arr = new int[]{2, 36, 1, 3};
		
		System.out.println(solution(arr, 1));
		
	}
	
	public static int[] solution(int[] arr, int divisor) {
		
		int[] _answer = new int[] {-1};
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; ++i) {
			if(arr[i]%divisor==0) {
				list.add(arr[i]);
			}
		}
		if(list.size()!=0) {
			int[] answer = new int[list.size()];
			
			for(int i = 0; i < list.size(); ++i) {
				answer[i] = list.get(i);
			}
			
			Arrays.sort(answer);
			
			for(int i : answer) {
				System.out.println(i);
			}
			
			return answer;
		} else {
			System.out.println(_answer[0]);
			return _answer;
		}
		
    }

}
