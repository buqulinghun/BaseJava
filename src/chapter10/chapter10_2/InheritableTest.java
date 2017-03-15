package chapter10.chapter10_2;

// TestInheritable类只是继承了Base类，
// 并未直接使用@Inheritable Annotiation修饰
public class InheritableTest extends Base
{
	public static void main(String[] args)
	{
		// 打印TestInheritable类是否具有@Inheritable修饰
		System.out.println(InheritableTest.class
			.isAnnotationPresent(Inheritable.class));
	}
}

