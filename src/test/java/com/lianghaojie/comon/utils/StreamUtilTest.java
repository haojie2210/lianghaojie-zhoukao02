package com.lianghaojie.comon.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void test1() throws FileNotFoundException {
		InputStream src = new FileInputStream("D://gitCMS/Hello.txt");
		FileOutputStream out = new FileOutputStream("D:/gitDay05/readme.txt");
		try {
			StreamUtil.copy(src, out , true, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test2() throws IOException {
		InputStream src = new FileInputStream("D://gitCMS/Hello.txt");
		String textFile = StreamUtil.readTextFile(src);
		System.out.println(textFile);
	}
	@Test
	public void test3() throws IOException {
		File src = new File("D://gitCMS/Hello.txt");
		String textFile = StreamUtil.readTextFile(src);
		System.out.println(textFile);
	}
	@Test
	public void test4() throws IOException {
		String str = StreamUtil.readStringFromSystemIn("晴输入您的姓名: ");
		System.out.println("您好: "+str);
	}
	@Test
	public void test5() throws IOException {
		int flag = StreamUtil.readIntFromSystemIn("晴输入您的年龄: ");
		System.out.println("输入的年龄："+flag);
	}
}
