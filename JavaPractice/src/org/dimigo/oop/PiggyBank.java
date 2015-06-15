/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|- PiggyBank
 * 
 * 1. About
 * 2. Date : 2015. 6. 15.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class PiggyBank {
	private static int balance;
	
	public static void putMoney(FamilyMember member, int amount) {
		System.out.println(member.getMemberName()+ " " + amount + "원 넣음");
		balance += amount;
	}
	
	public static void printBalance() {
		System.out.println("돼지저금통 총 금액 : " + balance + "원");
	}
}
