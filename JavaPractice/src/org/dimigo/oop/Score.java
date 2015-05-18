/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	|- Score
 * 
 * 1. About
 * 2. Date : 2015. 5. 12.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class Score {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		int a1, a2, a3, sum;
		
		System.out.print("국어 점수 입력 => ");
		a1 = scan.nextInt();
		System.out.print("수학 점수 입력 => ");
		a2 = scan.nextInt();
		System.out.print("영어 점수 입력 => ");
		a3 = scan.nextInt();
		System.out.println("\n");
		
		System.out.println("<< 점수 출력 >>");
		sum = a1 + a2 + a3;
		
		str.append("국어 점수 : ").append(a1+" 점\n").append("수학 점수 : ").append(a2+" 점\n").append("영어 점수 : ").append(a3+" 점\n");
		str.append("총점 : ").append(sum + " 점\n").append("평균 : ").append(String.format("%.1f", sum / 3.0) + " 점\n");
		System.out.println(str);
	}
}
