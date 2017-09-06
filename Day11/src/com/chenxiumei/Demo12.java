package com.chenxiumei;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *^��boolean ^ boolean ��ͬΪfalse����ͬΪtrue
 *
 * һ���ֽ�8λ��������Ҳ����^
 * 		
 * 
 */
public class Demo12 {

	public static void main(String[] args) throws IOException {
		encode("����.txt","abc.txt");
		
	}

	public static void encode(String source, String target) throws IOException {
		//������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target));
		
		int len = 0;
		byte[] buff = new byte[1024];
		while((len = bis.read(buff)) != -1) {
			//�Զ�ȡ�����ֽ��������
			for (int i = 0; i < len; i++) {
				buff[i] = (byte) (buff[i] ^ 3);
			}
			bos.write(buff, 0, len);
		}
		bis.close();
		bos.close();
		
	}
}
