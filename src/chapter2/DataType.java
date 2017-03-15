package chapter2;

/**
 * Created by 余屌丝 on 2017/2/10.
 */
public class DataType {
    public static void main(String[] args) {
        //系统自动把56当byte类型处理
        byte a = 56;
        //八进制以0开头
        int octalValue = 010;
        //十六进制以0x 或0X开头
        int hexValue = 0x13;
        //二进制以0b 或0B 开头
        int bigVal1  = 0b10;
        //byte只占8位，出现溢出。输出为负数
        byte bigVal2 = (byte)0b111011001;
        // 在巨大的数的后面加L，强制使用long类型
        long bigVal3 = 9999999999999L;
        //由于L后缀，该整数占32位
        long bigVal4 = 0B100000000000000000000000000000001L;//32位


        System.out.println(a);
        System.out.println(octalValue);
        System.out.println(bigVal1);
        System.out.println(bigVal2);
        System.out.println(bigVal3);
        System.out.println(bigVal4);
    }
}
