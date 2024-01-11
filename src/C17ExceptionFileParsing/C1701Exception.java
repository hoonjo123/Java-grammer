package C17ExceptionFileParsing;

import java.util.Arrays;
import java.util.Scanner;



public class C1701Exception {
    public static void main(String[] args) {
//      ArithmeticException : 0으로 나눌때 발생하는 예외
        System.out.println("나눗셈 프로그램입니다. 숫자 10에 나눌 분모값을 입력해주세요.");
        int num = 10;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        //예외가 발생 될 것으로 예상되는 코드에 try catch 감싸준다.
        try {
            System.out.println("10에 " + input + "을 나누면 ");
            System.out.println(num / input + "입니다");
            //catch에는 'try구문안에서' '발생 가능'한 예외상황을 적어야 정상적으로 catch가 된다.
            //Exception : 모든 예외의 부모예외 -> 예초에 exception을 쓰지 왜 구체적인 예외처리를 사용한걸까? ->
            //적절한 코드를 줄 수가 없기 때문에 자바레벨에서는 설명이 어려움.
        } catch (NullPointerException e) {
            System.out.println("정상적이지 않은 입력값을 넣었군요 휴먼.");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println(" 0으로도 숫자를 나누나요? 다른 값으로 시도해주세요.");
        } catch (Exception e) {
            System.out.println("알 수 없는 예외가 발생하였습니다.");
            e.printStackTrace();
        } finally {
            //반드시 실행되어야 하는 구문 삽입
        }
        System.out.println("감사합니다람쥐렁이");


        // throw와 throws예제
//        String password = "12345";
//        try {
//            login(password);
//        }catch (IllegalArgumentException e){
//            //e.getMessage()는 login메서드에서 throw new한 곳에서 넘어온 메시지.
//            System.out.println(e.getMessage());
//        }
//    }
//    //unchecked exception에서 throws를 하지 않더라도 예외는 호출한곳으로 전파
//    //이때에 throws를 하는 이유는 명시적으로 예외가 발생할 수 있음을 알리는 것일 뿐.
//    //checked exception은 예외처리가 강제되고, 해당메서드에서 예외처리를 하든지 throws통해 호출한곳에 위임
//    //이때에 호출한 쪽에서는 예외처리가 강제된다.
//    static void login(String password) throws IllegalArgumentException{
//        if(password.length()<10) {
//            throw new IllegalArgumentException("니 해킹당하고 싶냐 좀 더 길게해라");
//        }
//        String password = "12345";
//        try {
//            login(password);
//        }catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }
    }
}

