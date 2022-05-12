package exam03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sample01 {

	public static void main(String[] args) {
		/*
		 *  Map 계열 컬렉션
		 */
		Map<String, Integer> aMap = new HashMap<String, Integer>();
		aMap.put("a", 100); aMap.put("b", 200); aMap.put("c", 300);	// 두번쨰 b 400이 초기b를 덮어씌움
		aMap.put("d", 100); aMap.put("b", 400); aMap.put("e", 500);
		aMap.put("f", 600); aMap.put("g", 700); aMap.put("h", 800);
		Integer result1 = aMap.put("h", 900);
		//if(result1 != null) {
		//	aMap.put("h",  result1);	// 덮어 씌우기 싫으면 null값이 아닐떄 다시 넣는다고 하면 됨
		//}
		System.out.println(result1 + " " + aMap);	// 키가 중복이면 중복전값을 리턴하고, 후에 덮어씀
		
		result1 = aMap.put("i", 900);
		System.out.println(result1 + " " + aMap);	// i는 기존값이 없어서 null이 뜨고 값에 900이 추가됨
		
		System.out.println("1---------------------------------");
		
		boolean result2;
		result2 = aMap.containsValue(Integer.valueOf(900));
		System.out.println(result2);
		result2 = aMap.containsKey("a");
		System.out.println(result2);
		
		System.out.println("2---------------------------------");
		
		// Entry<String, Integer>	// Key는 String, Value는 integer로 쓴다는거
		Set<Entry<String, Integer>> entrys = aMap.entrySet();
		Iterator<Entry<String, Integer>> iter = entrys.iterator();
		
		while(iter.hasNext()) {
			Entry<String, Integer> entry = iter.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		// 또는
		for(Entry<String, Integer> entry: aMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		for(String s: aMap.keySet()) {
			System.out.print(s + "\t");		// 키값만
		}
		System.out.println();
		for(Integer i: aMap.values()) {
			System.out.print(i + "\t");		// 밸류값만
		}
		System.out.println();
		
		System.out.println("3---------------------------------");
		
		result1 = aMap.get("a");
		System.out.println(result1);	//키가 a인 걸 리턴해라
		
		result1 = aMap.get("k");
		System.out.println(result1);	//키가 k인 건 없으니 null
		result1 = aMap.getOrDefault("k", Integer.valueOf(0));	// k가 없으면 null 아닌 디폴트로 내가 지정한 기본값 쓴다
		System.out.println(result1);	
		
		System.out.println("4---------------------------------");
		
		result1 = aMap.remove("a");
		System.out.println(result1 + " " + aMap);	// result1 = 100 이라서 100나오고 a=100삭제
		
		System.out.println("5---------------------------------");
		
		aMap.remove("b", Integer.valueOf(300));
		System.out.println(aMap);		// b=400인데 300인걸 삭제하라니까 삭제 안함
		aMap.remove("b", Integer.valueOf(400));
		System.out.println(aMap);		// b=400 삭제
	}

}
