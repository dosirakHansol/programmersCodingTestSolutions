package kakaoBlindRecruitment01;

public class Main {

	public static void main(String[] args) {

		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","frodo neo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2 ;
		
		new Solution().solution(id_list, report, k);
		
	}

}
