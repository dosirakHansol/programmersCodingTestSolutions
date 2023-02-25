package pickTwoNumPlus;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {5,0,2,7};
		
		System.out.println(Arrays.toString(solution(arr)));
		
	}
	
	public static int[] solution(int[] numbers) {
        
        TreeSet<Integer> set = new TreeSet<Integer>();
        
        for(int i = 0; i < numbers.length-1; i++) {
        	for(int j = i+1; j < numbers.length; j++) {
        		set.add(numbers[i] + numbers[j]);
        	}
        }

        int[] intArr = new int[set.size()];
        Iterator iter = set.iterator();
        
        for(int i = 0; i < set.size(); i++) {
        	intArr[i] = (int) iter.next();
        }
        
//        Arrays.sort(intArr);
        
        int[] answer = new int[intArr.length];
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = intArr[i];
        }
        
        return answer;
    }

}
