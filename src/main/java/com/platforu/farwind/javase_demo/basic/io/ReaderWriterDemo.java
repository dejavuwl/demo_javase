package com.platforu.farwind.javase_demo.basic.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * @author wlsto
 * @created 2020年3月23日
 * @description ReaderWriterDemo.java
 */
public class ReaderWriterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Java中的IO操作
		/*
		 * IO:数据的输入和输出
		 * 输入：从一个数据源读取数据，读取到内存里
		 * 输出：将数据输出到某个位置，文件、网络设备等
		 * 
		 * 流：一个数据的序列
		 * 字符流：处理文本数据 先放到缓存然后从缓存写入文件
		 * 字节流：除了文本数据、图片、音乐、视频等 直接操作文件
		 */
//		reader();
		// writer("你好！");
		scanner();
	}
	
	// 从控制台读取输入字符
	public static void reader() {
		char c = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符，按0退出：");
		do {
			try {
				c = (char)br.read();
				System.out.println(c);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(c!='0');
	}
	
	public static void writer(String str) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			bw.write(str);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void scanner() {
		String str = null;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		System.out.println("输入的字符串：" + str);
		sc.close();
	}

}
