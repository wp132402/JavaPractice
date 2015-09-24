/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 * 	|- MelonChart
 * 
 * 1. About
 * 2. Date : 2015. 9. 24.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class MelonChart {
	public static void main(String[] args) {
		List<Music> list = new ArrayList<Music>();
		list.add(new Music("바람이나 좀 쐐", "개리"));
		list.add(new Music("보통연애", "박경"));
		list.add(new Music("취향저격", "iKON"));
		
		System.out.println("-- << 멜론 챠트 >> --");
		printList(list);
		
		System.out.println("-- << 2위 곡 추가 >> --");
		list.add(1, new Music("레옹", "이유갓지"));
		printList(list);
		
		System.out.println("-- << 3위 곡 변경 >> --");
		list.set(2, new Music("맙소사", "황태지"));
		printList(list);
		
		System.out.println("-- << 4위 곡 삭제 >> --");
		list.remove(3);
		printList(list);
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		list.retainAll(list);
	}
	
	public static void printList(List<Music> list) {
		for(int i = 0;i < list.size();i++) {
			System.out.print((i + 1) + ". ");
			System.out.println(list.get(i));
		}
		System.out.println();
	}
}
