package kNumber;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static final int NOT_FOUND = -1;
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer,NOT_FOUND);
        Set<Integer> used = new HashSet<>();
        int index = 0;
        for(int num : arr){
            if(!used.contains(num)){
                answer[index++] = num;
                used.add(num);
            }
            if(index >= k){
                break;
            }
        }
        return answer;
    }

}
