package blindPhoneNumber;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution("01045"));
		
	}
	
    public static String solution(String phone_number) {
    	
    	if(phone_number.length()>4) {
    		String star = "";
    		for(int i = 0; i < phone_number.length()-4; ++i) {
    			star += "*";
    		}
    		return phone_number.replaceAll("^[0-9]{"+ (phone_number.length()-4) +"}", star);
    	}else {
    		return  phone_number;
    	}
    }

}
