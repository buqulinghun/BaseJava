package chapter9.chapter9_2;

import java.io.IOException;

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
public class FinallyFlowTest
{
	public static void main(String[] args)
		throws Exception
	{
		test();
	}
	public static void  test()
	{
		/*try
		{
			// ��Ϊfinally���а�����return���
			// ���������return���ʧȥ����
		//	return true;

			throw new IOException("IO �쳣");
		//	System.out.println("try����  �ر�IO��Դ����");

		}catch(IOException e){
			e.printStackTrace();
		}
		finally
		{

			System.out.println("final����  �ر�IO��Դ����");
		//	System.out.println("ִ����final�顣����");
		//	return false;
		}*/

		throw new RuntimeException("run time");

	//	System.out.println("test ֮��ķ������");
	}
}

