package cafet;

public class Main {

	public static void main(String[] args) {
		System.out.println(solution(10,2));
	}
	
	public static int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        int sum = brown + yellow; // 전체 면적
        for(int i = sum/2; i > 2; i--) { // 기본적으로 i = 2이게 되면 yellow가 0이므로 2보다 작을 순 없음.
            if(sum % i == 0 && ((i-2) * (sum / i - 2)) == yellow) {
                    answer[0] = i;
                    answer[1] = sum / i;
                    break;
            }
        }
        return answer;
    }

}
