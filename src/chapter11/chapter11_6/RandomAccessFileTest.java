package chapter11.chapter11_6;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Description:
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 *
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {

        File file = new File("test");
        File[] files = file.listFiles();


        RandomAccessFile rafA = null;
        RandomAccessFile rafW = null;

        try{
            rafW = new RandomAccessFile(
                    files[0], "rw");
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            for (int i = 1; i < files.length; i++) {


                rafA = new RandomAccessFile(
                        files[i], "r");
                //都往第一个文件写


                rafW.seek(rafW.length());

                byte[] bbuf = new byte[1024];
                // 用于保存实际读取的字节数
                int hasRead = 0;
                // 使用循环来重复“取水”过程
                while ((hasRead = rafA.read(bbuf)) > 0) {
                    rafW.write("\r\n".getBytes());
                    rafW.write(bbuf);
                    System.out.println(new String(bbuf));
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rafA != null)
                    rafA.close();
                if (rafW != null)
                    rafW.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
