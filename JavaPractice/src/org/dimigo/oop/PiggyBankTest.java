/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|- PiggyBankTest
 * 
 * 1. About
 * 2. Date : 2015. 6. 15.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class PiggyBankTest {
	public static void main(String[] args) {
		FamilyMember father = new FamilyMember("아빠");
		FamilyMember mather = new FamilyMember("엄마");
		FamilyMember me = new FamilyMember("나");
		FamilyMember brother = new FamilyMember("남동생");
		
		FamilyMember.printMemberCnt();
		
		PiggyBank.putMoney(father, 10000);
		PiggyBank.putMoney(mather, 5000);
		PiggyBank.putMoney(me, 2000);
		PiggyBank.putMoney(brother, 1000);
		PiggyBank.printBalance();
		PiggyBank.putMoney(me, 1000);
		PiggyBank.printBalance();
	}
}
