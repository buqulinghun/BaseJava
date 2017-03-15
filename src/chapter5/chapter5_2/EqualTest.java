package chapter5.chapter5_2;

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
public class EqualTest
{
	public static void main(String[] args)
	{
		int it = 65;
		float fl = 65.0f;
		// �����true
		System.out.println("65��65.0f�Ƿ���ȣ�" + (it == fl));
		char ch = 'A';
		// �����true
		System.out.println("65��'A'�Ƿ���ȣ�" + (it == ch));
		String str1 = new String("hello");
		String str2 = new String("hello");
		// �����false
		System.out.println("str1��str2�Ƿ���ȣ�"
			+ (str1 == str2));
		// �����true
		System.out.println("str1�Ƿ�equals str2��"
			+ (str1.equals(str2)));
	}
}