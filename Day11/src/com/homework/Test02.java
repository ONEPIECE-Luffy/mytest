package com.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//2. ʹ�ö�ȡ��д�뵥�ֽڵķ�ʽ,��һ���ļ���������һ���ط�
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
