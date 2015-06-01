/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|- IdolGroup
 * 
 * 1. About
 * 2. Date : 2015. 6. 1.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class IdolGroup {
	public static void main(String[] args) {
		String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};
		String[][] member = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유리", "해리", "소진", "민아"}
		};
		
		for(int i=0;i<idolGroup.length;i++) {
			System.out.println("<< " + idolGroup[i] + " 멤버 >>");
			for(int j=0;j<member[i].length;j++) {
				System.out.println(member[i][j]);
			}
		}
	}
}
