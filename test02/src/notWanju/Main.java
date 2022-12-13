package notWanju;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] part = {"mislav", "stanko", "mislav", "ana"};
		String[] comp = {"stanko", "ana", "mislav"};
		System.out.println(solution(part, comp));
	}

	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> partMap = new HashMap<>();
        HashMap<String, Integer> compMap = new HashMap<>();

        List<String> compList = Arrays.asList(completion);
        
        int length = participant.length;
        
        for(int i = 0; i < length; ++i) {
        	String str = participant[i];
        	partMap.put(str, 0);
        }
        
        for(int i = 0; i < length; ++i) {
        	String str = participant[i];
        	if(compList.contains(participant[i])) partMap.put(str, partMap.get(str)+1);
        }
        
        for(int i = 0; i < length; ++i) {
        	String str = participant[i];
        	if(partMap.get(str) == 0 || partMap.get(str) > 1) {
        		answer = str;
        	}
        }
        
        return answer;
    }
	
}
