import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args) {
//        int a = 20;
//        정수형 타입
//        System.out.print(a); //20
//        //print 는 출력 후 줄바꿈 없음 , println은 줄바꿈있음
//        String mystring = "hello world";
//        //문자열과 숫자를 합치면 문자가 된다.
//        System.out.println(mystring); //helloworld
//        System.out.println(mystring + a); //helloworld20
        // 숫자와 숫자를 더하면 더하기연산이 된다.
//        System.out.println( 10 + 20 );  //30

        //입력 System.in(키보드입력) + Scanner(입력을위한클래스)
//        Scanner myScan = new Scanner(System.in);
//        System.out.println("아무 문자열을 입력해주세요");
//        //nextLine은 입력받은 데이터를 한 줄 읽어서 string 으로 리턴
//        String inputs = myscan.nextLine();
//        System.out.println("사용자가 입력한 문자열은 : " + inputs);
//        //nextInt은 입력받은 데이터를 한 줄 읽어서 int로 리턴
//        int inputs_int = myscan.nextInt();
//        System.out.println("사용자가 입력한 숫자는 : " + inputs_int);

        //더하기를 할 숫자 3개를 입력해주세요.
        //숫자 1개 입력후엔터 -> 숫자1개 입력후 엔터 -> 숫자 1개 입력 후 엔터
        //입력하신 두 수를 더한 값은 XX입니다.
        Scanner myScan = new Scanner(System.in);

        System.out.println("더하기를 할 숫자를 3개를 입력해주세요");
        int a = myScan.nextInt();
        int b = myScan.nextInt();
        int c = myScan.nextInt();
        int sum = a + b + c;
        System.out.println("입력하신 두 수를 더한 값은 " + sum + "입니다");

        //nextDouble을 통해서 소수점입력후 출력해주세요.
        //boolean 참/거짓 -> nextBoolean을 통해 true/false 입력 후 출력
//

        System.out.println("실수를 입력해주세요.");
        double a1 = myScan.nextDouble();
        System.out.println("실수는" + a1 + "입니다");

        System.out.println("true또는 false를 입력해주세욥");
        boolean a2 = myScan.nextBoolean();
        System.out.println("입력하신 참 거짓은 : " + a2);

        myScan.close(); //입출력 시스템 메모리 해제

        //바이트 변수를 사용해서 num1 = 127 num2 = -128; num1 +1을 시키고 , num2 -1을 시켜서 num1, num2 출력

    }
}
