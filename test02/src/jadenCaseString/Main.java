package jadenCaseString;

public class Main {

	public static void main(String[] args) {
		System.out.println(solution("3people unFollowed me"));
	}
	
    public static String solution(String s) {
    	s = s.toLowerCase();
    	String[] strArr = s.split("");
    	
    	StringBuffer sb = new StringBuffer();
    	sb.append(strArr[0].toUpperCase());
    	
    	for(int i = 1; i < strArr.length; ++i) {
    		String str = strArr[i];
    		if(strArr[i-1].equals(" ")) sb.append(str.toUpperCase());
    		else sb.append(str);
    	}
        return sb.toString();
    }

}
