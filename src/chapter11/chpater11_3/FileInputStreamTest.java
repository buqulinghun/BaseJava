package chapter11.chpater11_3;
import java.io.*;
import java.nio.charset.Charset;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class FileInputStreamTest
{
	public static void main(String[] args) throws IOException
	{
		// 创建字节输入流

		File file = new File(".");
		System.out.println("path: "+file.getAbsolutePath());

		FileInputStream fis = new FileInputStream(
			"src\\chapter11\\chpater11_3\\FileInputStreamTest.java");

		// 创建一个长度为12的“竹筒”
		//（1）数组小，导致度半个字节数组，出现乱码
		byte[] bbuf = new byte[12];
		// 用于保存实际读取的字节数
		int hasRead = 0;
		// 使用循环来重复“取水”过程
		while ((hasRead = fis.read(bbuf)) > 0 )
		{
			// 取出“竹筒”中水滴（字节），将字节数组转换成字符串输入！
			//(2)读取的编码格式与保存文件格式不一致，导致乱码问题
			System.out.print(new String(bbuf , 0 , hasRead , Charset.forName("GBK")));
		}
		// 关闭文件输入流，放在finally块里更安全
		fis.close();
	}
}
