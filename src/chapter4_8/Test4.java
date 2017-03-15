package chapter4_8;

/**
 * Created by ????? on 2017/2/15.
 */
public class Test4 {
    public static void main(String[] args) {
        child child = new child();
    }
}
class parent{
    public static String parentStaticField = "父类静态变量";
    public String parentNormalField ="父类普通变量";
    static {
        System.out.println(parentStaticField);
        System.out.println("父类静态块");
    }

    {
        System.out.println(parentNormalField);

        System.out.println("父类普通变量");
    }

    public parent(){

        System.out.println("父类构造函数parent()");
    }
}
class child extends parent{
    public static String childStaticField = "子类静态变量";
    public String childNormalField ="子类普通变量";
    static {
        System.out.println(childStaticField);
        System.out.println("子类静态块");
    }

    {
        System.out.println(childNormalField);
        System.out.println("子类普通快");
    }

    public child(){
        System.out.println("子类的构造函数child()");
    }
}