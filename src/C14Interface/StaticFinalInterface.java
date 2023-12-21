package C14Interface;

public class StaticFinalInterface {
    public static void main(String[] args) {
        Myinplements myinple = new Myinplements();
        myinple.methodA(); //hello world
        System.out.println(Myinplements.my_constant); //100 final 로 선언을 해놔서 메인에서 바꾸려고해도 안바뀜.
        //static 선언 안해도 static으로 선언됨.
        System.out.println(myinple.a);
    }
}

interface myinterface{
    int my_constant = 100;
    String a = "hello";
    //위의 변수는 컴파일타입에 static final이 붙는다.
    void methodA();
}
class Myinplements implements myinterface{

    @Override
    public void methodA() {
        System.out.println("hello world");
    }
}

