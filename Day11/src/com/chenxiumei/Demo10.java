package com.chenxiumei;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽ������
 * 		OutputStream:
 * 		|--FileOutputStream
 * 		|--FilterOutputStream
 * 			|--BufferedOutputStream
 * BufferedOutputStream:
 * ���췽����
 * 		BufferedOutputStream(OutputStream out);
 * 		BufferedOutputStream(OutputStream out, int size);
 */
public class Demo10 {

	public static void main(String[] args) throws IOException {
//		FileOutputStream fos= new FileOutputStream("c.txt");
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c.txt"));
		bos.write(100);
		bos.close();
	}

}
