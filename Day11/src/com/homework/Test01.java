package com.homework;

import java.io.FileOutputStream;
import java.io.IOException;

//1. 向一个已有的文本文件中中追加内容,要求追加的内容中有换行
public class Test01 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("a.txt",true);
		
		fos.write("\r\n加油".getBytes());
		
		fos.close();
	}

}
