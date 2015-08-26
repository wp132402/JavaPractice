/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|- SmartPhoneTest
 * 
 * 1. About
 * 2. Date : 2015. 8. 26.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		IPhone ip = new IPhone("iPhone 6", "애플", 700000);
		Galaxy gp = new Galaxy("갤럭시 S6", "삼성", 650000);
		
		System.out.println(ip);
		ip.turnOn();
		ip.pay();
		ip.useSpecialFunction();
		ip.turnOff();
		
		System.out.println(gp);
		gp.turnOn();
		gp.pay();
		gp.useSpecialFunction();
		gp.turnOff();
	}
}
