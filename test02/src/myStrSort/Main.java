package myStrSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		String[] arr = {"a", "b", "c"};
		
		System.out.println(solution(arr, 1));
		
	}
	
	public static String[] solution(String[] strings, int n) {
        
        int l = strings.length;
        
        String[] answer = new String[l];
        
        String[] arr1 = new String[l];
        String[] arr2 = new String[l];
        
        for(int i = 0; i < l; i++) {
        	if(strings[i].length() > 1) {
        		arr1[i] = new StringBuffer(strings[i].substring(0, n+1)).reverse().toString();
        		arr2[i] = strings[i].substring(n);      
        		System.out.println(arr1[i]);
        		System.out.println(arr2[i]);
        	} else {
        		arr1[i] = "";
        		arr2[i] = strings[i];
        	}
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(int i = 0; i < l; i++) {
        	if(strings[i].length() > 1) {
        		answer[i] = new StringBuffer(arr1[i].substring(1)).reverse().toString();
        		answer[i] += arr2[i];
        	} else {
        		answer[i] = arr2[i];
        	}
        	System.out.println(answer[i]);
        }
        
        return answer;
    }

}
