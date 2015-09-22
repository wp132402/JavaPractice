/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * 	|- AgeCheckException
 * 
 * 1. About
 * 2. Date : 2015. 9. 22.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class AgeCheckException extends Exception {
	
	public AgeCheckException(Movie msg) {
		super(msg.getTitle() + "은/는" + msg.getLimitAge() + "세 이상 관람가입니다. ");
	}
}
