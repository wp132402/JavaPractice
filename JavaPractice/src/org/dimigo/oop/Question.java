/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	|- Question
 * 
 * 1. About
 * 2. Date : 2015. 5. 11.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class Question {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ans1 = "빅뱅", ans2 = "조인성", ans3 = "자바";
		
		System.out.println("가장 좋아하는 가수는? ");
		if(scan.nextLine().equals(ans1)) System.out.println("정답입니다!! ^^");
		else System.out.println("틀렸습니다!! TT");
		
		System.out.println("가장 좋아하는 배우는? ");
		if(scan.nextLine().equals(ans2)) System.out.println("정답입니다!! ^^");
		else System.out.println("틀렸습니다!! TT");
		
		System.out.println("가장 좋아하는 과목은? ");
		if(scan.nextLine().equals(ans3)) System.out.println("정답입니다!! ^^");
		else System.out.println("틀렸습니다!! TT");
	}
}
