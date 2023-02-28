package pokemon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		int[] arr = {3,1,2,3};
		System.out.println(solution(arr));
	}
	
	public static int solution(int[] nums) {
        int answer = 0;        
        int size = nums.length / 2;

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        if(size <= set.size()) {
            answer = size;
        } else {
            answer = set.size();
        }

        return answer;
    }
	
}
