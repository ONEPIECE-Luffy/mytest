package com.chenxiumei;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 */
public class Demo11 {

	public static void main(String[] args) throws IOException {
		System.out.println("开始复制");
		long start = System.currentTimeMillis();
		//copy01("c.txt", "copy1.txt");
//		copy02("c.txt", "copy2.txt");
//		copy03("c.txt", "copy3.txt");
		copy04("c.txt", "copy45.txt");
		
		long end = System.currentTimeMillis();
		System.out.println("结束复制，耗时：" + (end - start));
	}
	public static void copy01(String source, String target) throws IOException {
		FileInputStream fis = new FileInputStream(source);
		
		FileOutputStream fos = new FileOutputStream(target);
		
		int b = 0;
		while ((b = fis.read()) != -1) {
			fos.write(b);
		}
		fos.close();
		fis.close();
	}
	public static void copy02(String source, String target) throws IOException {
		FileInputStream fis = new FileInputStream(source);
		
		FileOutputStream fos = new FileOutputStream(target);
		
		int len = 0;
		byte[] buff = new byte[1024];
		while ((len = fis.read(buff)) != -1) {
			fos.write(buff, 0, len);
		}
		fos.close();
		fis.close();
	}
	public static void copy03(String source, String target) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c.txt"));
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy3.txt"));
		
		int b = 0;
		while ((b = bis.read()) != -1) {
			bos.write(b);
		}
		bos.close();
		bis.close();
	}
	public static void copy04(String source, String target) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c.txt"));
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy3.txt"));
		
		int len = 0;
		byte[] buff = new byte[1024];
		while ((len = bis.read(buff)) != -1) {
			bos.write(buff, 0, len);
		}
		bos.close();
		bis.close();
	}
	

}
