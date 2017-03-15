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
public class StaticTest
{
	// ����һ���Ǿ�̬���ڲ��࣬��һ������
	private class In{
		void print(){
			System.out.println("I am inner class");
		}
	}
	// �ⲿ��ľ�̬����
	public static void main(String[] args)
	{
		// ����������������쳣����Ϊ��̬��Ա��main()������
		// �޷����ʷǾ�̬��Ա��In�ࣩ
		//new In();
		StaticTest st = new StaticTest();
		StaticTest.In in = st.new In();
		in.print();
	}
}
