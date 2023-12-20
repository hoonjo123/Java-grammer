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
        System.out.println(myMultiCat.play("아메리칸","브리티시"));
        Dogimultiimplements myMultiDog = new Dogimultiimplements();
        myMultiDog.makesound();
        System.out.println(myMultiDog.play("시바견","허스키"));
    }
}
