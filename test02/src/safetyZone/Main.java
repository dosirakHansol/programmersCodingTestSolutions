package safetyZone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(int[][] board) {
        // 지뢰가 있는 칸이 board[i][j] 라고 할 때
        // board[i][j-1], board[i][j], board[i][j+1]
        // board[i-1][j-1], board[i-1][j], board[i-1][j+1]
        // board[i+1][j-1], board[i+1][j], board[i+1][j+1]
        // 총 6칸이 위험지대
        // 예외 i == 0 일땐 i-1의 범위 포함 X, i == board.length 일땐 i+1 의 범위 X
        // 예외 j == 0 일땐 j-1의 범위 포함 X, j == board.length 일땐 j+1 의 범위 X
        int l = board.length;
        int answer = l * l;
        
        int[][] c = new int[l][l];
        
        for(int i = 0; i < l; i++){
            for(int j = 0; j < l; j++){
                int b = board[i][j];
                if(b == 1){
                    boolean iZ = i == 0 ? false : true;
                    boolean jZ = j == 0 ? false : true;
                    boolean iL = i == l-1 ? false : true;
                    boolean jL = j == l-1 ? false : true;
                    
                    if(iZ && jZ) c[i-1][j-1] = 1;
                    if(iZ) c[i-1][j] = 1;
                    if(iZ && jL) c[i-1][j+1] = 1;
                    
                    if(jZ) c[i][j-1] = 1;
                    c[i][j] = 1;
                    if(jL) c[i][j+1] = 1;
                    
                    if(iL && jZ) c[i+1][j-1] = 1;
                    if(iL) c[i+1][j] = 1;
                    if(iL && jL) c[i+1][j+1] = 1;
                }
            }
        }
        
        for(int i = 0; i < l; i++){
            for(int j = 0; j < l; j++){
                int cNum = c[i][j];
                if(cNum == 1){
                   answer--;
                }
            }
        }
        
        return answer;
    }

}
