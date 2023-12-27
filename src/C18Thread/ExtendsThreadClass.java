package C18Thread;


//Thread클래스에 이미 구현되어있는 run메서드는 아무작업도 하지 않는 빈 메서드이다.
//작업하고 싶은 내용은 run()메서드를 overriding하여 정의할 수 있다.
//상속관계이다보니 다른 클래스 상속불가 (멀티상속불가) -> runnable로 대체가 많이된다.
public class ExtendsThreadClass extends Thread{
    //run메서드는 쓰레드가 시작되면 실행된다.
    @Override
    public void run(){
        System.out.println("ExtendsThreadClass : " + Thread.currentThread().getName());
    }
}
