package C13inheritance;
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
        Dogs dogs = new Dogs();
        dogs.sound(); //멍멍
        Cats cats = new Cats();
        cats.sound(); //야옹
    }
}

class Animal{
  void sound() {
      System.out.println("동물은 말을 못합니다.");
  }

}
