package com.homework;

import java.io.File;
import java.util.Scanner;

public class One {
	/*
	 * 8.�Ӽ��̽���һ���ļ���·��,ɾ�����ļ��С�
	 */
	public static void main(String[] args){
		// ����ļ��ж���
		File dir = inputFile();
		// ɾ���ļ���
		delete(dir);
	}
	
	/*
	 * �����û������·���ַ��������ļ�����
	 */
	private static File inputFile() {
		// ���������������
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫɾ�����ļ���·����");
		// �����û������·��
		String filePath = sc.nextLine();
		// ����·���ַ��������ļ�����
		File dir = new File(filePath);
		if(!dir.exists()) throw new RuntimeException("��������ļ�·�������ڣ�����");
		// �ж��Ƿ����ļ���
		if(!dir.isDirectory()){
			throw new RuntimeException("�����·�������ļ���·��������");
		}
		return dir;
	}
	
	/*
	 * ɾ���ļ���
	 */
	public static void delete(File dir) {
		// ��ȡ�����ļ�
		File[] files = dir.listFiles();
		// ������Ŀ¼,ɾ����Ŀ¼
		for (File file : files) {
			if (file.isFile()) {
				boolean success = file.delete();
				if (success) {
					System.out.println(file + "ɾ���ɹ�");
				} else {
					System.out.println(file + "ɾ��ʧ��");
				}
			} else {
				// ������ļ��еݹ�ɾ��
				delete(file);
			}
		}

		// ��������˵��,���ļ���Ϊ����.
		boolean success = dir.delete();
		// �ж��Ƿ�ɾ���ɹ�,��Ҫ���ڲ����Լ�д�Ĵ���
		if (success) {
			System.out.println(dir + "�ļ���***ɾ���ɹ�");
		} else {
			System.out.println(dir + "����ʹ��,ɾ��ʧ��");
		}
	}
}