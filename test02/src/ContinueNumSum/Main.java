package ContinueNumSum;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(solution(3, 12)));
	}
	
	public static int[] solution(int num, int total) {
		int[] arr = new int[num];
		int _num = 0;
		while(true) {
			int var = _num + 1;
			int sum = 0;
			
			for(int i = 0; i < num; i++) {
				sum += (total - var - i);
				arr[num-1-i] = (total - var - i);
			}
			
			if(sum == total) break;
			else _num++;
		}
		
		return arr;
	}

}
