package chapter5.chapter5_6.lee;
public interface Output
{
	// �ӿ��ﶨ��ĳ�Ա����ֻ���ǳ���
	int MAX_CACHE_LINE = 50;
	// �ӿ��ﶨ�����ͨ����ֻ����public�ĳ��󷽷�
	void out();
	void getData(String msg);
	// �ڽӿ��ж���Ĭ�Ϸ�������Ҫʹ��default����
	default void print(String... msgs)
	{
		for (String msg : msgs)
		{
			System.out.println(msg);
		}
	}
	// �ڽӿ��ж���Ĭ�Ϸ�������Ҫʹ��default����
	default void test()
	{
		System.out.println("Ĭ�ϵ�test()����");
	}
	// �ڽӿ��ж����෽������Ҫʹ��static����
	static String staticTest()
	{
		return "�ӿ�����෽��";
	}
}