package MaxBin;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,3,4};
		System.out.println(solution(arr));

	}

	private static char[] solution(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		String str = "";
		
		for(int i : arr) {
			set.add(i);
			str += i + ",";
		}
		
		int[] numArr = new int[set.size()];
		
		for(int i = 0; i < set.size(); i++) {
			numArr[i] = Collections.frequency(Arrays.asList(arr), 1);
		}
		
		int max = 0;
		
		for(int i : numArr) {
			if(max < i) max = i;
			else if(max == i) {
				max = -1;
				break;
			}
		}
		
		return null;
	}
	
	

}
