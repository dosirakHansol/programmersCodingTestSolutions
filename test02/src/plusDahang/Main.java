package plusDahang;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("0"));
	}
	
	public static String solution(String polynomial) {
        int x = 0;
        int c = 0;
        
        String[] strArr = polynomial.split(" \\+ ");
        
        for(String s : strArr) {
        	if(s.contains("x")) {
        		if("x".equals(s)) x ++;
        		else x += Integer.parseInt(s.split("x")[0]); 
        	} else {
        		c += Integer.parseInt(s);
        	}
        }
        
        String strX = x == 0 ? "" : 
        	x != 1 ? x + "x" : "x";
        String strC = c == 0 ? "" : " + " + c;
        
        return strX + strC == "" ? "0" : strX + strC;
    }

}
