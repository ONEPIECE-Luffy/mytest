package com.chenxiumei;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		writeString();
		readString();
	}
	public static void readString() throws IOException {
		FileReader fr = new FileReader("a.txt");
		int ch = 0;
		while((ch = fr.read()) != -1) {
			System.out.println((char)ch);
		}
	}
	public static void writeString() throws IOException {
		//1.���������
		FileWriter fw = new FileWriter("a.txt");
		
		//2.����д��ķ���
		fw.write("Hello");
		
		//3.�ͷ���Դ
		fw.close();
	}

}
