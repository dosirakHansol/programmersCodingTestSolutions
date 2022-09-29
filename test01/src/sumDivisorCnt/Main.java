package sumDivisorCnt;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution(13, 17));
		
	}
	
	public static int solution(int left, int right) {
		
		int answer = 0;
		int[] num = new int[right-left+1];
		
		for(int i = 0; i <= right-left; ++i) {
			num[i] = left + i;
		}
		
		for(int i = 0; i <= right-left; ++i) {
			int cnt = countDivisor(num[i]);
			answer += cnt%2==0 ? num[i] : -num[i];
		}
		
        return answer;
    }
	
	public static int countDivisor(int num) {
		int cnt = 0;
		for(int i = 1; i <= num; ++i) {
			cnt += num%i==0? 1 : 0;
		}
		return cnt;
	}
	

}
