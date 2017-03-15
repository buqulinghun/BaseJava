package chapter5.chapter5_9;

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
public class Season
{
	// ��Season�ඨ��ɲ��ɱ�ģ������Ա����Ҳ�����final��
	private final String name;
	private final String desc;
	public static final Season SPRING
		= new Season("����" , "�ô�̤��");
	public static final Season SUMMER
		= new Season("����" , "��������");
	public static final Season FALL
		= new Season("����" , "�����ˬ");
	public static final Season WINTER
		= new Season("����" , "Χ¯��ѩ");
	public static Season getSeason(int seasonNum)
	{
	switch(seasonNum)
	{
		case 1 :
			return SPRING;
		case 2 :
			return SUMMER;
		case 3 :
			return FALL;
		case 4 :
			return WINTER;
		default :
			return null;
		}
	}
	// �������������private����Ȩ��
	private Season(String name , String desc)
	{
		this.name = name;
		this.desc = desc;
	}
	// ֻΪname��desc�ṩgetter����
	public String getName()
	{
		return this.name;
	}
	public String getDesc()
	{
		return this.desc;
	}
}