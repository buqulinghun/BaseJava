package chapter3;

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
public class ContinueTest2
{
	public static void main(String[] args)
	{
		// ���ѭ��
		outer:
		for (int i = 0 ; i < 3 ; i++ )
		{
			// �ڲ�ѭ��
			for (int j = 0; j < 5 ; j++ )
			{
				System.out.println("i��ֵtestΪ:" + i + "  j��ֵΪ:" + j);
				if (j == 1)
				{
					// ����outer��ǩ��ָ����ѭ���б���ѭ����ʣ����䡣
					continue outer;
				}
			}
		}
	}
}