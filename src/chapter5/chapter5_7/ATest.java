package chapter5.chapter5_7;

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
interface A
{
	void test();
}
public class ATest
{
	public static void main(String[] args)
	{
		int age = 8;
		// �������ٽ��ᵼ�±������
		// ����age�ֲ������������ڲ�������ˣ����age�൱�ڱ�final������
	//	age = 2;// ��
		A a = new A()
		{
			public void test()
			{
				// ��Java 8��ǰ������佫��ʾ����age����ʹ��final����
				// ��Java 8��ʼ�������ڲ��ࡢ�ֲ��ڲ����������ʷ�final�ľֲ�����
				System.out.println(age);
			}
		};
		a.test();
	}
}
