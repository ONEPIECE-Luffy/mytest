package com.chenxiumei;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * int read(): �Ӵ��������ж�ȡһ�������ֽ�
 * 	
 */
public class Demo6 {

	public static void main(String[] args) throws IOException {
//		FileInputStream fis = new FileInputStream("d.txt");
		
		File file = new File("c.txt");
		FileInputStream fis = new FileInputStream(file);
		
		//2.��ȡһ�� �ֽ�
//		int read = fis.read();
//		System.out.println((char)read);
		int b = 0;
		while((b = fis.read()) != -1) {
			System.out.print((char)b);
		}
		
		//3.�ͷ���Դ
		fis.close();
}
}

