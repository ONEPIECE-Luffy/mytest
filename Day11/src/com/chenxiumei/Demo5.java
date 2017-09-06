package com.chenxiumei;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 1.有多个异常，用了2个catch去处理
 * 2.怎么处理异常，不能随便乱写
 * 3.close需要放在finally里面
 * 4.
 */
public class Demo5 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("c.txt", true);
			fos.write("dddddd".getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
