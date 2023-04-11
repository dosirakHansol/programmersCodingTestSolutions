package reverseString;

public class Main {

	public static void main(String[] args) {
		System.out.println(solution("jaron"));
	}
	
	public static String solution(String my_string) {
        StringBuffer sb = new StringBuffer();
        
        for(int i = my_string.length() - 1; i > -1 ; i--){
            sb.append(Character.toString(my_string.charAt(i)));
        }
        
        return sb.toString();
    }

}
