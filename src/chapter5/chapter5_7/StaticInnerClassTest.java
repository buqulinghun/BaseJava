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
public class StaticInnerClassTest
{
	private int prop1 = 5;
	private static int prop2 = 9;
	static class StaticInnerClass
	{
		// ��̬�ڲ�������԰�����̬��Ա
		private static int age;
		public void accessOuterProp()
		{
			// ���������ִ���
			// ��̬�ڲ����޷������ⲿ���ʵ������
			//System.out.println(prop1);
			// �����������
			System.out.println(prop2);
		}
	}

	class inner2{
		void test(){
			System.out.println(prop2);
		}
	}

	public void print(){
		new inner2().test();
	}

	public static void main(String[] args) {
		StaticInnerClassTest st =  new StaticInnerClassTest();
		st.print();
	}
}

