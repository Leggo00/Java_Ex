package data_structure;


import java.util.*;


class code1_Treeset {
	public static void main(String[] args) {
		System.out.println("Treeset test");
		//중복되지않는 데이터를 허용하지않는 트리형구조.
		int[] arr1= {1,2,30,5,4,7,8,10,2,9,10,11,13,17,20,22};
		TreeSet treeset = new TreeSet();
		
		for (int i=0; i<arr1.length;i++) {
			treeset.add(arr1[i]);
		}
		
		System.out.println("11보다 작은값 " + treeset.headSet(new Integer(11)));
		System.out.println("11보다 큰값 " + treeset.tailSet(new Integer(11)));
		System.out.println("제일작은값 " +  treeset.pollFirst());
		System.out.println("제일큰값 " +  treeset.pollLast());
		System.out.println("제일 가까운 같은 값" + treeset.floor(21));
		System.out.println("작은것들중에 제일가까운값" + treeset.floor(21));
		System.out.println("큰것들중에 제일가까운값" + treeset.higher(21));
		System.out.println("포함여부 " + treeset.contains(22));
		//clone 복제
		//clear 초기화
		//ceiling 같은 객체 반환
		//toArray() 배열ㄹ로반환
		//size 크기 
		//remove 지정된객체삭제
		//first 정렬된 데이터의 첫번쨰 객체
		//last 정렬된 데이터의 마지막 객체
		//treeset.descendingIterator() 역순으로 반환
	}
}




