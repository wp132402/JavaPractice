/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|- FigureTest
 * 
 * 1. About
 * 2. Date : 2015. 8. 13.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class FigureTest {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		Triangle t = new Triangle(10, 10, 5, 8);
		Rectangle r = new Rectangle(20, 20, 5, 8);
		
		System.out.print("원의 넓이 : ");
		System.out.printf("%.1f\n", c.calcArea());
		
		System.out.print("삼각형의 넓이 : ");
		System.out.printf("%.1f\n", t.calcArea());
		
		System.out.print("사각형의 넓이 : ");
		System.out.printf("%.1f\n", r.calcArea());
		
		System.out.println();
		c.printCenter();
		t.printCenter();
		r.printCenter();
		
		System.out.println("\n-- 중심좌표 이동 (x, y축 5씩)\n");
		c.moveFigure(5, 5);
		t.moveFigure(5, 5);
		r.moveFigure(5, 5);
		
		c.printCenter();
		t.printCenter();
		r.printCenter();
	}
}
