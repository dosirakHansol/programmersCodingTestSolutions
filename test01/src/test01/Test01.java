package test01;

public class Test01 {

	public static void main(String[] args) {

//		new Test01Class().solution(null, null);
		
		String[] survey = new String[] {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = new int[] {5, 3, 2, 7, 5};
		new Test01Re().solution(survey, choices);
		
	}

}
