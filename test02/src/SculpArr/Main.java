package SculpArr;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] query = {1, 3, 5};
        int[] result = solution(arr, query);
        System.out.println(Arrays.toString(result));
    }

	public static int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            } else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }

}
