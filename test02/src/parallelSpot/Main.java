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
        
        int l = dots.length;
        
        List<Double> list = new ArrayList<Double>();
        Set<Double> set = new HashSet<Double>();
        
        for(int i = 0; i < l-1; i++) {
        	int x1 = dots[i][0];
        	int y1 = dots[i][1];
        	for(int j = i+1; j < l; j++) {
        		int x2 = dots[j][0];
        		int y2 = dots[j][1];
        		
        		double x = 0;
        		double y = 0;
        		
        		int c = 0;
        		
        		if(x1!=x2 && y1!=y2) {
        			if(x1 > x2){
        				x = x1 - x2;
        				y = y1 - y2;
        			} else {
        				x = x2 - x1;
        				y = y2 - y1;        			
        			}
        			list.add(y/x);
        			set.add(y/x);
        		} else if(x1==x2) {
        			list.add(0.00);
        			set.add(0.00);
        		} else { //y1==y2
        			list.add(0.0);
        			set.add(0.0);
        		}
        	}
        }
        
        int judge = list.size() - set.size();
        
        if(judge == 0) {
        	answer = 0;
        }else {
        	answer = 1;
        }
        
        return answer;
    }

}
