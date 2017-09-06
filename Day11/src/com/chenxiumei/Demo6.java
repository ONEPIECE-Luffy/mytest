package com.chenxiumei;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * int read(): 从此输入流中读取一个数据字节
 * 	
 */
public class Demo6 {

	public static void main(String[] args) throws IOException {
//		FileInputStream fis = new FileInputStream("d.txt");
		
		File file = new File("c.txt");
		FileInputStream fis = new FileInputStream(file);
		
		//2.读取一个 字节
//		int read = fis.read();
//		System.out.println((char)read);
		int b = 0;
		while((b = fis.read()) != -1) {
			System.out.print((char)b);
		}
		
		//3.释放资源
		fis.close();
}
}

