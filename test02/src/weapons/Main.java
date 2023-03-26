package weapons;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(int number, int limit, int power) {
		int[] divisor = new int[number + 1];
		int result = 0;

		for (int i = 1; i <= number; i++) {
			for (int n = 1; n <= i / n; n++) {
				if (i % n == 0) {
					if (n * n == i) divisor[i] += 1;
					else divisor[i] += 2;
				}
			}
			result += divisor[i] <= limit ? divisor[i] : power;
		}
		return result;
	}

}
