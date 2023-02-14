package returnCoke;

public class Main {

	public static void main(String[] args) {
		System.out.println(solution(5,3,11));;
	}
	
	public static int solution(int a, int b, int n) {
		if (n < a) {
            return 0;
        } else {
            int added = (n / a) * b;
            return added + solution(a, b, n % a + added);
        }
    }

}
