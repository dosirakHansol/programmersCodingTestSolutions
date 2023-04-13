package nextNum;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(int[] common) {
        int c1 = common[1] - common[0];
        int c2 = common[2] - common[1];
        
        if(c1 == c2) return common[common.length - 1] + c1;
        else return common[common.length - 1] * (common[1] / common[0]);
    }

}
