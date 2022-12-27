package ejinConvert;

public class Main {

	public static void main(String[] args) {
		System.out.println(solution("110010101001"));
	}

	public static int[] solution(String s) {

		int cnt = 0;
		int zeroCnt = 0;
		
		if(s.equals("1")) {
			return new int[]{cnt,zeroCnt};
		} else {
			while(true) {
				int c = s.length();
				
				zeroCnt += c;
				
				s = s.replaceAll("0", "");
				
				c = s.length();
				
				zeroCnt -= c;
				
				s = Integer.toBinaryString(c);
				
				cnt ++;
				
				if(s.equals("1")) break;
			}
			return new int[] {cnt, zeroCnt};
		}
    }
	
}
