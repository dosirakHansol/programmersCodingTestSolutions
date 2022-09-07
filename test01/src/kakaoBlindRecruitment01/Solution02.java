package kakaoBlindRecruitment01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution02 {

//	String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//	String[] report = {"muzi frodo","frodo neo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
//	기대값 : 2,1,1,0
	
	public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        //user 별 신고 당한 횟수
        HashMap<String,Integer> banCnt = new HashMap<String,Integer>();
        //answer에 넣어 줄 값
        HashMap<String,Integer> aCnt = new HashMap<String,Integer>();
        
        //user 별 신고 당한 횟수, answer에 넣어 줄 값 Mapping 처리 (초기값 0)
        for(String il : id_list) {
        	banCnt.put(il, 0);
        	aCnt.put(il, 0);
        }
        
        //report 에서 중복 제거 작업을 먼저 해준다면?
        HashSet hashSet = new HashSet();
        for(String rp : report) {hashSet.add(rp);}
        ArrayList<String> dor = new ArrayList<>(hashSet);
        
        // 첫번째 수정 -> 반복문 하나로 합쳐줌
//        for(String id : id_list) {
//        	for(String d : dor) {
//        		String bun = d.split(" ")[1];
//        		if(bun.equals(id)) {
//        			int bc = banCnt.get(id);
//        			banCnt.put(id, bc + 1);
//        		}
//        	}
//        }
        
        //두번째 수정 전
//        for(String id : id_list) {
//        	for(String d : dor) {
//        		String bun = d.split(" ")[1];
//        		if(bun.equals(id)) {
//        			int bc = banCnt.get(id);
//        			banCnt.put(id, bc + 1);
//        		}
//        	}
//        	int bc = banCnt.get(id);
//        	if(bc>=k) {
//        		for(String d : dor) {
//        			String bun = d.split(" ")[1];
//        			String aun = d.split(" ")[0];
//        			if(bun.equals(id)) {
//        				int ac = aCnt.get(aun);
//        				aCnt.replace(aun, ac+1);
//        			}
//        		}
//        	}
//        }
        
        //세번째 수정 전
        //어차피 중복제거 해줬으니깐 그냥 전체 돌려서 넣어주면됨!
//        for(String d : dor) {
//			String bun = d.split(" ")[1];
//			int cnt = banCnt.get(bun);
//			banCnt.put(bun, cnt + 1);
//    	}
//        
//        for(String id : id_list) {
//        	int bc = banCnt.get(id);
//        	if(bc>=k) {
//        		for(String d : dor) {
//        			String bun = d.split(" ")[1];
//        			String aun = d.split(" ")[0];
//        			if(bun.equals(id)) {
//        				int ac = aCnt.get(aun);
//        				aCnt.replace(aun, ac+1);
//        			}
//        		}
//        	}
//        }
        
        for(String d : dor) {
			String bun = d.split(" ")[1];
			int cnt = banCnt.get(bun);
			banCnt.put(bun, cnt + 1);
    	}
        
        for(String d : dor) {
        	if(banCnt.get(d.split(" ")[1]) >= k) {
				aCnt.replace(d.split(" ")[0], aCnt.get(d.split(" ")[0])+1);
        	}
        }
        
        for(int i = 0; i < id_list.length; i++) {
        	answer[i] = aCnt.get(id_list[i]);
        }
        
        return answer;
    }
	
}
