package chapter4_8;

/**
 * Created by 余屌丝 on 2017/2/14.
 */
public class Bee extends Insect{

    private static int x2=Insect.printInt("子类中静态变量");
    public int m=Insect.printInt("子类中的普通成员m初始化");

    Bee(){
        System.out.println("子类的构造函数been()执行");
        System.out.println("x2: "+x2);
        System.out.println("j: "+j);
    }

    public static void main(String[] args) {
        System.out.println("主函数执行，将执行new Bee()操作");
        Bee b =new Bee();
    }

}