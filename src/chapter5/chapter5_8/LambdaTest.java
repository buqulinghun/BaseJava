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
        // Runnable接口中只包含一个无参数的方法
        // Lambda表达式代表的匿名方法实现了Runnable接口中唯一的、无参数的方法
        // 因此下面的Lambda表达式创建了一个Runnable对象
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