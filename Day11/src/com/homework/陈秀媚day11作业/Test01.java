package com.homework;

import java.io.FileOutputStream;
import java.io.IOException;

//1. ��һ�����е��ı��ļ�����׷������,Ҫ��׷�ӵ��������л���
public class Test01 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("a.txt",true);
		
		fos.write("\r\n����".getBytes());
		
		fos.close();
	}

}
