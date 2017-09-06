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

//10.�Ӽ��̽��������ļ���·��,������һ���ļ�����(��������)��������һ���ļ�����
public class Test10 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������Դ�ļ�Ŀ¼��");
		String s1 = sc.nextLine();
		
		System.out.println("������Ŀ���ļ�Ŀ¼��");
		String s2 = sc.nextLine();
		
		File source = new File(s1);
		File target = new File(s2);
		
		String s = source.getName();
		copyFile(source, target, s);

	}
	public static void copyFile(File f1, File f2, String s) throws IOException {
		if(!f1.exists() || !f2.exists()) {
			System.out.println("��������ļ�·�������ڣ�����");
			return;
		}
		// �ж��Ƿ����ļ���
		if(!f1.isDirectory() || !f2.isDirectory()) {
			System.out.println("�����·�������ļ���·��������");
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
