package engNumStr;

public class Main {

	public static void main(String[] args) {
		System.out.println(solution("one4seveneight"));
	}
	
	public static int solution(String s) {

		String[] engArr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i = 0; i < engArr.length; i++) {
        	s = s.replaceAll(engArr[i], Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }

}
