package chapter9.chapter9_3;
import java.io.*;

public class ThrowsTest2
{
	public static void main(String[] args)
		throws Exception
	{
		// ��Ϊtest()���������׳�IOException�쳣��
		// ���Ե��ø÷����Ĵ���Ҫô����try...catch���У�
		// Ҫô������һ����throws�����׳��ķ����С�
		test();
	}
	public static void test()throws IOException
	{
		// ��ΪFileInputStream�Ĺ����������׳�IOException�쳣��
		// ���Ե���FileInputStream�Ĵ���Ҫô����try...catch���У�
		// Ҫô������һ����throws�����׳��ķ����С�
		FileInputStream fis = new FileInputStream("a.txt");
	}
}
