package minStr;

public class Main {

	public static void main(String[] args) {
		System.out.println(solution("3141592", "271"));
	}

    public static int solution(String t, String p) {
        int len = p.length();
        long num = Long.parseLong(p);
        int answer = 0;

        for (int i = 0; i <= t.length() - len; i++) {
            if (Long.parseLong(t.substring(i, i + len)) <= num) {
                answer++;
            }
        }

        return answer;
    }
	
}
