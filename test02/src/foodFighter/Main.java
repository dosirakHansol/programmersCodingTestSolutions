package foodFighter;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int[] arr = {1, 7, 1, 2};
		System.out.println(solution(arr));
	}

	public static String solution(int[] food) {
        String answer = "";
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 1; i < food.length; i++) {
        	if(food[i]%2!=0) food[i]--;
        	for(int j = 1; j <= food[i]/2; j++) {
        		list.add(i);
        	}
        }
        
        list.add(0);
        
        for(int i = list.size()-2; i > -1; i--) {
    		list.add(list.get(i));
        }
        
        for(int i = 0; i < list.size(); i++) {
        	answer += list.get(i);
        }
        
		return answer;
    }
	
}
