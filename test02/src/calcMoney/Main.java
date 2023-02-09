package calcMoney;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int m = 20;
		int[] v = {10,5,1};
		int[] c = {2,3,5};
		calcMoney(m,v,c);
	}
	
	public static void calcMoney(int T, int[] P, int[] N) {
		// 모든 조합을 만든 후에 금액과 일치하는 부분만 return
		
		//모든 조합을 생성하는 반복문
		//동전 종류만큼 돌려주기
		int length = P.length;
		//동전의 총 개수
		int total = N.length;
		for(int i : N) { total += i; }
		
		// 값을 저장 해줄 2차원 배열 생성
		int[][] dp = new int[length][total+1];
		// P의 값과 N(개수) 에 따른 값 저장
		for( int i = 0; i < length; ++i ) {
			dp[i][0] = 0;
			for(int j = 1; j <= N[i]; ++j) {
				dp[i][j] = P[i] * j; 
			}
		}
		
		//모든 경우의 수 출력문으로 저장 (String)
		List<String> strList = new ArrayList<String>();
		// 개수 카운트
		int cnt = 0;
		for(int i = 0; i < length; ++i) {
			String str = T + " = ";
			int cost = 0;
			for(int j = 1; j <= N[i]; ++j) {
				cost = dp[i][j];
				if(cost > T) {
					break;
				}
				else if(cost == T) {
					strList.add(str + P[i] + " X " + j);
					cnt ++;
					str = T + " = ";
				}
				else {
					if(i+1 < length) {
						str += P[i] + " X " + j;
						List findList = findOne(dp, T, P, N, str, i+1, cost);
						if(str != null) {
							strList.addAll(findList);
							str = T + " = ";
						} else {
							str = T + " = ";
						}
					}
				}
			}
		}
		
	}
	
	private static List findOne(int[][] dp, int T, int[] P, int[] N, String str, int i, int cost) {
		List list = new ArrayList();
		for(int j = 1; j <= N[i]; ++j) {
			
			int _cost = cost;
			String _str = str;
			
			
			_cost += dp[i][j];
			
			if(cost > T) {
				continue;
			}else if(_cost == T) {
				_str += " + " + P[i] + " X " + j;
				list.add(_str);
			}else {
				if(i+1 < P.length) {
					_str += " + " + P[i] + " X " + j;
					List findList = findOne(dp, T, P, N, _str, i+1, _cost);
					list.addAll(findList);
				} 
			}
		}
		return list;
	}
	
	
	

}


