package C18Thread;

import java.util.concurrent.LinkedBlockingDeque;

public class MainClass {
    public static void main(String[] args) {
        Thread etc1 = new ExtendsThreadClass(); //상속방식으로 Thread생성
        etc1.start();
        Thread etc2 = new ExtendsThreadClass(); //상속방식으로 Thread생성
        etc2.start();
        Thread etc3 = new ExtendsThreadClass(); //상속방식으로 Thread생성
        etc3.start();

        //Thread 실행시 순차적으로 실행되지 않음에 유의

        //Thread 생성자를 Runnable객체에 주입하는 방식
        //Thread 클래스에 Runnable객체가 전달되어 사용자가 직접 정의 run 메서드가 실행
        new Thread(new RunnableImplementsClass()).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("익명객체 스레드");
//            }
//        })
        new Thread(() -> System.out.println("익명객체 스레드")).start();


        //Thread의 동시성 이슈 테스트
        //단일Thread일반호출
//        for(int i=0; i<1000; i++){
//            Library.borrowBook();
//        }
//        System.out.println("최종남은수량" + Library.bookcount);

        for(int i=0; i<1000; i++){
            Thread th = new Thread(() -> Library.borrowBook());
            th.start();
            //동시에 1000명이 달려들었음. 인기폭발임. join메서드를 통해 다른thread에 완료전까지 새로운 스레드가 실행되지 않도록 막음.
//            try {
//                th.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
        System.out.println("최종남은수량" + Library.bookcount);
        //동시성 이슈 //-247
        //join메서드를 붙여서 멀티스레드 차단 -> 효용성이 없다. 이럴거면 멀티스레드를 안쓰고 말지..
        //Libaray 에 Synchronized 키워드를 붙임으로 해결

    }
}
