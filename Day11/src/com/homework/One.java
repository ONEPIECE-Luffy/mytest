package com.homework;

import java.io.File;
import java.util.Scanner;

public class One {
	/*
	 * 8.从键盘接收一个文件夹路径,删除该文件夹。
	 */
	public static void main(String[] args){
		// 获得文件夹对象
		File dir = inputFile();
		// 删除文件夹
		delete(dir);
	}
	
	/*
	 * 根据用户输入的路径字符串创建文件对象
	 */
	private static File inputFile() {
		// 创建键盘输入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要删除的文件夹路径：");
		// 接收用户输入的路径
		String filePath = sc.nextLine();
		// 根据路径字符串创建文件对象
		File dir = new File(filePath);
		if(!dir.exists()) throw new RuntimeException("你输入的文件路径不存在！！！");
		// 判断是否是文件夹
		if(!dir.isDirectory()){
			throw new RuntimeException("输入的路径不是文件夹路径！！！");
		}
		return dir;
	}
	
	/*
	 * 删除文件夹
	 */
	public static void delete(File dir) {
		// 获取所有文件
		File[] files = dir.listFiles();
		// 遍历子目录,删除子目录
		for (File file : files) {
			if (file.isFile()) {
				boolean success = file.delete();
				if (success) {
					System.out.println(file + "删除成功");
				} else {
					System.out.println(file + "删除失败");
				}
			} else {
				// 如果是文件夹递归删除
				delete(file);
			}
		}

		// 来到这里说明,该文件夹为空了.
		boolean success = dir.delete();
		// 判断是否删除成功,主要用于测试自己写的代码
		if (success) {
			System.out.println(dir + "文件夹***删除成功");
		} else {
			System.out.println(dir + "正在使用,删除失败");
		}
	}
}
