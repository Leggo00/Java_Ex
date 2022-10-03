package data_structure;


import java.util.*;


class code1_Hashset {
	public static void main(String[] args) {
		System.out.println("Hashset test");
		//해시는 중복된 값을 저장하지 않는다.
		int[] arr1= {1,2,30,5,4,7,8,10,2,9,10,11,21,20,18};
		Object[] arr;
		Set set = new HashSet();
		Set set2 = new LinkedHashSet();
		
		//비어있는지확인
		System.out.println(set.isEmpty());
		
		for (int i=0; i<arr1.length; i++) {
			set2.add(arr1[i]);
			if (!set.add(arr1[i])){
				System.out.printf("중복된데이터 (%d) : %d %n", i, arr1[i]);
			}
		}
		
		//저장된 데이터 삭제
		set2.remove(11);
		//HashSet은 저장순서를 유지 하지않는다.오름차순으로 정렬된다.
		System.out.println("count " + set.size());
		System.out.println(set);
		//LinkedHashSet은 저장순서를 유지 한다.
		System.out.println(set2);
		//포함여부
		System.out.println(set.contains(7));
		//배열로 변환
		arr = set.toArray();
		System.out.println(Arrays.toString(arr));
		
		//set엔 get이없다 이터레이터로 받아 값을 찾을 수있다.
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			int temp = (int)it.next();
			System.out.println(temp);
			if (temp==18) {
				System.out.println("찾았다! " + temp);
				break;
			}
		}
	}
}




