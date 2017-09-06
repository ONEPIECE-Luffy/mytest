package com.homework;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 6.��������10�������ŵ�������
	(1)ȥ���ü����д���10����
	(2)���ü����е�����д�뵽�����ļ�number.txt��
 */
public class Test06 {

	public static void main(String[] args) throws IOException {
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("number.txt"));
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("�������" + (i+1) + "��������");
			int number = sc.nextInt();
			list.add(number);			
		}
		
		
		for (int i = list.size() - 1; i >= 0; i--) {
			int num = list.get(i);
			if(num > 10) {
				list.remove(i);
			}
		}
		
		for (Integer num : list) {
			bos.write((num +"\r\n").toString().getBytes());
		}
		bos.close();
	}

}
