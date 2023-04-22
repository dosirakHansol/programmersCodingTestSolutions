package rotateGwalho;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(String s) {
        int answer = 0;
        String newStr = s;

        for (int i = 0; i < s.length(); i++) {
            if (check(newStr)) answer++;
            newStr = newStr.substring(1, s.length()) + newStr.charAt(0);
        }

        return answer;
    }
    static boolean check(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    st.push('(');
                    break;
                case '{':
                    st.push('{');
                    break;
                case '[':
                    st.push('[');
                    break;
                case ')':
                    if (st.isEmpty() || st.peek() != '(') return false;
                    st.pop();
                    break;
                case '}':
                    if (st.isEmpty() || st.peek() != '{') return false;
                    st.pop();
                    break;
                case ']':
                    if (st.isEmpty() || st.peek() != '[') return false;
                    st.pop();
                    break;
            }
        }
        return st.isEmpty();
    }

}
