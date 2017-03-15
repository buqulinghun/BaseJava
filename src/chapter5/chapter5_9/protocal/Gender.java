package chapter5.chapter5_9.protocal;

/**
 * Created by ����˿ on 2017/2/18.
 */
public enum Gender implements GendarDesc {
    Male("��"){
        public void info(){
            System.out.println("Male ��������");
        }
    },FEMALE("Ů"){
        public void info(){
            System.out.println("Male ����Ů��");
        }
    };

    public String name;
    private Gender(String name){
        this.name = name;


    }
    @Override
    public void info(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Gender.Male.info();
        Gender.FEMALE.info();
    }
}
