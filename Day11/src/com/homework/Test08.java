package com.homework;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

//8.list集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫替换为王小丫,写入到"D:\\stuinfo.txt"
public class Test08 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\stuinfo.txt"));
		
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("二丫");
		list.add("钱六");
		list.add("孙七");
		
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			if(s.equals("二丫")) {
				list.set(i, "王小丫");
			}
		}
		for (String string : list) {
			bos.write((string + "\r\n").getBytes());
		}
		bos.close();

	}

}
