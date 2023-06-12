package makeSquare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[][] solution(int[][] arr) {
        int max_size = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[max_size][max_size];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }

        return answer;
    }

}
