package com.chenxiumei;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		//1.�����ֽ������
		FileOutputStream fos = new FileOutputStream("b.txt");
		
		//д��Hello���ֽ�����
		String s = "Hello�Ұ��й�";
		
		//�ַ���ת���ֽ�����
		byte[] bytes = s.getBytes();
		
		fos.write(bytes);
		
		//�ͷ���Դ
		fos.close();
		
	}

}
