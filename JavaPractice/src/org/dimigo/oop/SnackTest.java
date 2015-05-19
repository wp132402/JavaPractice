/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|- SnackTest
 * 
 * 1. About
 * 2. Date : 2015. 5. 19.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class SnackTest {
	public static void main(String[] args) {
		Snack[] s1 = {
					new Snack("새우깡", "농심", 1100, 2),
					new	Snack("콘칲", "크라운", 1200, 1),
					new Snack("허니버터칩", "해태", 1500, 4) 
		};
		int sum = 0;
		
		for(Snack s : s1) {
			s.printSnack();
			sum += s.calcPrice();
		}
		
		System.out.println("총 구매 금액 : " + String.format("%,d", sum) + "원");
	}
}
