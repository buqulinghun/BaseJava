package chapter8.chapter8_3;

/**
 * Description:
 * <br/>???: <a href="http://www.crazyit.org">???Java????</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
// ����Shape������Circle
public class Circle extends Shape
{
	// ʵ�ֻ�ͼ�������Դ�ӡ�ַ�����ģ�⻭ͼ����ʵ��
	public void draw(Canvas c)
	{
		System.out.println("�ڻ���" + c + "�ϻ�һ��Բ");
	}

	@Override
	public String toString() {
		return "Circle";
	}
}
