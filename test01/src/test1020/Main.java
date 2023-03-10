package test1020;

public class Main {

	public static void main(String[] args) {

		test(1);
		
	}
	
	//재귀호출(재귀함수)
	public static void test(int num) {
		if(num>10)return;
		System.out.println(num);
		test(num+1);
	}

}
