package helpBoat;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	
		int[] arr = {160, 150, 140, 60, 50, 40};
		
		System.out.println(solution(arr,200));
	
	}
	
	public static int solution(int[] people, int limit) {
		
        int cnt = 0;
        int pCnt = 0;
        
        //오름차순 정렬를 해주면 최소 경우의 수를 구하는데 수월함
        Arrays.sort(people); 
        
        int sum = 0;//합
        
        for(int i = 0; i < people.length; i++) {
        	
        	if(i == people.length - 1) { //마지막 인덱스 처리
        		cnt++;
        		if(pCnt==2) cnt++;
        		break;
        	}
        	
        	sum += people[i];
        	pCnt++;
        	if
        	(
        		pCnt == 2
        		|| limit - sum < people[i+1] 	//limit에서 합을 뺀값이 뒤의 값보다 작으면 안됨
			) 
        	{
        		System.out.println(sum);        		
        		cnt++;
        		pCnt = 0;
        		sum = 0;
        	}


        }
        
        return cnt;
        
    }

}
