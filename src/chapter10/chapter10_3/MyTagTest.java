package chapter10.chapter10_3;

import java.lang.annotation.Annotation;

/**
 * Created by 余屌丝 on 2017/2/25.
 */
public class MyTagTest {
    @MyTag(name = "yubin",age = 18)
   // @Deprecated
    public void info(){
      //  System.out.println("name:"+name);
    }

    public static void main(String[] args) {
        try {
            Annotation [] aArray = Class.forName("chapter10.chapter10_3.MyTagTest").getMethod("info").getDeclaredAnnotations();
            System.out.println("length: "+aArray.length);
            for(Annotation a: aArray){
               if(a instanceof MyTag){
                   String name =  ((MyTag) a).name();
                   int age = ((MyTag) a).age();
                   System.out.println("name:"+age+" age: "+age);

               }

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
