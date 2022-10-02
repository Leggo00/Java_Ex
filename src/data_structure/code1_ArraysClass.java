package data_structure;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class code1_ArraysClass {
	public static void main(String[] args) {
		System.out.println("array test");
		int[] arr1= {1,2,30,5,4,7,8,10,2};
		int[] arr2= {1,2,999,5,4,7,8,10,2};
		Integer[] arr3 = new Integer[arr1.length];
		int[][] arr4= {{1,2,3,4},{1,2,999,5,4,7,8,10,2}};
		//tostring, deepToString
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.deepToString(arr4));
		// 두배열 같은지 비교하기 다차원 배열은 deepEquals
		System.out.println(Arrays.equals(arr1, arr2));
		// 배열복사
		arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.equals(arr1, arr2));
		// 배열 원하는 만큼만 복사
		arr2 = Arrays.copyOfRange(arr1, 5,arr1.length);
		System.out.println(Arrays.toString(arr2));
		// 배열정렬
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		// 리스트로 변환하기 
		List<Object> list = new ArrayList(Arrays.asList(arr2));
		System.out.println("list " + list.toString());
		// 배열 이진탐색 반반나눠서 탐색 , 이진탐색은 sort된 값에서 조회 
		System.out.println( Arrays.binarySearch(arr2,10) );
		
		int i=0;
		for (int a : arr1) {
			arr3[i] = Integer.valueOf(a);
			i++;
		}
		System.out.println("copy Integer: " +Arrays.toString(arr3));
		// 배열정렬 내림차순
		Arrays.sort(arr3, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr3));
		
		// 배열값 특정값으로 초기화
		Arrays.fill(arr2, 100);
		System.out.println(Arrays.toString(arr2));
	}
}
