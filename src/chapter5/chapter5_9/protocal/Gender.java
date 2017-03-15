package chapter5.chapter5_9.protocal;

/**
 * Created by 余屌丝 on 2017/2/18.
 */
public enum Gender implements GendarDesc {
    Male("男"){
        public void info(){
            System.out.println("Male 代表男性");
        }
    },FEMALE("女"){
        public void info(){
            System.out.println("Male 代表女性");
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
