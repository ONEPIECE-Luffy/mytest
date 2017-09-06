package com.chenxiumei;
//¸´ÖÆÍ¼Æ¬
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c.txt");
		FileOutputStream fos = new FileOutputStream("copy.txt");
		
		int b = 0;
		while((b = fis.read()) != -1) {
			fos.write(b);
			System.out.print((char)b);
			
		}
		
		fis.close();
		fos.close();
	}

}
