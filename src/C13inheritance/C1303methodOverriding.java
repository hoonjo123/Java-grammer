package C13inheritance;

import java.util.LinkedList;
import java.util.List;

class Dogs extends Animal{
    @Override
    void sound(){
        System.out.println("멍멍");
    }
}

class Cats extends Animal{
    @Override
    void sound() {
        System.out.println("야옹");
    }
}
public class C1303methodOverriding {


    public static void main(String[] args) {
        //Animal 클래스 하나 생성
        //Dogs 클래스를 만들어서 Animal 을 상속 -> sound overriding : 멍멍
        //Cat 도 Animal 상속 -> sound overriding : 야옹
        //Animal 메서드 안에는 sount() -> 동물은 소리를 냅니다
        //main메서드에서 객체 2개 생성해서 sound 호출
        Animal dogs = new Dogs(); //Dogs  대신 Animal을 넣어보자. 가능하다. 왜 허용을 해주는거지?
        // 상속관계일때 부모클래스 타입을 자식클래스 객체에 타입으로 지정가능.
        // Animal 클래스에 정의된 메서드만 사용가능하도록 제약이 발생.
        dogs.sound(); //멍멍
        Animal cats = new Cats();
        cats.sound(); //야옹

        List<String> myList = new LinkedList<>();
    }
}

class Animal{
  void sound() {
      System.out.println("동물은 말을 못합니다.");
  }
}
