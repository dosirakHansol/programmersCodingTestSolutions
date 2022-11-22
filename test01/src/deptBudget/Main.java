package deptBudget;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = {2,2,3,3};
		System.out.println(solution(arr, 10));
	}

	public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i = 0; i < d.length; ++i) {
        	budget -= d[i];
        	if(budget<0) break;
        	answer ++;
        }
        return answer;
    }
}
