/**
 * 
 */
package org.dimigo.thread;

import java.util.Random;

/**
 * <pre>
 * org.dimigo.thread
 * 	|- Runner
 * 
 * 1. About
 * 2. Date : 2015. 11. 4.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class Runner2 implements Runnable{
	private String name;
	
	public Runner2() {
		
	}
	
	public Runner2(String name) {
		this.name = name;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		for(int i = 100;i >= 0;i-=10) {
			int time = new Random().nextInt(1000);
			
			System.out.println(name + " " + i + "미터");
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(name + " 도착");
	}
}
