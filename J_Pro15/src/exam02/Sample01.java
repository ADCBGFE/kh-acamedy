package exam02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Sample01 {

	public static void main(String[] args) {
		/*
		 *  Set 컬렉션
		 */
		Set<Integer> aSet = new HashSet<Integer>();
		
		boolean result1;
		result1 = aSet.add(100);
		System.out.println(result1 + " " + aSet);
		result1 = aSet.add(200);
		System.out.println(result1 + " " + aSet);
		result1 = aSet.add(100);
		System.out.println(result1 + " " + aSet);	// 이미 위에서 추가한거라 false 뜸
		System.out.println("1---------------------------------");
		
		Set<Integer> bSet = new HashSet<Integer>();
		bSet.add(300); bSet.add(400);
		
		result1 = aSet.addAll(bSet);
		System.out.println(result1 + " " + aSet);	// 순서가 뒤죽박죽임.
		System.out.println("2---------------------------------");
		
		List<Integer> cList = new ArrayList<Integer>();
		cList.add(500); cList.add(600); cList.add(100);	// 100은 이미 있어서 추가가 안되고, 하나라도 추가되어서 true 나옴
		
		result1 = aSet.addAll(cList);
		System.out.println(result1 + " " + aSet);
		System.out.println("3---------------------------------");
		
		result1 = aSet.contains(Integer.valueOf(100));
		System.out.println(result1);	// 100이 포함되어 있는가? true
		result1 = aSet.contains(Integer.valueOf(150));
		System.out.println(result1);	// 150이 포함되어 있는가? false
		System.out.println("4---------------------------------");
		
		result1 = aSet.isEmpty();
		System.out.println(result1);	// 빈자리 있음? 없어서 false
		bSet.clear();
		result1 = bSet.isEmpty();
		System.out.println(result1);	// clear로 다 지워서 빈자리 있음 true
		System.out.println("5---------------------------------");
		
		int len = aSet.size();
		System.out.println(len + " " + aSet);	// 6개있음
		System.out.println("6---------------------------------");
		
		result1 = aSet.remove(Integer.valueOf(100));
		System.out.println(result1 + " " + aSet);	// 100있어서 true 지움
		result1 = aSet.remove(Integer.valueOf(150));
		System.out.println(result1 + " " + aSet);	// 150없어서 false 못지움
		System.out.println("7---------------------------------");
		
		Iterator<Integer> iter = aSet.iterator();
		while(iter.hasNext()) {
			Integer i1 = iter.next();
			System.out.print(i1 + "\t");
		}
		System.out.println();
		
		for(Integer i1: aSet) {
			System.out.print(i1 + "\t");
		}
		System.out.println();
		System.out.println("8---------------------------------");
		
		// Set을 List로 변경
		List<Integer> aList = new ArrayList<Integer>(aSet);
		System.out.println(aList);	
		
		ListIterator<Integer> iter1 = aList.listIterator(aList.size() - 1);
		while(iter1.hasPrevious()) {
			Integer data = iter1.previous();
			System.out.println("previous : " + data);
		}
		
		// Set을 List로 변경
		Set<Integer> cSet = new HashSet<Integer>(aList);
		System.out.println(cSet);	
		
		// 배열로 변경
		Integer[] iArr = aList.toArray(new Integer[aList.size()]);
		System.out.println(Arrays.toString(iArr));
		iArr = cSet.toArray(new Integer[cSet.size()]);
		
	}

}
