package makeArr2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
        int l = 10;
        int r = 100;
        int[] result = solution(l, r);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] solution(int l, int r) {
        List<Integer> resultList = new ArrayList<>();

        for (int num = l; num <= r; num++) {
            if (isOnlyZeroAndFive(num)) {
                resultList.add(num);
            }
        }

        int[] result = {};
        if(resultList.size() != 0) result = new int[resultList.size()];
        else {
        	result = new int[1];
        	result[0] = -1;
        }
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }

    public static boolean isOnlyZeroAndFive(int num) {
        String numString = String.valueOf(num);
        for (char digit : numString.toCharArray()) {
            if (digit != '0' && digit != '5') {
                return false;
            }
        }
        return true;
    }

}
