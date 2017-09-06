package com.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//4. 使用高效流读取和写入字符数组的方式,把一个文本文件复制另外一个地方
public class Test04 {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\a.txt"));
		
		int len = 0;
		byte[] buff = new byte[1024];
		while((len = bis.read(buff)) != -1) {
			bos.write(buff, 0, len);
		}
		
		bis.close();
		bos.close();
	}

}
