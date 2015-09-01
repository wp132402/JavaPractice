/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|- galaxy
 * 
 * 1. About
 * 2. Date : 2015. 8. 26.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class Galaxy extends SmartPhone {
	public Galaxy() {
		
	}
	
	public Galaxy(String model, String company, int price) {
		super(model, company, price);
	}
	
	public void pay() {
		System.out.println("삼성 페이로 결제합니다.");
	}
	
	public void useWierlessCharging() {
		System.out.println("무선 충전 기능을 사용합니다. ");
	}
}
