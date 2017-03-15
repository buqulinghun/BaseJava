package chapter8.chapter8_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 余屌丝 on 2017/2/21.
 */
public class Test {
    public void print(List<?> c){

        for(int i = 0;i < c.size();i++)
            System.out.println(c.get(i));
    }

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
 //       new Test().print(strList);

        List<?> list = new ArrayList<String>();
//        list.add("ok");

    }
}
