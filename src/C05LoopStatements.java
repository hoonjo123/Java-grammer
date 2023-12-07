import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {
//        int a = 2;
//        while(a < 10){
//            System.out.println(a);
//            a++;
        //2부터 10까지 while문 예제
//        }
//        while(true) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("구구단을 외자! 구구단을 외자!");
//            int input = sc.nextInt();
//            int a = 1;
//            while (a < 10) {
//                System.out.println(input + " X " + a + " = " + input * a);
//                a++;
//            }
//        } //구구단을 외자 구구단을 외자
//
        // 비밀번호 무한반복문 //비밀번호 5회 무한 반복문
//        while (true) {
//            Scanner a10 = new Scanner(System.in);
//            System.out.println("비밀번호를 입력해주세요.");
//            String a = a10.nextLine();
//            String password = "1234";
//            if (a.equals(password)) {
//                System.out.println("문이 열렸습니다");
//                break;
//            } else
//                System.out.println("비밀번호가 틀렸습니다.");
//        }
//    }

//    do while문
//        int a = 1;
//        do {
//            a++;
//            System.out.println(a);
//        }
//        while (a < 10);
//

        //for문을 통해 2부터 10까지 출력

//        for(초기식 ; 조건식 ; 증감식) {
//
//            조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;
////

        //배열과 Enhanced for 문
//        int[] myArr = {1, 5, 7, 9, 10}; //0번째값이 1, 1번째 값이 5....
////        System.out.println(myArr[2]);  //7
//        for (int i = 0; i < 5; i++) {
//            System.out.println(myArr[i]);
//            myArr[i] = myArr[i] + 10;
//        }
//        System.out.println(Arrays.toString(myArr));
//        for(int a : myArr){
//            System.out.println(a);
//        }
        //일반 for문을 써서 myArr에 10씩 더한 후에 출력 /
//        int sum = 0;
//        for (int a : myArr) {
//            sum += a;
//            System.out.println(sum);
//        }
//        //다중반복문
//        2단부터 9단 전부 출력하되 몇단입니다 주르륵 몇단입니다 주르륵 나오게
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("구구단을 외자! 구구단을 외자!");
//            int input = sc.nextInt();
//            int a = 2;
//            while (a < 10) {
//                System.out.println(input + " X " + a + " = " + input * a);
//                a++;
//            }
//            break;
//        }
//
//        for(int i = 2; i < 10; i++){
//            System.out.println(i + "단입니다");
//            for(int k = 1; k < 10; k++){
//                System.out.println(i + " X " + k + "=" + i * k);
//            }
//        }
////
//        int[][] arr = {{1, 2, 3, 4}, {5, 7,8}};
//        for(int k = 0;  k<arr.length; k++){
//            for(int i =0; i<arr[k].length; i++){
//                System.out.println(arr[k][i]);
//            }
        //1부터 5까지 반복이 되고 , 2번째 for문은 0부터 4까지반복이 되는데 2번째 for문에
        loop1:
        for(int i=0;i<5;i++){
            loop2:
            for(int j=0;j<5;j++){
                System.out.println("hello world");
                if(j==2) {
                    break loop1;
                }
            }
        }
    }
}
