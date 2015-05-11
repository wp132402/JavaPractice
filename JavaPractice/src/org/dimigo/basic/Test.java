/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 	|- Test
 * 
 * 1. About
 * 2. Date : 2015. 4. 30.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class Test {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		int sum = 0;
		
		for(int i=0;i<2;i++) {
			for(int j : a) {
				if(j != 4) {
					sum += j;
				}
				else break;
			}
		}
		
		System.out.println(sum);
	}
}
