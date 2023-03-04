package moeugosa;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(solution(arr)));

	}
	
	public static int[] solution(int[] answers) {
        int l = answers.length;
        
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] score = new int[3];
        
        for(int i = 0; i < l; i++) {
        	int as = answers[i];
        	//첫번째 학생 점수
        	if(i < one.length) {
        		if(one[i]==as) score[0]++;
        	} else {
        		if(one[i%5-1]==as) score[0]++;
        	}
        	//두번째 학생 점수
        	if(i < two.length) {
        		if(two[i]==as) score[1]++;
        	} else {
        		if(two[i%8-1]==as) score[1]++;
        	}
        	//세번째 학생 점수
        	if(i < three.length) {
        		if(three[i]==as) score[2]++;
        	} else {
        		if(three[i%10-1]==as) score[2]++;
        	}
        }
        
       int maxScore = 0;
       
       for(int i = 0; i < 3; i++) {
    	   if(score[i] > maxScore) {maxScore = score[i];
    	   }
	   }
       
       int cnt = 0;
       
       for(int j = 0; j < 3; j++){
           if( score[j] == maxScore ) cnt+=1;
       }
       
       int answer[] = new int[cnt];

       for(int j = 0; j < 3; j++){
           if( score[j] == maxScore )
           answer[cnt++]=j+1;
       }
        
        return answer;
       }

}
