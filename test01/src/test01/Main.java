package test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		String[] strArr = {"링귀니", "후추", "케첩", "버섯", "바나나"};
		
//		System.out.println(solution(strArr, 1, "바나나"));
		
//		System.out.println(minNum(100,100,0));
		
		//2번문제
		List<Integer> order = new ArrayList<Integer>();
		order.add(1);
		order.add(4);
		order.add(2);
		order.add(3);
		order.add(5);
		System.out.println(getMaximumRemovals(order,"hkbdi","kd"));
		
		
		//3번문제
//		List<Integer> initial_players = new ArrayList<Integer>();
//		initial_players.add(1);
//		initial_players.add(1);
//		initial_players.add(3);
//		
//		List<Integer> new_players = new ArrayList<Integer>();
//		new_players.add(2);
//		new_players.add(2);
//		new_players.add(4);
//		
//		System.out.println(getMinimumHealth(initial_players, new_players, 3));
		
	}
	
	//세번째 문제
	public static long getMinimumHealth(List<Integer> initial_players, List<Integer> new_players, int rank) {
		// initial [1,1,3]
		// new [2,2,4]
		// rank 2
		long totalHealth = initial_players.get(initial_players.size()-rank);
		
		List<Integer> totalRank = new ArrayList<Integer>();
		for(int i : initial_players) {totalRank.add(i);}
		
		for(int i : new_players) {
			totalRank.add(i);
			Collections.sort(totalRank);
			totalHealth += totalRank.get(totalRank.size()-rank);
		}

		
		return totalHealth;

    }

	
	//두번째 문제
	public static int getMaximumRemovals(List<Integer> order, String source, String target) {
	    
		int cnt = 0;
		String[] tArr = target.split("");
		List<String> sList = Arrays.asList(source.split(""));
		boolean isExist = true;
		
		
		while(isExist) {
			for(String s : tArr) {
				if(!sList.contains(s)) {
					isExist = false;
					cnt --;
					break;
				}
			}
			if(isExist != false) {
				sList.set(cnt, "-");
				cnt++;
			}
		}
		
		return cnt;

	}
	
//	public static int solution(String[] strArr, int num, String str) {
//		
//		int answer = 0;
//		int case1, case2;
//		
//		for(int i = 0; i < strArr.length; ++i) {
//			if(strArr[i].equals(str)) {
//				case1 = i < num ? num-i : i-num;
//			}
//		}
//		return answer;
//	}
	
	//1번 문제
//	public static int minNum(int samDaily, int kellyDaily, int difference) {
//		
//		int answer = 0;
//		int samSolved = 0; 
//		int kellySolved = 0;
//		
//		if(samDaily > kellyDaily || (samDaily == kellyDaily && difference == 0)) {
//			answer = -1;
//		} else {
//			while(true) {
//				samSolved += answer == 0 ? samDaily + difference : samDaily;
//				kellySolved += kellyDaily;
//				answer++;
//				if(kellySolved > samSolved) break;
//			}
//			
//		}
//		
//		return answer;
//    }
	
	
	
	

}
