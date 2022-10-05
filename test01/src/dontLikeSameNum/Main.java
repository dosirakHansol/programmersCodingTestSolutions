package dontLikeSameNum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {

		int[] arr = {1,1,3,3,0,1,1};
		for(int i : solution(arr)) {
			System.out.println(i);
		}
		
	}
	
	public static int[] solution(int []arr) {
        
		ArrayList<Integer> deleteDup = new ArrayList<Integer>();
		
        for(int i = 0; i < arr.length; ++i) {
        	if(i != arr.length - 1) {
        		if(arr[i] != arr[i+1]) {
            		deleteDup.add(arr[i]);
            	}
        	} else {
        		deleteDup.add(arr[i]);
        	}
        }
        
        int[] answer = new int[deleteDup.size()];
        for(int i = 0; i < answer.length; ++i) {
        	answer[i] = deleteDup.get(i);
        }

        return answer;
    }

}
