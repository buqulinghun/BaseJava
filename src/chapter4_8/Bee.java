package chapter4_8;

/**
 * Created by ����˿ on 2017/2/14.
 */
public class Bee extends Insect{

    private static int x2=Insect.printInt("�����о�̬����");
    public int m=Insect.printInt("�����е���ͨ��Աm��ʼ��");

    Bee(){
        System.out.println("����Ĺ��캯��been()ִ��");
        System.out.println("x2: "+x2);
        System.out.println("j: "+j);
    }

    public static void main(String[] args) {
        System.out.println("������ִ�У���ִ��new Bee()����");
        Bee b =new Bee();
    }

}