/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 * 	|- Music
 * 
 * 1. About
 * 2. Date : 2015. 9. 23.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class Music {
	private String title;
	private String singer;
	
	public Music(String title, String siger) {
		this.title = title;
		this.singer = siger;
	}

	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]"; 
	}
}
