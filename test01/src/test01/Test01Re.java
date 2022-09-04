package test01;

import java.util.HashMap;

public class Test01Re {

	public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        
        // 지표 종류(survey) 1번 RT,TR 2번 CF,FC 3번 JM,MJ 4번 AN.NA
        // 질문 종류(choice, 사용자 입력) 1~7 (4번 0, 1~3번 second char, 5~8 first char)
        // choice 1,7번 3점 / 2,6번 2점 / 3,5번 1점 / 4번 0점
        // survey 길이 :  1~1000 / 원소 : "RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA"
        // choice 길이 == survey 길이 / 원소 : 1~7
        
        // 지표별 점수를 담아 줄 Map 생성
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        result.put("R", 0);
        result.put("T", 0);
        result.put("C", 0);
        result.put("F", 0);
        result.put("J", 0);
        result.put("M", 0);
        result.put("A", 0);
        result.put("N", 0);
        
        
        for(int i = 0; i < survey.length; i++) {
        	
        	int choice = choices[i];
        	
        	// choices 의 원소 값에 따른 점수 추가
        	if(choice < 4) {
        		switch(choice) {
        			case 1 : result.put(survey[i].substring(0,1), result.get(survey[i].substring(0,1))+3); break; 
        			case 2 : result.put(survey[i].substring(0,1), result.get(survey[i].substring(0,1))+2); break;
        			case 3 : result.put(survey[i].substring(0,1), result.get(survey[i].substring(0,1))+1); break;
        		}
        	} else if(choice > 4){
        		switch(choice) {
	    			case 5 : result.put(survey[i].substring(1), result.get(survey[i].substring(1))+1); break; 
	    			case 6 : result.put(survey[i].substring(1), result.get(survey[i].substring(1))+2); break;
	    			case 7 : result.put(survey[i].substring(1), result.get(survey[i].substring(1))+3); break;
	    		}
        	}
        	
        }//for
        
        // 점수를 확인하여 answer에 담아주는 작업
        if(result.get("R") > result.get("T")) {
        	answer = answer + "R";
        } else if(result.get("R") < result.get("T")) {
        	answer = answer + "T";
        } else {
        	answer = answer + "R";
        }
        
        if(result.get("C") > result.get("F")) {
        	answer = answer + "C";
        } else if(result.get("C") < result.get("F")) {
        	answer = answer + "F";
        } else {
        	answer = answer + "C";
        }
        
        if(result.get("M") > result.get("J")) {
        	answer = answer + "M";
        } else if(result.get("M") < result.get("J")) {
        	answer = answer + "J";
        } else {
        	answer = answer + "J";
        }
        
        if(result.get("A") > result.get("N")) {
        	answer = answer + "A";
        } else if(result.get("A") < result.get("N")) {
        	answer = answer + "N";
        } else {
        	answer = answer + "A";
        }
        
        System.out.println(result);
        System.out.println(answer);
        
        return answer;
    }//solution
	
	
}
