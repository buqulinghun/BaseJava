package chapter5.chapter5_8;

@FunctionalInterface
interface FkTest
{
    void run();
}

public class LambdaTest
{
    public static void main(String[] args)
    {
        // Runnable�ӿ���ֻ����һ���޲����ķ���
        // Lambda���ʽ�������������ʵ����Runnable�ӿ���Ψһ�ġ��޲����ķ���
        // ��������Lambda���ʽ������һ��Runnable����
        Runnable r = () -> {
            for(int i = 0 ; i < 100 ; i ++)
            {
                System.out.println();
            }
        };

        Object obj2 = (FkTest)() -> {
            for(int i = 0 ; i < 100 ; i ++)
            {
                System.out.println();
            }
        };

    }
}