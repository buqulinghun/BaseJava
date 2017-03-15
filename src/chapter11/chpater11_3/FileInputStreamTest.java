package chapter11.chpater11_3;
import java.io.*;
import java.nio.charset.Charset;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
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
		// �����ֽ�������

		File file = new File(".");
		System.out.println("path: "+file.getAbsolutePath());

		FileInputStream fis = new FileInputStream(
			"src\\chapter11\\chpater11_3\\FileInputStreamTest.java");

		// ����һ������Ϊ12�ġ���Ͳ��
		//��1������С�����¶Ȱ���ֽ����飬��������
		byte[] bbuf = new byte[12];
		// ���ڱ���ʵ�ʶ�ȡ���ֽ���
		int hasRead = 0;
		// ʹ��ѭ�����ظ���ȡˮ������
		while ((hasRead = fis.read(bbuf)) > 0 )
		{
			// ȡ������Ͳ����ˮ�Σ��ֽڣ������ֽ�����ת�����ַ������룡
			//(2)��ȡ�ı����ʽ�뱣���ļ���ʽ��һ�£�������������
			System.out.print(new String(bbuf , 0 , hasRead , Charset.forName("GBK")));
		}
		// �ر��ļ�������������finally�������ȫ
		fis.close();
	}
}
