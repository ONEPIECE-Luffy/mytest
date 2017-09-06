package com.homework;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
5.��һ��Map��������洢����ѧ�������������䣬��������{������=21, ���ʦ̫=38, ����=28, ���»�=40, �Ϲ�=36, ��������=38}
	a.�������Ԫ�������ֱ�����ʽ��ӡ������̨��
	b.���Ϲ������ĳ�66
	c.���������24��ѧ�����������뵽D:\\student.txt��
 */
public class Test05 {

	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("������", 21);
		hm.put("���ʦ̫", 38);
		hm.put("����", 28);
		hm.put("���»�", 40);
		hm.put("�Ϲ�", 36);
		hm.put("��������", 38);
		
		//a.�������Ԫ�������ֱ�����ʽ��ӡ������̨��
		Set<String> keySet = hm.keySet();
		for (String key : keySet) {
			Integer value = hm.get(key);
			System.out.println(key+ "\t" + value);
		}
		System.out.println("---------------------");
		Set<Entry<String, Integer>> entrySet = hm.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+ "\t" + value);
		}
		
		//b.���Ϲ������ĳ�66
		hm.put("�Ϲ�", 66);
		
		//c.���������24��ѧ�����������뵽D:\\student.txt��
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\student.txt"));
		for (String key : keySet) {
			Integer value = hm.get(key);
			if(value > 24) {
				bos.write((key + "\r\n").getBytes());
			}
		}
		bos.close();
	}

}
