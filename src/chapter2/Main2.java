package chapter2;

import java.nio.charset.Charset;
import java.util.Scanner;

/**
 * Created by 余屌丝 on 2017/3/6.
 */
public class Main2 {

    static String encode(String s) {
        //utf-8编码
        byte[] bytes = s.getBytes();
        String str = new String(bytes, Charset.forName("utf-8"));
        //按位取反
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (~bytes[i]&0xFF);
        }

        //反转顺序
        for (int i = 0; i < bytes.length / 2; i++) {
            byte temp = bytes[i];
            bytes[i] = bytes[bytes.length - 1 - i];
            bytes[bytes.length - 1 - i] = temp;
        }

        int[] ints = new int[bytes.length];

        //生成随机数
        String ret = "";

        for (int i = 0; i < bytes.length - 1; i++) {
            int random = (int) (Math.random() * 100);
            int later = (bytes[i] - random);
            int pre = (random << 8) & (0xFF00) ;
            ints[i] ^= later;
            ints[i] ^= pre;

            ret += String.valueOf(ints[i] + ",");
        }

        return ret;
    }

    static String decrypt(String s) {
        byte[] bytes = new byte[s.length()];
        String[] strs = s.split(",");
        for (int i = 0; i < strs.length; i++) {
            int num = Integer.parseInt(strs[i]);
            //取最后一位
            int temp = (int) num & (0xFF);
            int seek = (int) num & (0xFF00);
            seek = (seek >> 8) & 0xFF;

            int ret = temp + seek;
            ret = (byte) (~ret & 0xFF);
            bytes[i] = (byte) (ret & 0xFF);
        }
        //反转
        for (int i = 0; i < bytes.length / 2; i++) {
            byte temp = bytes[i];
            bytes[i] = bytes[bytes.length - 1 - i];
            bytes[bytes.length - 1 - i] = temp;
        }

        return new String(bytes, Charset.forName("utf-8"));


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res;
        String _s;
        try {
            _s = in.nextLine();
            System.out.println(encode(_s));
            System.out.println(decrypt(encode(_s)));


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
