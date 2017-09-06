package com.chenxiumei;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		//1.创建字节输出流
		FileOutputStream fos = new FileOutputStream("b.txt");
		
		//写入Hello的字节数组
		String s = "Hello我爱中国";
		
		//字符串转成字节数组
		byte[] bytes = s.getBytes();
		
		fos.write(bytes);
		
		//释放资源
		fos.close();
		
	}

}
