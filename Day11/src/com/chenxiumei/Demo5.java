package com.chenxiumei;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 1.�ж���쳣������2��catchȥ����
 * 2.��ô�����쳣�����������д
 * 3.close��Ҫ����finally����
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
