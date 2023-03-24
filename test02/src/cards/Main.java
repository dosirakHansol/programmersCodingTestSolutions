package cards;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int one = 0;
        int two = 0;
        
        int i = 0;
        while(i < goal.length) {
        	if (one < cards1.length && goal[i].equals(cards1[one])) {
        		one++;
        	} else if (two < cards2.length && goal[i].equals(cards2[two])) {
        		two++;
        	} else {
        		answer = "No";
        		break;
        	}
        	i++;
        }
        
        return answer;
    }

}
