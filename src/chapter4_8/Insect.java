package chapter4_8;

/**
 * Created by 余屌丝 on 2017/2/14.
 */
public class Insect {
    private int i = 8;
    protected int j;

    int k =printInt("父类中的普通成员k 初始化");
    private static int x1 =  printInt("父类中的静态");

    public static int printInt(String s){
        System.out.println(s);
        return 77;
    }

    Insect(){
        System.out.println("父类的构造函数执行");
        System.out.println("i= "+i);
        System.out.println("k= " +k);
        System.out.println("j= "+j);
        j=99;
    }



}


