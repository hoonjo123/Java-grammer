package C14Interface;

import com.sun.org.apache.xml.internal.resolver.CatalogManager;

public class InterfaceMain {
    public static void main(String[] args) {
        Animalinterface1 myCat = new Catimplements(); //인터페이스로 넣을수있나? 인터페이스를 구현했기 때문에
        myCat.makesound();
        Animalinterface1 myDog = new Dogimplements();
        myDog.makesound();

        //default 여도 접근이 가능 같은 package 안에서는
        //다형성이란 하나의객체가 여러개의 참조변수를 가질 수 있음을 의미
        Catimultiimplements myMultiCat = new Catimultiimplements();
        myMultiCat.makesound();
        //타입을 interface1로 선언하면 interface2에 정의된 메서드는사용불가
        System.out.println(myMultiCat.play("아메리칸","브리티시"));
        Dogimultiimplements myMultiDog = new Dogimultiimplements();
        //타입을 interface1로 선언하면 interface2에 정의된 메서드는사용불가
        myMultiDog.makesound();
        System.out.println(myMultiDog.play("시바견","허스키"));

        //기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나, 익명내부클래스 방식으로 사용가능
        Animalinterface1 a1 = new Animalinterface1() {
            @Override
            public void makesound() {

            }
        };
    }
}
