package chapter3;

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
public class ContinueTest2
{
	public static void main(String[] args)
	{
		// 外层循环
		outer:
		for (int i = 0 ; i < 3 ; i++ )
		{
			// 内层循环
			for (int j = 0; j < 5 ; j++ )
			{
				System.out.println("i的值test为:" + i + "  j的值为:" + j);
				if (j == 1)
				{
					// 忽略outer标签所指定的循环中本次循环所剩下语句。
					continue outer;
				}
			}
		}
	}
}
