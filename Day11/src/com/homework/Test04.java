package com.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//4. ʹ�ø�Ч����ȡ��д���ַ�����ķ�ʽ,��һ���ı��ļ���������һ���ط�
public class Test04 {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\a.txt"));
		
		int len = 0;
		byte[] buff = new byte[1024];
		while((len = bis.read(buff)) != -1) {
			bos.write(buff, 0, len);
		}
		
		bis.close();
		bos.close();
	}

}
