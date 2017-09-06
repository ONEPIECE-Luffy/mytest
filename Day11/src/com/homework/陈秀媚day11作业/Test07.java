package com.homework;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
7.产生10个1-100的随机数，并放到一个数组中
	(1)把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
	(2)把数组中的数字存放到当前文件夹的number.txt文件中
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
