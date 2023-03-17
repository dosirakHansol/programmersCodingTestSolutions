package GyeopLine;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(int[][] lines) {
        int answer = 0;
        
        for(int i = 0; i < lines.length-1; i++) {
        	for(int j = i+1; j < lines.length; j++) {
        		//시작점 비교
        		if(lines[i][0] > lines[j][0]) {	//뒤에꺼가 더 먼저 시작
        			if(lines[j][1] > lines[i][1]) { //먼저 시작하는 선분이 더 늦게 끝날 때
        				answer += lines[i][1] - lines[i][0];
        			}else {	//먼저 시작하는 선분이 더 빨리 끝날 때
        				if(lines[j][1] > lines[i][0]) {
        					answer += lines[j][1] - lines[i][0];        					
        				}
        			}
        		} else { //앞에꺼가 더 먼저 시작
        			if(lines[i][1] > lines[j][1]) { //먼저 시작하는 선분이 더 늦게 끝날 때
        				answer += lines[j][1] - lines[j][0];
        			}else {	//먼저 시작하는 선분이 더 빨리 끝날 때
        				if(lines[i][1] > lines[j][0]) {
        					answer += lines[i][1] - lines[j][0];
        				}
        			}
        		}
        	}
        }
        
        return answer;
    }

}
