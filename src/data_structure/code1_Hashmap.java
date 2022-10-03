package data_structure;


import java.util.*;


class code1_Hashmap {
	public static void main(String[] args) {
		System.out.println("HashMap test"); 
		//key와 value가 짝을 이루는 데이터 타입(entry) 의 배열
		//키값은 중복이 안됨! 키값은 말그대로 키값이기때문.
		HashMap map = new HashMap();
		
		for (int i=1; i<=10; i++) {
			map.put("키" + i, "값" + i);
		}
		
		System.out.println(map);
		//키 존재여부 확인하기
		System.out.println(map.containsKey("키7"));
		//값 존재여부 확인하기
		System.out.println(map.containsValue("값3"));
		//키로 값 받아오기
		System.out.println(map.get("키5"));
		//값 비교하기
		System.out.println(map.get("키5").equals("값7"));
		System.out.println("맵의 크기 : " + map.size());
		//값 변경하기
		map.put("키3", "바꾼값! 희망찬내일@");
		System.out.println(map.get("키3"));
		
		
		//-----------맵은 인덱스가없다 > set 형태로 바꿔서 검색 가능
		//값을 키와값이 결합된 entry 형태로 리턴
		Set set = map.entrySet();
		System.out.println(set);
		//이터레이터로
		Iterator it = set.iterator();
		//
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e);
		}
		
		System.out.println("키 리스트 " + map.keySet());
		System.out.println("값 리스트 " + map.values());
	}
}




