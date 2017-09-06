package com.chenxiumei;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo9 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("ch.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		
		/*int len = 0;
		byte[] buff = new byte[4];
		len = fis.read(buff);
		System.out.println(len);
		System.out.println(new String(buff));*/
		int len = 0;
		byte[] buff = new byte[1024];
		
		while ((len = fis.read(buff)) != -1) {
			fos.write(buff, 0, len);			
		}
		
		fos.close();
		fis.close();
	}

}
