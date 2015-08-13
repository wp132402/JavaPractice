/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|- Figure
 * 
 * 1. About
 * 2. Date : 2015. 8. 12.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class Figure {
	private int centerX;
	private int centerY;
	
	public Figure() {
		// TODO Auto-generated constructor stub
	}
	
	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea() {
		return 0.0;
	}
}
