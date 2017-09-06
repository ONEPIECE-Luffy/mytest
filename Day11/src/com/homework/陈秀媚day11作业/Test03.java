package com.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//3. 使用读取和写入字节数组的方式,把一个文件复制另外一个地方
public class Test03 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		
		FileOutputStream fos = new FileOutputStream("d:\\b.txt");
		
		int len = 0;
		byte[] buff = new byte[1024];
		while((len = fis.read(buff)) != -1) {
			fos.write(buff, 0, len);
		}
		
		fis.close();
		fos.close();


	}

}
