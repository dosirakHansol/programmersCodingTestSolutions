package kakaoBlindRecruitment01;

import java.util.HashMap;

public class Solution {

    public int[] solution(String[] id_list, String[] report, int k) {
	/*
	 * - 한번에 한명만 신고 가능
	 * - 신고 횟수 제한 X
	 * - 동일한 유저에 대한 신고 시도는 가능하지만 신고 횟수는 1번으로
	 * - k번 이상 신고 된 유저는 게시판 이용 정지 & 해당 유저를 신고한 모든 유저에게 메일 통보
	 *   >> 유저가 신고한 내용 모두 취합 후 마지막에 정지 및 메일 발송
	 * - answer 에는 유저별 메일을 전송 받은 횟수 기재
	 * - [한솔 송이] 의 경우 한솔이가 송이를 신고했단 말
	 * */
    
    	
        int[] answer = new int[id_list.length];
        
        
        // 각 유저별로 누굴 신고 했는지 정리하고
        // >> 중복 신고 체크 해야함
        // 어떤 유저가 몇번 신고 당했는지 정리하고
        // 정지된 유저를 신고한 회원 수 카운트
        
        // answer에 넣어줄 값
        HashMap<String, Integer> aCnt = new HashMap<String, Integer>();
        // key : 유저, value : 신고 당한 횟수 
        HashMap<String, Integer> banCnt = new HashMap<String, Integer>();
        
        // 유저 별 신고 당한 횟수 (초기값 0)
        for(String i : id_list) {
        	banCnt.put(i, 0);
        	aCnt.put(i, 0);
        }
        // 유저 별 신고 한 유저 담아주기
        for(String b : report) {
        	
        	String[] bu = b.split(" ");
        	int bc = banCnt.get(bu[1]);
        	
        	banCnt.put(bu[1], bc + 1);
        	
        }
        
    	
        //중복되는지 검사 
		for(int i = 0; i < report.length; i++) {
			int repOvl = -1;
			for(int j = 0; j < report.length; j++) {
				if(report[i].equals(report[j])) {
					++repOvl;
				}
			}
			if(i>0) {
				if(i==1) {
					if(report[i].equals(report[0])) {
						repOvl = 0;
					}
				} else {
					for(int x = 0; x < i; x++) {
						if(report[i].equals(report[x])) {
							repOvl = 0;
						}
					}
				}
			}
			String[] bu = report[i].split(" ");
			int bc = banCnt.get(bu[1]);
			banCnt.put(bu[1], bc - repOvl);
			
			
		}
    	
		//신고당한 회수 k번 이상이면...
		for(int i = 0; i < id_list.length; i++) {
			if(banCnt.get(id_list[i])>=k) {
				for(int j = 0; j < report.length; j++) {
					if(report[j].split(" ")[1].equals(id_list[i])) {
						int bcnt = aCnt.get(report[j].split(" ")[0]);
						
						if(j>0) {
							if(j==1) {
								if(report[j].equals(report[0])) {
									
								} else {
									aCnt.put(report[j].split(" ")[0], bcnt + 1);
								}
							} else {
								for(int x = 0; x < j; x++) {
									if(report[j].equals(report[x])) {
										
									} else {
										aCnt.put(report[j].split(" ")[0], bcnt + 1);
									}
								}
							}
						} else {
							aCnt.put(report[j].split(" ")[0], bcnt + 1);
						}
						
					}
				}
			}
		}
        
        
        
        for(int i = 0; i < id_list.length; i++) {
        	answer[i] = aCnt.get(id_list[i]);
        }
        
        return answer;
        
    }//solution
	
}//class
















