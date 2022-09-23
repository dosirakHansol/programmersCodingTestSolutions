package minimumNum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		int[] arr = {3,2,1,4,3,1};
		
		System.out.println(solution(arr));
		
	}
	
	public static int[] solution(int[] arr) {
		int min = 0;
		List list = new ArrayList();
		
		if(arr.length > 1) {
			
			for(int i = 1; i < arr.length; ++i) {
				
				if(arr[i-1] < arr[i]) {
					min = arr[i-1];
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
				System.out.println(answer[i]);
			}
			
			return answer;
			
		} else {
			int[] answer = {-1};
			return answer;
		}
		
    }

}















