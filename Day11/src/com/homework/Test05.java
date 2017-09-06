package com.homework;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
5.有一个Map集合里面存储的是学生的姓名和年龄，内容如下{张三丰=21, 灭绝师太=38, 柳岩=28, 刘德华=40, 老鬼=36, 王二麻子=38}
	a.将里面的元素用两种遍历方式打印到控制台上
	b.将老鬼的年龄改成66
	c.将年龄大于24的学生姓名，存入到D:\\student.txt中
 */
public class Test05 {

	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("张三丰", 21);
		hm.put("灭绝师太", 38);
		hm.put("柳岩", 28);
		hm.put("刘德华", 40);
		hm.put("老鬼", 36);
		hm.put("王二麻子", 38);
		
		//a.将里面的元素用两种遍历方式打印到控制台上
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
		
		//b.将老鬼的年龄改成66
		hm.put("老鬼", 66);
		
		//c.将年龄大于24的学生姓名，存入到D:\\student.txt中
		
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
