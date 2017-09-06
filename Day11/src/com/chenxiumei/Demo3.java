package com.chenxiumei;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("c.txt",true);
		
//		fos.write(100);
		byte[] b = {98,99,100,101,102};
		fos.write(b, 2, 3);
		fos.write("Hello".getBytes());
		fos.close();
	}

}
