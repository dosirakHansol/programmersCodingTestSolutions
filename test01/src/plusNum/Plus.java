package plusNum;

public class Plus {

	public static void main(String[] args) {

		System.out.println(solution(123));
		
	}
	
    private static int solution(int n) {
        int answer = 0;
        
        String num = Integer.toString(n);
        for(int i = 0; i < num.length(); i++) {
        	answer = answer + (num.charAt(i)-'0'); //charAt에서 아스키코드인 '0'을 빼줘야 자연수로 변환된다.
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }

}
