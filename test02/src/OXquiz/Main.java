package OXquiz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"3 - 4 = -3", "5 + 6 = 11"};
		System.out.println(solution(arr));
	}
	
	public static String[] solution(String[] arr) {
		String[] answer = new String[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			int _sum = 0;
			
			String[] _arr = (arr[i].replaceAll(" ", "")).split("=");
			
			_sum = Integer.parseInt(_arr[1]);
			
			if(_arr[0].contains("+")) {
				int x = Integer.parseInt(_arr[0].split("\\+")[0]);
				int y = Integer.parseInt(_arr[0].split("\\+")[1]);
				sum = x + y;
			} else {
				int x = Integer.parseInt(_arr[0].split("-")[0]);
				int y = Integer.parseInt(_arr[0].split("-")[1]);
				sum = x - y;
			}
			
			if(sum == _sum) answer[i] = "O"; 
			else answer[i] = "X";
		}
		
		return answer;
	}

}
