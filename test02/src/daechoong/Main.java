package daechoong;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int[] solution(String[] keymap, String[] targets) {
	        int[] answer = new int[targets.length];
	        
	        for (int i = 0; i < targets.length; i++) {
	        	int sum = 0;
				for (int j = 0; j < targets[i].length(); j++) {
					int count = press(keymap, targets[i].charAt(j)); // targets[i]의 j번째 문자 쓰기 위해 키를 누르는 최소 횟
					if (count == -1) { // keymap에서 targets[i].charAt(j)를 찾을 수 없으면 -1을 return
						sum = -1; // 목표 문자열을 작성할 수 없으므로 sum에 -1 저장
						break;
					}
					sum += count;
				}
				answer[i] = sum;
			}
	        
	        return answer;
	    }
	    
	    private int press(String[] keymap, char c) {
	    	int min = -1;
	    	for (int i = 0; i < keymap.length; i++) {
	    		for (int j = 0; j < keymap[i].length(); j++) {
					if (keymap[i].charAt(j) == c) {
						if (min == -1) { // c와 같은 문자를 처음 찾았다면(아직 min이 -1로 초기화된 상태라면)
							min = j+1;
						} else if (min > j) { // min이 -1이 아니고, j가 min보다 작다면
							min = j+1;
						}
						break;
					}
				}
			}
	    	
	    	return min;
	    }

}
