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

//9.从控制台获取输入的文件目录然后将该目录(包含子目录)下的.java文件复制到D:/java文件夹中,并统计java文件的个数.
public class Test09 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入文件目录：");
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
		System.out.println("java文件个数：" + count);
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
