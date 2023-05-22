package numberList;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"119", "97674223", "1195524421"};
		System.out.println(solution(strArr));
	}
	
	public static boolean solution(String[] phone_book) {
        
		return !Arrays.stream(phone_book)
				.sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .anyMatch(s -> Arrays.stream(phone_book)
                        .anyMatch(other -> other.contains(s) && !other.equals(s)));
        
    }

}
