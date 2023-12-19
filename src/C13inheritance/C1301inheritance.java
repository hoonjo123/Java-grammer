package C13inheritance;

public class C1301inheritance extends Parents { //extends키워드를 통해 상속관계를 표현한다.
    int c = 30;

    public static void main(String[] args) {
        C1301inheritance hi = new C1301inheritance();
        System.out.println(hi.c);//자신의 객체변수 //30
        System.out.println(hi.a); //부모꺼 //10
//        System.out.println(hi.b); //자식클라스라도 private 변수는 상속이 불가능하다

        hi.parentMethod(); //부모클래스입니다.
        hi.childMethod(); // 자식클래스입니다.
    }

    void childMethod() {
        System.out.println("자식클래스입니다.");

    }

    @Override
    void parentMethod() {
        super.parentMethod();
        System.out.println("부모클래스가 아니라 자식클래스입니다");
    }
}

class Parents{
        int a = 10;
        private int b = 20;
        //자식이 상속받아도 private로 선언한 변수는 상속받기 힘들다.

        void parentMethod(){
            System.out.println("부모클래스입니다.");
    }
}
