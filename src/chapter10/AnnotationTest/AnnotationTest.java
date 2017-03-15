package chapter10.AnnotationTest;


public class AnnotationTest{

    @MyAnnotation(value1={"a","b"})
    @Deprecated
    public void execute(){
        System.out.println("method");
    }
}