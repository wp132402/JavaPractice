/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|- JavaPractice
 * 
 * 1. About
 * 2. Date : 2015. 6. 15.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class FamilyMember {
	private static int memberCnt = 0;
	private String memberName;
	
	public FamilyMember(String memberName) {
		this.memberName = memberName;
		this.memberCnt++;
	}
	
	public String getMemberName() {
		return this.memberName;
	}
	
	public static void printMemberCnt() {
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
	}
}
