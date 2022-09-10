package namerge1;

public class main {

	public static void main(String[] args) {

		System.out.println(one(10));
		
	}
	
	private static int one(int n) {
		
		int x = 1;
		
		while(n%x != 1) {x++;}
		
		return x;
	}

}
