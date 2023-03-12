package gongbae;

public class Main {

	public static void main(String[] args) {

		int[] arr = {2,6,8,14};
		
		System.out.println(solution(arr));
		
	}
	
	public static int solution (int[] arr) {
		
		if (arr.length == 1) {
            return arr[0];
        }

        int gcd = getGCD(arr[0], arr[1]);
        int lcm = (arr[0] * arr[1]) / gcd;

        for (int i = 2; i < arr.length; i++) {
            gcd = getGCD(lcm, arr[i]);
            lcm = (lcm * arr[i]) / gcd;
        }

        System.out.println("the greatest common demoniator : " + gcd);

        return lcm;
    }

    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1 % num2);
    }

}
