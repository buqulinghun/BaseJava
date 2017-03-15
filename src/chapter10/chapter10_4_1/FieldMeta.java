package chapter10.chapter10_4_1;

import java.lang.annotation.*;

/**
 * Created by ����˿ on 2017/2/25.
 */
@Retention(RetentionPolicy.RUNTIME) // ע�����class�ֽ����ļ��д��ڣ�������ʱ����ͨ�������ȡ��
@Target({ElementType.FIELD,ElementType.METHOD})//����ע�������Ŀ��**���÷�Χ�ֶΡ�ö�ٵĳ���/����
@Documented//˵����ע�⽫��������javadoc��
public @interface FieldMeta {

    /**
     * �Ƿ�Ϊ���к�
     * @return
     */
    boolean id() default false;
    /**
     * �ֶ�����
     * @return
     */
    String name() default "";
    /**
     * �Ƿ�ɱ༭
     * @return
     */
    boolean editable() default true;
    /**
     * �Ƿ����б�����ʾ
     * @return
     */
    boolean summary() default true;
    /**
     * �ֶ�����
     * @return
     */
    String description() default "";
    /**
     * �����ֶ�
     * @return
     */
    int order() default 0;
}