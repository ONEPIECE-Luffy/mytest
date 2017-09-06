package com.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//2. 使用读取和写入单字节的方式,把一个文件复制另外一个地方
public class Test02 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		
		FileOutputStream fos = new FileOutputStream("d:\\a.txt");
		
		int b = 0;
		while((b = fis.read()) != -1) {
			fos.write(b);
		}
		
		fis.close();
		fos.close();

	}

}
