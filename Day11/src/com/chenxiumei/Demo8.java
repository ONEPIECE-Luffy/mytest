package com.chenxiumei;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo8 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("ch.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		
		int b = 0;
		while((b = fis.read()) != -1) {
			fos.write(b);
		}
		
		fis.close();
		fos.close();
	}

}
