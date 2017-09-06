package com.homework;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 6.键盘输入10个数，放到集合中
	(1)去除该集合中大于10的数
	(2)将该集合中的数字写入到本地文件number.txt中
 */
public class Test06 {

	public static void main(String[] args) throws IOException {
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("number.txt"));
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("请输入第" + (i+1) + "个整数：");
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
