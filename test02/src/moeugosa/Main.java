package moeugosa;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		System.out.println(solution(arr));

	}
	
	public static int[] solution(int[] answers) {
        int[] answer = {};
        
        int l = answers.length;
        
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int s1, s2, s3;
        s1=0;s2=0;s3=0;
        
        for(int i = 0; i < l; i++) {
        	int as = answers[i];
        	//첫번째 학생 점수
        	if(i < one.length) {
        		if(one[i]==as) s1++;
        	} else {
        		if(one[i%5-1]==as) s1++;
        	}
        	//두번째 학생 점수
        	if(i < two.length) {
        		if(two[i]==as) s2++;
        	} else {
        		if(two[i%8-1]==as) s2++;
        	}
        	//세번째 학생 점수
        	if(i < three.length) {
        		if(three[i]==as) s3++;
        	} else {
        		if(three[i%10-1]==as) s3++;
        	}
        }
        
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       
       if(s1>s2 && s1>s3) {
    	   answer[0] = 1;
       }
        
        return answer;
    }

}
