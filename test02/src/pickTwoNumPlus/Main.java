package pickTwoNumPlus;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {2,1,3,4,1};
		
		System.out.println(Arrays.toString(solution(arr)));
		
	}
	
	public static int[] solution(int[] numbers) {
        
        HashSet<String> set = new HashSet<String>();
        
        for(int i = 0; i < numbers.length-1; i++) {
        	for(int j = i+1; j < numbers.length; j++) {
        		set.add(Integer.toString(numbers[i] + numbers[j]));
        	}
        }

        String[] strArr = new String[set.size()];
        Iterator iter = set.iterator();
        
        for(int i = 0; i < set.size(); i++) {
        	strArr[i] = (String) iter.next();
        }
        
        Arrays.sort(strArr);
        
        int[] answer = new int[strArr.length];
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = Integer.parseInt(strArr[i]);
        }
        
        return answer;
    }

}
