package data_structure;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class code1_que {
	public static void main(String[] args) {
		System.out.println("Queue test");
		//FIFO
		Queue<String> que = new LinkedList<String>();
		
		// 값 집어넣기
		que.add("item 1 push");
		que.add("item 2 push");
		System.out.println(que);
		System.out.println(que.offer("item 3 push"));
		System.out.println(que);
		// 나올 값 확인하기 
		System.out.println(que.peek());
		// 값 빼기
		que.poll();
		System.out.println(que);
	}
}




