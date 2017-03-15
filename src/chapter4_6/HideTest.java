package chapter4_6;

import java.sql.Driver;

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
class Parent
{
	public String tag = "疯狂Java讲义";         //①
	public void info() {
		System.out.println("I am parent");
	}
}
class Derived extends Parent
{
	//  定义一个私有的tag实例变量来隐藏父类的tag实例变量
	private String tag = "轻量级Java EE企业应用实战";         //②

	public void info(){
		System.out.println("I am driver");
	}
}
public class HideTest
{
	public static void main(String[] args)
	{
		//Derived d = new Derived();
		// 程序不可访问d的私有变量tag，所以下面语句将引起编译错误
		// System.out.println(d.tag);         //③
		// 将d变量显式地向上转型为Parent后，即可访问tag实例变量
		// 程序将输出：“疯狂Java讲义”
		//System.out.println(((Parent)d).tag);         //④

		Parent p = new Derived();
		System.out.println("tag:"+ p.tag);
		p.info();

	}
}
