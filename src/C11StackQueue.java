import javax.swing.text.StyledEditorKit;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11StackQueue {
    public static void main(String[] args) {
//        Stack<Integer> mySt = new Stack<>();
//        mySt.push(10);
//        mySt.push(20);
//        mySt.push(30);
//        mySt.pop(); // pop은 stack에서 요소를 제거후 해당 요소 반환.
//        System.out.println(mySt); //[10, 20]
//        System.out.println(mySt.peek()); //20 //peek은 stack에서 마지막요소 반환하는것 제거가 아니다.
//        System.out.println(mySt); //[10, 20]
//        System.out.println(mySt.size());
//        System.out.println(mySt.isEmpty());

        //스트링타입 5개 정도 추가후, while문을 통해 모두 출력
//        Stack<String> mySt1 = new Stack<>();
//        mySt1.push("java");
//        mySt1.push("JS");
//        mySt1.push("JavaScript");
//        mySt1.push("Spring");
//        mySt1.push("node.js");
//
//        while(mySt1.size() != 0){
//            System.out.println(mySt1.pop());
//        }
//
//        while(mySt1.isEmpty()){
//            System.out.println(mySt1.pop());
//        }
        //웹페이지 방문
        //방문한 사이트 출력 + 뒤로가기 기능 구현
        //스캐너로 신규사이트 방문 or 뒤로가기
        //신규사이트방문일경우, 해당 주소 push
        //뒤로가기일경우 해당 주소 pop

        //stack 실습 1. 웹페이지 뒤로가기 기능 구현 //진짜 개념은 0.1 알려주고 1000을 쓰라고 하네 ;;
//        Stack<String> previous = new Stack<>();
//        Stack<String> Current = new Stack<>();
//        Stack<String> next = new Stack<>();
//        ArrayList<Stack> result1 = new ArrayList<>();
//        Stack<String> backwards = new Stack<>();
//        Stack<String> forwards = new Stack<>();
//
//        while(true){
//            System.out.println("신규사이트 방문시 1번, 앞으로가기 2번, 뒤로가기 3번");
//            Scanner sc = new Scanner(System.in);
//            String input = sc.nextLine();
//            if(input.equals("1")){
//                System.out.println("방문하신 사이트를 입력해주세요");
//                Scanner sc2 = new Scanner(System.in);
//                String input2 = sc.nextLine();
//                System.out.println("방문하신 사이트는" + input2 + "입니다");
//                backwards.push(input2);
//            }else if (input.equals("2")){
//                String temp = forwards.pop();
//                backwards.push(temp);
//                System.out.println("앞으로 가기를 통해 방문한곳은" + temp + "입니다");
//            }else{
//                String temp = backwards.pop();
//                forwards.push(temp);
//                System.out.println("뒤로가기로 방문하신 곳은" +backwards.peek() + "입니다");
//            }
//        }

        //Queue<Integer> q = new LinkedList<>();
        Queue<Integer> myque = new LinkedList<>(); //que와 list를 구현하고 있다.
        myque.add(10);
        myque.add(20);
        myque.add(30);
        System.out.println(myque.poll()); //[10]
        System.out.println(myque); //[20,30]

        //프린터 대기열 예제 문서1추가 문서2추가 문서3추가 하나씩 소모하면서 출력한 문서가 뭔지?
        //while문을 통해 현재 인쇄중인 문서 = 문서 ** 이런식으로.. 출력해보자

        Queue<String> myque1 = new LinkedList<>();
        myque1.add("문서1");
        myque1.add("문서2");
        myque1.add("문서3");

        while(!myque1.isEmpty())
            System.out.println("현재 출력중인 문서는 " + myque1.poll() + " 입니다" );//순차적으로

        Stack<String> myque3 = new Stack<>();
        myque3.add("안녕");
        myque3.add("오하요");
        myque3.add("봉쥬르");

        while(!myque3.isEmpty())
            System.out.println(myque3.pop()); // stack 은 뒤에서부터

        //길이에 제한이 있는 que : ArrayBlockingQueue
        //고객센터 예시
        Queue<String> myque4 = new ArrayBlockingQueue<>(3);
        //add와 offer의 차이
        // add는 길이가 다 찼을 때 에러를 발생시킴
        // offer는 공간이 충분할 때만 add시킨다
        /*myque4.add("Hello1");
        myque4.add("Hello2");
        myque4.add("Hello3");
        myque4.add("Hello4"); 공간이 없어서 에러가 나는것을 알 수 있다.
         */
        myque4.offer("hello1");
        myque4.offer("hello2");
        myque4.offer("hello3");
        myque4.offer("hello4");
        System.out.println(myque4);  //[hello1, hello2, hello3]
//        에러가 나지 않는것을 알 수 있다.

        //우선순위 que : 큐의 최 상단에 가장 작은값이 위치 //tree랑 약간 비슷함
        //힙 자료구조를 통해 구현된 클래스
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(20);
        pq.add(10);
        pq.add(40);
        pq.add(50);
        System.out.println(pq);// [10, 30, 20, 40, 50]  맨 앞에 가장 작은값 고정

        while(!pq.isEmpty()){
            System.out.println(pq.poll()); //애초에 정렬을 시키지 왜 poll 할때 정렬하는거?;;
            // 효율성때문에 정렬을 바로 못합니다. 휴
            //왜 빠르지?
            //힙 자료형이라서 -

            //더 맵게

            //list써서 풀어보기 (효율성 떨어짐)

        }
    }
}
