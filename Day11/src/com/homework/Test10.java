package com.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//10.从键盘接收两个文件夹路径,把其中一个文件夹中(包含内容)拷贝到另一个文件夹中
public class Test10 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入源文件目录：");
		String s1 = sc.nextLine();
		
		System.out.println("请输入目的文件目录：");
		String s2 = sc.nextLine();
		
		File source = new File(s1);
		File target = new File(s2);
		
		String s = source.getName();
		copyFile(source, target, s);

	}
	public static void copyFile(File f1, File f2, String s) throws IOException {
		if(!f1.exists() || !f2.exists()) {
			System.out.println("你输入的文件路径不存在！！！");
			return;
		}
		// 判断是否是文件夹
		if(!f1.isDirectory() || !f2.isDirectory()) {
			System.out.println("输入的路径不是文件夹路径！！！");
			return;
		}
		String s1 = f1.getPath().substring(f1.getPath().indexOf(s));
		String s2 = f2.getPath() + "\\" + s1;
		
		
		File file = new File(s2);
		file.mkdir();
		File[] listFiles = f1.listFiles();
		for (File f : listFiles) {
			if(f.isDirectory()) {
				copyFile(f, f2, s);
			} else {
				
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f1));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(s2 + "\\" + f.getName()));
				
				int len = 0;
				byte[] buff = new byte[1024];
				while((len = bis.read(buff)) != -1) {
					bos.write(buff, 0, len);
				}
				bis.close();
				bos.close();
			}
		}
	}

}
