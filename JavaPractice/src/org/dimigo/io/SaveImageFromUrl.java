/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 * 	|- SaveFromURL
 * 
 * 1. About
 * 2. Date : 2015. 10. 27.
 * </pre>
 * 
 * @author	: 곽민석
 * @version	: 1.0
 */
public class SaveImageFromUrl {
	public static void main(String[] args) {
		String img_url = "http://www.onlifezone.com/files/attach/images/6006007/708/991/014/9953c7b2f25e15c4eefbf44a124b5c4e.jpg";
		
		try {
			URL url = new URL(img_url);
			
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream("files/설현.jpg");
			
			int result;
			
			
			
			// 1바이트씩 읽어오기
			while((result = is.read()) != -1) { 
				os.write(result);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
