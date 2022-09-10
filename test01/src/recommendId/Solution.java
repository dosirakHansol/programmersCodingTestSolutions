package recommendId;

public class Solution {
	
	/*
	 *  아이디의 길이는 3자 이상 15자 이하여야 합니다.
		아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
		단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.
		
		1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
		2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
		4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
		5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
		6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
		     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
		7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
	 */

	
	//예제 ...!@BaT#*..y.abcdefghijklm
	//기대값 bat.y.abcdefghi
	public String solution(String new_id) {
		
//		new_id = new_id.toLowerCase();
//		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
//		while(new_id.contains("..")) {new_id = new_id.replace("..", ".");}
//		new_id = new_id.replaceAll("^[.]", "");
//		new_id = new_id.replaceAll("[.]$", "");
//		if("".equals(new_id)) new_id = "a";
//		if(new_id.length() > 15) new_id = new_id.substring(0, 15);
//		new_id = new_id.replaceAll("[.]$", "");
//		if(new_id.length() < 3) {
//			char lastC = new_id.charAt(new_id.length()-1);
//			while(new_id.length() < 3) {new_id = new_id + lastC;}
//		}
		String answer = new recommandID(new_id)
				.stepOne()
				.stepTwo()
				.stepThree()
				.stepFour()
				.stepFive()
				.stepSix()
				.stepSeven();
		
		
        return answer;
    }
	
	private static class recommandID {
		private String id;
		
		recommandID(String id){
			this.id = id;
		}
		
		private recommandID stepOne() {
			id = id.toLowerCase();
			return this;
		}
		
		private recommandID stepTwo() {
			id = id.replaceAll("[^a-z0-9-_.]", "");
			return this;
		}
		
		private recommandID stepThree() {
			while(id.contains("..")) {id = id.replace("..", "."); }
			return this;
		}
		
		private recommandID stepFour() {
			id = id.replaceAll("^[.]", "").replaceAll("[.]$", "");
			return this;
		}
		
		private recommandID stepFive() {
			if("".equals(id)) id = "a";
			return this;
		}
		
		private recommandID stepSix() {
			if(id.length() > 15) id = id.substring(0, 15);
			id = id.replaceAll("[.]$", "");
			return this;
		}
		
		private String stepSeven() {
			if(id.length() < 3) {
				char lastC = id.charAt(id.length()-1);
				while(id.length() < 3) {id = id + lastC;}
			}
			return id;
		}
	}
	
}


	
	
























