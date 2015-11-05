/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * 	|- Race
 * 
 * 1. About
 * 2. Date : 2015. 11. 4.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class Race2 {
	public static void main(String[] args) {
		System.out.println("Start");
		
		Thread t1 = new Runner("어진");
		Thread t2 = new Runner("욱재");
		
		t1.start();
		t2.start();
		
		System.out.println("End");
	}
}
