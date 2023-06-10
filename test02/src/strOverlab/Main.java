package strOverlab;

import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		System.out.println(solution("He11oWor1d","lloWorl",2));
		
	}
	
	public static String solution(String my_string, String overwrite_string, int s) {
        StringBuilder result = new StringBuilder();

        result.append(
                my_string.chars()
                        .limit(s)
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining())
        );

        result.append(overwrite_string);

        result.append(
                my_string.chars()
                        .skip(s + overwrite_string.length())
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining())
        );

        return result.toString();
    }

}
