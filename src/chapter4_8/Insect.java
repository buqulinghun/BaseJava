package chapter4_8;

/**
 * Created by ����˿ on 2017/2/14.
 */
public class Insect {
    private int i = 8;
    protected int j;

    int k =printInt("�����е���ͨ��Աk ��ʼ��");
    private static int x1 =  printInt("�����еľ�̬");

    public static int printInt(String s){
        System.out.println(s);
        return 77;
    }

    Insect(){
        System.out.println("����Ĺ��캯��ִ��");
        System.out.println("i= "+i);
        System.out.println("k= " +k);
        System.out.println("j= "+j);
        j=99;
    }



}


