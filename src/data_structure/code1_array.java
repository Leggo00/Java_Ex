package data_structure;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class code1_array {
	public static void main(String[] args) {
		System.out.println("array test");

		int[] arr1= {1,2,3,5,4,7,8,1,2};
		String[] arr2;
		int[] arr3= new int[]{7,7,7};
		int[][] arr4= {{1,1,1},{2,2,2},{3,3,3,4}};
		
		//출력하기
		System.out.println("arr1 " + Arrays.toString(arr1));
		System.out.println("arr3 " + Arrays.toString(arr3));
		System.out.println("arr4 " + Arrays.toString(arr4[0]));
		System.out.println("arr4 " + Arrays.toString(arr4[1]));
		System.out.println("arr4 " + Arrays.toString(arr4[2]));
		System.out.println(arr4.length);
		System.out.println(arr4[2].length);
		
		arr2 = new String[3];
		arr2[0] = "0";
		arr2[0] = "0";

	}
}




