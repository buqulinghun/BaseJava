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
public class IfCorrectTest
{
	public static void main(String[] args)
	{
	/*	int age = 45;
		if (age > 60)
		{
			System.out.println("������");
		}
		else if (age > 40)
		{
			System.out.println("������");
		}
		else if (age > 20)
		{
			System.out.println("������");
		}*/

	  int i = 0;
	  /*for(;i < 10; i++){
		  if(i == 5)
			  continue;

		  System.out.println("i"+i);
	  }*/

	  while(i < 10){
		  if(i == 5)
			  continue;

		  System.out.println("i"+i);

		  i++;
	  }

	}
}