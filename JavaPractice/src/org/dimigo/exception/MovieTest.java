/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * 	|- MovieTest
 * 
 * 1. About
 * 2. Date : 2015. 9. 22.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class MovieTest {
	public static void main(String[] args) {
		try {
			Movie[] movies = {
					new Movie("앤드맨", 12),
					new Movie("사도", 12),
					new Movie("베테랑", 15)
			};
			int age = 13;
			
			for(Movie movie : movies) {
				try {
					buyTiket(movie, age);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void buyTiket(Movie movie, int age) throws Exception {
		if(movie.getLimitAge() > age) throw new AgeCheckException(movie);
		else System.out.println(movie.getTitle() + " 즐감하세용~~");
	}
}
