package nArrSlice;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.toString(solution(1000000,20,50)));

	}
	
	public static int[] solution(int n, long left, long right) {
        int cnt = 0;
        int arrCnt = 0;
        int[] answer = new int[(int) (right - left + 1)];
        
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < n+1; j++){
            	if(cnt > right) break;
            	if(cnt >= left && cnt <= right) {
                	answer[arrCnt] = i >= j ? i : j;
                	arrCnt++;
                }
            	cnt++;
            }
        }
        
        return answer;
    }
	
	public static int[] solution2(int n, long left, long right) {

        int[] answer = new int[(int)(right - left) + 1];
        for (int i = 0; i < answer.length; i++) {
            int y = (int)(left / n + 1);
            int x = (int)(left % n + 1);
            left++;
            answer[i] = Math.max(y, x);
        }

        return answer;
    }

}
