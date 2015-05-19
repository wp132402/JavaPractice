/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|- Snack
 * 
 * 1. About
 * 2. Date : 2015. 5. 19.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class Snack {
	private String name, com;
	private int price, number;
	
	public Snack() {
		
	}
	
	/**
	 * @param name
	 * @param com
	 * @param price
	 * @param number
	 */
	public Snack(String name, String com, int price, int number) {
		super();
		this.name = name;
		this.com = com;
		this.price = price;
		this.number = number;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the com
	 */
	public String getCom() {
		return com;
	}
	/**
	 * @param com the com to set
	 */
	public void setCom(String com) {
		this.com = com;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void printSnack() {
		System.out.println("이름 : " + this.name);
		System.out.println("제조사 : " + this.com);
		System.out.println("가격 : " + String.format("%,d", this.price) + "원");
		System.out.println("개수 : " + this.number + "개");
		System.out.println("\n");
	}
	
	public int calcPrice() {
		return this.number * this.price;
	}
}
