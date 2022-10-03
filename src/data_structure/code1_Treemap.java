package data_structure;


import java.util.*;


class code1_Treemap {
	public static void main(String[] args) {
		System.out.println("TreeMap test"); 
		//이진검색형태의 키와 값이 쌍으로 이루어진 데이터형태
		//범위검색이나 정렬에 좋다!
		
		String[] arr = {"a","b","c","a","c","t","t","t","c","t","t"};
		System.out.println("배열원본");
		System.out.println(Arrays.toString(arr));
		
		TreeMap map = new TreeMap();
		
		for (int i=0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				Integer value = (Integer)map.get(arr[i]);
				map.put(arr[i], new Integer(value+1));
			} else {
				map.put(arr[i], new Integer(1));
			}
		}
		
		System.out.println(map);
		System.out.println("기본정렬 : 값의 종류(키), 갯수(값)");
		
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("값의 크기 큰순으로 정렬");
		Set set = map.entrySet();
		//set을 list로 변환
		
		List list = new ArrayList(set);
		System.out.println(list);
		//값 오름차순 정렬
		Collections.sort(list, new ValueAsce());
		System.out.println(list);
		//값 내림차순 정렬
		Collections.sort(list, new ValueDesc());
		System.out.println(list);
	}

	static class ValueAsce implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			if (o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
				Map.Entry e1 = (Map.Entry)o1;
				Map.Entry e2 = (Map.Entry)o2;				
				
				int v1 = ((Integer)e1.getValue()).intValue();
				int v2 = ((Integer)e2.getValue()).intValue();
				//오름차순은     같으면0 크면-1 작으면 1, 
				//내림차순은     같으면0 크면1  작으면 -1, 
				return v1-v2;
			}
			
			return -1;
		}
	}
	static class ValueDesc implements Comparator{
		
		@Override
		public int compare(Object o1, Object o2) {
			if (o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
				Map.Entry e1 = (Map.Entry)o1;
				Map.Entry e2 = (Map.Entry)o2;				
				
				int v1 = ((Integer)e1.getValue()).intValue();
				int v2 = ((Integer)e2.getValue()).intValue();
				//오름차순은     같으면0 크면-1 작으면 1, 
				//내림차순은     같으면0 크면1  작으면 -1, 
				return v2-v1;
			}
			
			return -1;
		}
	}
}





