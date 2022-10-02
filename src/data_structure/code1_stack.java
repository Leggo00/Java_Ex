package data_structure;


import java.util.Arrays;
import java.util.Stack;

class code1_stack {
	public static void main(String[] args) {
		System.out.println("stack test");
		//FILO
		Stack<String> stack = new Stack<String>();
		
		// 비어있는지 확인
		System.out.println("stack이 비어있나요? " + stack.empty());
		// 값 집어넣기
		stack.push("item 1 push");
		stack.push("item 2 push");
		System.out.println(stack);
		// 나올 값 확인하기 
		System.out.println(stack.peek());
		// 나올 순서 찾기 : 인덱스는 1부터 시작 
		System.out.println(stack.search("item 1 push"));
		System.out.println(stack.search("item 2 push"));
		// 값 빼기
		stack.pop();
		System.out.println(stack);
	}
}




