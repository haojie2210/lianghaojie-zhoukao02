package com.lianghaojie.comon.utils;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * 
 * @ClassName: StreamUtil 
 * @Description: 流 工具类
 * @author:单击开始
 * @date: 2019年7月16日 上午8:52:42
 */
public class StreamUtil {
	/**
	 * 
	 * @Title: closeAll 
	 * @Description: 方法1：批量关闭流，参数能传无限个,例如传入FileInputStream对象、
	 * JDBC中Connection对象都可以关闭。
	 * @param closeables
	 * @return: void
	 */
	public static void closeAll(Closeable... closeables) {
		if (null != closeables) {
			for (Closeable closeable : closeables) {
				closeables.clone();
			}
		}
	}
	/**
	 * 
	 * @Title: copy 
	 * @Description: 方法2：拷贝流，将InputStream流拷到OutputStream，
	 * 可以用于快速读与文件、上传下载，为了提高性能，需要使用缓冲
	 * @param src
	 * @param out
	 * @param isCloseInputStream
	 * @param isCloseOutputStream
	 * @throws IOException
	 * @return: void
	 */
	public static void copy(InputStream src, OutputStream out, boolean isCloseInputStream, boolean isCloseOutputStream)  throws IOException{
		byte[] b = new byte[1024];
		while(src.read(b) != -1) {
			out.write(b);
		}
	}
	/**
	 * 
	 * @Title: readTextFile 
	 * @Description: 方法3：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容，
	 * 要求方法内部调用上面第2个方法拷贝流，结束后第1个方法关闭流
	 * @param src
	 * @return
	 * @throws IOException
	 * @return: String
	 */
	public static String readTextFile(InputStream src) throws IOException{
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		copy(src, out, false, false);
		closeAll(out, src);
		return out.toString("UTF-8");
	}

	/**
	 * 
	 * @Title: readTextFile 
	 * @Description: 方法4：传入文本文件对象，返回该文件内容(3分)，
	 * 并且要求内部调用上面第3个方法
	 * @param txtFile
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @return: String
	 */
	public static String readTextFile(File txtFile) throws FileNotFoundException, IOException{
		String textFile = readTextFile(new FileInputStream(txtFile));
		return textFile;
	}
	
	/**
	 * 
	 * @Title: readStringFromSystemIn 
	 * @Description: 
	 * 方法5：从控制台读取用户输入的字符串。 参数message：用于控制台提示。
	 * 例如“请输出您的姓名：”，然后用户输入姓名后回车，* 方法开始执行并读取姓名。
	 * @param message
	 * @return
	 * @return: String
	 */
	public static String readStringFromSystemIn(String message){
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		String nextLine = sc.nextLine();
		return nextLine;
	}

	/**
	* 方法6：从控制台读取用户输入的数字。 
	* 参数message：用于控制台提示。例如“请输出您的年龄：”，然后用户输入年龄后回车，* 方法开始执行并读取年龄，如何用户输出的不是数字，或是空值（直接回车），则继续提示输入。
	*/
	public static int readIntFromSystemIn(String message){
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		if (!sc.hasNextInt()){
			return readIntFromSystemIn(message);
		}
		int age = sc.nextInt();
		sc.close();
		return age;
	}

}
