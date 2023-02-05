package algorithm;

import java.util.Stack;

public class StackStudy {

	public static void main(String[] args) {

		// Stack 인스턴스 생성
		Stack<String> stack = new Stack<String>();
		
		//스택에 값 쌓기
		//스택의 경우 push 하는 순서대로 아래부터 쌓이는 형식
		stack.push("a");
		stack.push("b");
		stack.push("c");
		System.out.println(stack);
		
		//가장 상단 값 출력
		System.out.println(stack.peek());;
		
		//사이즈 출력
		System.out.println(stack.size());
		
		//비었는지
		System.out.println(stack.empty());
		
		//스택에 1 있는지
		System.out.println(stack.contains("a"));
		
		//스택 값 제거
		//값 제거 할때는 맨 위에부터
		stack.pop();
		System.out.println(stack);
		
		//스택 전체 값 제거
		stack.clear();
		System.out.println(stack);
		
	}

}
