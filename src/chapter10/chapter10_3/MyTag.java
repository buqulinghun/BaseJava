package chapter10.chapter10_3;

/**
 * Created by 余屌丝 on 2017/2/25.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyTag {
    String name();
    int age();
}
