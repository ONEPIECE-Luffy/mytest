package com.homework;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
7.����10��1-100������������ŵ�һ��������
	(1)�������д��ڵ���10�����ַŵ�һ��list�����У�����ӡ������̨��
	(2)�������е����ִ�ŵ���ǰ�ļ��е�number.txt�ļ���
 */
public class Test07 {

	public static void main(String[] args) throws IOException {
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("number.txt"));
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int[] arr = new int[10];
		
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;						
		}
		for (int i : arr) {
			if(i > 10) {
				list.add(i);
				System.out.println(i);
			}
			bos.write((i + "\r\n").toString().getBytes());
		}
		bos.close();
	}

}
