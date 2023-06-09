package reverseStrMany;

public class Main {

	public static void main(String[] args) {
		String myString = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        String result = solution(myString, queries);
        System.out.println(result);
	}
	
	public static String solution(String str ,int[][] queries) {
		int l = str.length();
		
		for(int[] query : queries) {
			int start 	= query[0];
			int end 	= query[1] + 1;
			
			String startStr 	= "";
			String endStr 		= "";
			String revStr 		= new StringBuffer(str.substring(start, end)).reverse().toString();
			
			if(start != 0)	startStr	= str.substring(0, start);
			if(end != l)	endStr		= str.substring(end);

			str = startStr + revStr + endStr;
		}
		
		return str;
	}

}
