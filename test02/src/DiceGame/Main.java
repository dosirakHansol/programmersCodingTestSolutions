package DiceGame;

import java.util.*;

public class Main {

	public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int score = solution(a, b, c, d);
        System.out.println("Score: " + score);
    }
	
	public static int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};

        // 네 주사위의 숫자가 모두 같은 경우
        if (Arrays.stream(dice).distinct().count() == 1) {
            int p = dice[0];
            return 1111 * p;
        }

        // 세 주사위의 숫자가 같고 나머지 한 개의 숫자가 다른 경우
        if (Arrays.stream(dice).distinct().count() == 2) {
            OptionalInt pOptional = Arrays.stream(dice).filter(x -> Arrays.stream(dice).filter(y -> y == x).count() == 3).findFirst();
            OptionalInt qOptional = Arrays.stream(dice).filter(x -> Arrays.stream(dice).filter(y -> y != x).distinct().count() == 1).findFirst();
            if (pOptional.isPresent() && qOptional.isPresent()) {
                int p = pOptional.getAsInt();
                int q = qOptional.getAsInt();
                return (10 * p + q) * (10 * p + q);
            }
        }

        // 주사위가 두 쌍의 같은 숫자로 이루어진 경우
        if (Arrays.stream(dice).distinct().count() == 3) {
            OptionalInt pOptional = Arrays.stream(dice).filter(x -> Arrays.stream(dice).filter(y -> y == x).count() == 2).findFirst();
            OptionalInt qOptional = Arrays.stream(dice).filter(x -> Arrays.stream(dice).filter(y -> y != x).distinct().count() == 2).findFirst();
            if (pOptional.isPresent() && qOptional.isPresent()) {
                int p = pOptional.getAsInt();
                int q = qOptional.getAsInt();
                return (p + q) * Math.abs(p - q);
            }
        }

        // 두 주사위의 숫자가 같고 나머지 두 개의 숫자가 서로 다른 경우
        OptionalInt pOptional = Arrays.stream(dice).filter(x -> Arrays.stream(dice).filter(y -> y == x).count() == 2).findFirst();
        OptionalInt qOptional = Arrays.stream(dice).filter(x -> Arrays.stream(dice).filter(y -> y != x).distinct().count() == 1).findFirst();
        OptionalInt rOptional = Arrays.stream(dice).filter(x -> Arrays.stream(dice).filter(y -> y != x).distinct().count() == 2).findFirst();
        if (pOptional.isPresent() && qOptional.isPresent() && rOptional.isPresent()) {
            int p = pOptional.getAsInt();
            int q = qOptional.getAsInt();
            int r = rOptional.getAsInt();
            return q * r;
        }

        // 네 주사위의 숫자가 모두 다른 경우
        int min = Arrays.stream(dice).min().getAsInt();
        return min;
    }

    

}
