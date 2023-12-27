package C12ClassLecture;



import java.util.ArrayDeque;
import java.util.Arrays;

public class C12_01method {
    public static void main(String[] args) {
//        // for문 이용해서 1-10까지 total값 출력
//        int total1 = 0;
//        for(int i=1; i<=10; i++) {
//            total1 += i;
//        }
//        System.out.println(total1);
//
//
//        // for문 이용해서 10-20까지 total값 출력
//        int total2 = 0;
//        for(int i=10; i<=20; i++) {
//            total2 += i;
//        }
//        System.out.println(total2);

    // 코드의 중복이 발생하므로, 코드의 반복피하기 위해 특정 기능집합을 별도로 관리
        C12_01method myClass = new C12_01method();
        int total = sumAcc(100,200);
        System.out.println(total);

    // 같은 글래스내의 메서드들 사이에서의 호출은 static메서드라 할지라도 클래스만 생략가능
        System.out.println(C12_01method.sumAcc(1,20));

        //매서드 구성요소 : 매개변수, 반환타입, 접근제어자, 클래스매서드여부(static)


    }
//  void 리턴타입 : 리턴타입없는것.
//  int, String 등 리턴타입 명시해줘야한다.
    public static int sumAcc(int start, int end){
        int total = 0;
        for(int i=start; i<=end; i++) {
            total += i;
        }//return 키워드를 통해서 연산겨로가값을 반환
        return total;
    }


}
