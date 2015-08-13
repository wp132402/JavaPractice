/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|- Circle
 * 
 * 1. About
 * 2. Date : 2015. 8. 12.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class Circle extends Figure {
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	
	@Override
	protected double calcArea() {
		return Math.PI * radius * radius;
	}
	
	/* (non-Javadoc)
	 * @see org.dimigo.inheritance.Figure#printCenter()
	 */
	@Override
	protected void printCenter() {
		System.out.print("원 ");
		super.printCenter();
	}
}
