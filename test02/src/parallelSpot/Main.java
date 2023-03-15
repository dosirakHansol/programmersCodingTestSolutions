package parallelSpot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		int[][] arr = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
		
		System.out.println(solution(arr));
		
	}
	
	public static int solution(int[][] dots) {
        int answer = 0;
        for(int i =0; i<dots.length;i++) {


                float temp =기울기(dots[i],dots[(i+1)%4]);
                float temp2 =기울기(dots[(i+2)%4],dots[(i+3)%4]);

                if(temp==temp2) {
                    answer = 1;
                }



        }
        return answer;
    }
    public static float 기울기(int[]a1,int[]a2) {
        float 분모,분자;

            분모= a1[0]-a2[0];
            분자= a1[1]-a2[1];

        return 분자/분모;
    }

}
