package C13inheritance;

//import java.util.* : util 하위의 모든 클래스/인터페이스 파일 import 가능
//import java.* : 불가능, 특정 패키지의 하위패키지의 모든 파일까지 import하는 것은 불가능.
//public class C1305Others extends FinalClass{
//
//    final클래스는 상속 불가
//}
public class C1305Others {
    public static void main(String[] args) {
        C1305Dog mydog = new C1305Dog();
        mydog.makesound1();
        mydog.makesound2();
        C1305Animal myanimal = new C1305Animal() { //myanimal 은 익명객체 others 클래스와는 아무 상관이 없음
            @Override
            void makesound() {

            }
        };
        System.out.println(mydog.getClass()); //내부적으로 상속을 하고 있음. mydog이 잘 출력됨.
        System.out.println(myanimal.getClass()); //class C13inheritance.C1305Others$1


    }
}

final class FinalClass{
    //final class 앞에서는 상속불가
    //method 앞에서는 오버라이딩 불가.

}

abstract class C1305Animal{
//    final void makeSound(){
//        System.out.println("동물은 소리를 냅니다.");
//    }
   abstract void makesound();
   void makesound2(){
       System.out.println("makesound");
   }
}

class C1305Dog extends C1305Animal{
    void makesound1() {
        System.out.println("makesound1");
    }

    @Override
    void makesound() {

    }
//    @Override   //final method는 오버라이딩 불가하다.
//    void makeSound(){
//        System.out.println("멍멍");
//    }

}

