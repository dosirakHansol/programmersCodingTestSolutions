package findSoSu;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution(10));
		
	}

	public static int solution(int n) {
        int answer = 0;
        
 		ArrayList<Boolean> primeList;

 		primeList = new ArrayList<Boolean>(n+1);
 		primeList.add(false);
 		primeList.add(false);

 		for(int i=2; i<=n; i++ )
 			primeList.add(i, true);

 		for(int i=2; (i*i)<=n; i++){
 			if(primeList.get(i)){
 				for(int j = i*i; j<=n; j+=i) primeList.set(j, false);
 			}
 		}
 		
 		for(int i=0; i<=n; i++){
			if(primeList.get(i) == true) answer++;
		}
        
        return answer;
    }
	
}
