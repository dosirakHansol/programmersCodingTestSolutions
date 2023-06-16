package Suneung;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(int[] rank, boolean[] attendance) {
        int a = 0;
        int b = 0;
        int c = 0;
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < attendance.length; i++){
            if(attendance[i]) {
                list.add(i);
            }
        }
        
        
        
        return a * 10000 + b * 100 + c;
    }

}
