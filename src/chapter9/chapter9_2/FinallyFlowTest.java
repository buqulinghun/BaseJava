package chapter9.chapter9_2;

import java.io.IOException;

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
			// 因为finally块中包含了return语句
			// 所以下面的return语句失去作用
		//	return true;

			throw new IOException("IO 异常");
		//	System.out.println("try块中  关闭IO资源操作");

		}catch(IOException e){
			e.printStackTrace();
		}
		finally
		{

			System.out.println("final块中  关闭IO资源操作");
		//	System.out.println("执行了final块。。。");
		//	return false;
		}*/

		throw new RuntimeException("run time");

	//	System.out.println("test 之后的方法语句");
	}
}

