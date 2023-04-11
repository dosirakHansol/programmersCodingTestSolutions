package login;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        String accId = id_pw[0];
        String accPwd = id_pw[1];
        
        for(int i = 0; i < db.length; i++){
            boolean idCorrect = accId.equals(db[i][0]);
            if(idCorrect){
                boolean pwdCorrect = accPwd.equals(db[i][1]);
                if(pwdCorrect) answer = "login";
                else answer = "wrong pw";
            }
        }
        
        if("".equals(answer)) answer = "fail";
        
        return answer;
    }

}
