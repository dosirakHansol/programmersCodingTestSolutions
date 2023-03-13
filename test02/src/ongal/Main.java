package ongal;

public class Main {

	public static void main(String[] args) {

		String[] strArr = {"aya", "yee", "u", "maa", "wyeoo"};
		System.out.println(solution(strArr));
		
	}
	
	public static int solution(String[] babbling) {
		
		int cnt = 0;
		
		for(int i = 0 ; i < babbling.length ; i++){
            String b = babbling[i];
            b = b.replace("aya","___")
            		.replace("ye","__")
            		.replace("woo","___")
            		.replace("ma","__")
            		.replace("_","");
            if("".equals(b)) cnt++;
        }
		
		return cnt;
	}

}
