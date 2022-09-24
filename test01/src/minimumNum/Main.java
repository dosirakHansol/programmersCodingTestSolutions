package minimumNum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		int[] arr = {1,5,7,3,2,6};
		int[] answer = solution(arr);
//		for(int i = 0; i < solution(arr).length;++i) {
////			System.out.println(answer[i]);
//		}
		
	}
	
	public static int[] solution(int[] arr) {
		int min = arr[0];
		List list = new ArrayList();
		
		if(arr.length > 1) {
			
			for(int i = 1; i < arr.length; ++i) {
				
				if(min < arr[i]) {
					min = min;
				} else {
					min = arr[i];
				}
				
			}
			
			for(int i : arr) {
				if(i != min) {
					list.add(i);
				}
			}
			
			int[] answer = new int[list.size()];
			
			for(int i = 0; i < list.size(); ++i) {
				answer[i] = (int) list.get(i);
			}
			
			return answer;
			
		} else {
			int[] answer = {-1};
			return answer;
		}
		
    }

}















