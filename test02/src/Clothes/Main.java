package Clothes;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int solution(String[][] clothes) {
        Map<String, Integer> clothesMap = new HashMap<>();

        // 의상 종류별로 의상의 개수를 맵에 저장
        Arrays.stream(clothes)
                .forEach(c -> clothesMap.put(c[1], clothesMap.getOrDefault(c[1], 0) + 1));

        int answer = 1;

        // 각 의상 종류별로 (의상 개수 + 1)을 곱하여 모든 조합의 수 계산
        for (int count : clothesMap.values()) {
            answer *= (count + 1);
        }

        // 아무것도 입지 않은 경우 1을 빼줌
        return answer - 1;
    }

}
