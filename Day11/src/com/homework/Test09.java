package com.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//9.�ӿ���̨��ȡ������ļ�Ŀ¼Ȼ�󽫸�Ŀ¼(������Ŀ¼)�µ�.java�ļ����Ƶ�D:/java�ļ�����,��ͳ��java�ļ��ĸ���.
public class Test09 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������ļ�Ŀ¼��");
		String s = sc.nextLine();
		
		ArrayList<File> list = new ArrayList<File>();
		
		filter(new File(s), list);
		
		int count = list.size();
		
		System.out.println(list);
		
		for (File f : list) {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\java"));
			
			int len = 0;
			byte[] buff = new byte[1024];
			while((len = bis.read(buff)) != -1) {
				bos.write(buff, 0, len);
			}
			bis.close();
			bos.close();
		}
		System.out.println("java�ļ�������" + count);
	}
	
	public static void filter(File file, ArrayList<File> list) {
		JavaFilter jf = new JavaFilter();		
		File[] listFiles = file.listFiles(jf);
		
		for (File f : listFiles) {
			if(f.isDirectory()) {
				filter(f,list);
			} else {
				list.add(f);
			}
		}
	}
	
}


class JavaFilter implements FileFilter {
	@Override
	public boolean accept(File file) {
		if(file.isDirectory() || file.getName().toLowerCase().endsWith(".java")){
			return true;
		}
		return false;
	}	
}
