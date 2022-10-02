package endoftest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;

import com.sun.source.doctree.SinceTree;
import com.sun.tools.classfile.StackMap_attribute.stack_map_frame;

/*
자료구조 형
 */


class main_collection {
	public static void main(String[] args) {
		int n= 5;
		int[] na= {1,2,3,3,4,5};
		int[] na2 = new int[3];
		
		//Array
		for (int i= 0;i<na2.length;i++) {
			na2[i] = i;
		}
		System.out.println(Arrays.toString(na2));
		
		//ArrayList
		ArrayList<Integer> a = new ArrayList<Integer>() ;
		for (int i= 0;i<10;i++) {
			a.add(i);
		}
		System.out.println("arraylist "  + a.toString()); 
		System.out.println("index " + a.get(0)); 
		System.out.println("index " + a.get(1)); 
		System.out.println("index " + a.get(2)); 
		a.add(1,10);
		System.out.println("arraylist "  + a.toString()); 
		System.out.println("indexOf " + a.indexOf(0)); 
		System.out.println("indexOf " + a.indexOf(1)); 
		System.out.println("indexOf " + a.indexOf(2)); 
		System.out.println("contains?10? " + a.contains(10)); 
		System.out.println("contains?11? " + a.contains(11)); 
		a.remove(3);
		System.out.println(a.toString()); 
		
		
		
		
		/*
		 * 스택
		 * push 넣기
		 * peek 마지막값 확인하기
		 * pop  꺼내기 
		 */
		Stack<String> stack = new Stack<String>();
		//우선수위큐 최댓값 혹은 최소값으로 
		for (int i= 1;i<=10;i++) {
			stack.push(Integer.toString(i));
		}
		System.out.println("stack" + stack.toString());
		System.out.println(stack.peek());
		stack.pop();
		System.out.println("stack pop" + stack.toString());
		stack.remove(3);
		System.out.println("stack remove" + stack.toString());
		stack.remove(0);
		System.out.println("stack remove" + stack.toString());
		
		
		
		System.out.println(stack.peek());
		
		
		//큐
		/*
		 * 큐
		 * LinkedList 로 생성
		 * 
		 * rear >>> data  >>>  front
		 * add : rear로 값 추가
		 * peek : front 데이터 확인
		 * poll - front데이터 삭제하고 확인
		 */
		
		Queue<Integer> que = new LinkedList<Integer>();
		for (int i= 1;i<=10;i++) {
			que.add(i);
		}
		System.out.println("=============que");
		System.out.println("que" + que.toString());
		System.out.println("que peek : " + que.peek());
		
		que.poll();
		System.out.println("poll " + que.toString());
		que.remove(4);
		System.out.println("remove " + que.toString());
		
		
		System.out.println();
		

	}
}
