package chapter10.chapter10_2;

// TestInheritable��ֻ�Ǽ̳���Base�࣬
// ��δֱ��ʹ��@Inheritable Annotiation����
public class InheritableTest extends Base
{
	public static void main(String[] args)
	{
		// ��ӡTestInheritable���Ƿ����@Inheritable����
		System.out.println(InheritableTest.class
			.isAnnotationPresent(Inheritable.class));
	}
}

