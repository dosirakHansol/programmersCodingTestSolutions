package drawingHwakdae;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        List<String> list = new ArrayList<String>();
        
        for(int i = 0; i < picture.length; i++) {
        	StringBuffer sb = new StringBuffer();
        	String p = picture[i];
        	
        	for(int j = 0; j < p.length(); j++) {
        		for(int l = 0; l < k; l++) {
        			sb.append(p.charAt(j));        			
        		}
        	}
        	
        	for(int l = 0; l < k; l++) {
    			list.add(sb.toString());        			
    		}
        }
        
        return list.toArray(new String[list.size()]);
    }

}
