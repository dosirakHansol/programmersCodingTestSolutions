package specialArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] solution(int[] numlist, int n) {
		List<Integer> nums = new ArrayList<>();
		Arrays.sort(numlist);
		for (int num : numlist) nums.add(num);
		nums.sort((s1, s2) -> Integer.compare(Math.abs(s2 - n), Math.abs(s1 - n)));
		Collections.reverse(nums);
		return nums.stream().mapToInt(num -> num).toArray();
	}

}
