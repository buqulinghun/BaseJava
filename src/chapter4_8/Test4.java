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
    public static String parentStaticField = "���ྲ̬����";
    public String parentNormalField ="������ͨ����";
    static {
        System.out.println(parentStaticField);
        System.out.println("���ྲ̬��");
    }

    {
        System.out.println(parentNormalField);

        System.out.println("������ͨ����");
    }

    public parent(){

        System.out.println("���๹�캯��parent()");
    }
}
class child extends parent{
    public static String childStaticField = "���ྲ̬����";
    public String childNormalField ="������ͨ����";
    static {
        System.out.println(childStaticField);
        System.out.println("���ྲ̬��");
    }

    {
        System.out.println(childNormalField);
        System.out.println("������ͨ��");
    }

    public child(){
        System.out.println("����Ĺ��캯��child()");
    }
}