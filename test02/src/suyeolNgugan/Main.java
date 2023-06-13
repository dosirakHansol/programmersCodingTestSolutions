package suyeolNgugan;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];
		
		for(int i = 0; i < queries.length; i++) {
			answer[i] = 0;
			int s = queries[i][0];
			int e = queries[i][1];
			int k = queries[i][2];
			
			for(int j = s; j < e+1; j++) {
				int l = arr[j];
				if(l > k) {
					if(answer[i] != 0) {
						if(answer[i] > l) answer[i] = l;						
					} else {
						answer[i] = l;
					}
				}
			}
			
			if(answer[i] == 0) answer[i] = -1;
		}
		
		return answer;
	}

}
