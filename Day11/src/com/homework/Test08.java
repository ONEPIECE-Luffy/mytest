package com.homework;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

//8.list�����������{����,����,����,��Ѿ,Ǯ��,����},����Ѿ�滻Ϊ��СѾ,д�뵽"D:\\stuinfo.txt"
public class Test08 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\stuinfo.txt"));
		
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("��Ѿ");
		list.add("Ǯ��");
		list.add("����");
		
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			if(s.equals("��Ѿ")) {
				list.set(i, "��СѾ");
			}
		}
		for (String string : list) {
			bos.write((string + "\r\n").getBytes());
		}
		bos.close();

	}

}
