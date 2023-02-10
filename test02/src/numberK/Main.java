package numberK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int[][] arrT = {{2,5,3},{4,4,1},{1,7,3}};
		int[] arr = {1,5,2,6,3,7,4};
		System.out.println(solution(arr,arrT).toString());
		
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i : array) list.add(i);
        
        List<Integer> aList = new ArrayList<Integer>();
        
        for(int l = 0; l < commands.length; l++) {
        	List<Integer> rList = new ArrayList<Integer>();
        	
        	int i = commands[l][0];	//자르기 기준 시작
        	int j = commands[l][1];	//자르기 기준 끝
        	int k = commands[l][2];	//k번째 숫자 리턴

        	for(int a = i-1; a < j; a++) rList.add(list.get(a));
        	rList.sort(Comparator.naturalOrder());
        	System.out.println(rList.toString());
        	aList.add(rList.get(k-1));
        }
        
        int[] answer = new int[aList.size()];
        for(int i = 0; i < aList.size(); i++) answer[i] = aList.get(i);
        
        return answer;
    }

}
