package C12ClassLecture;

import java.util.Scanner;

public class C12_01method_practice {
    public static void main(String[] args) {
     //소수 : 1과 자기자신을 제외해하고 나누어지는 수가 없는 숫자
        //소수인지 아닌지 완성하는 메서드 완성
        //리턴타입 불리안 소수이면 true 아니면 false
        //main메서드에서 호출하여 테스트
        //ㅋㅋㅋㅋㅋㅋ 하...

        int prime_number = 0;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(is_prime(input));
    }
    public static boolean is_prime (int number){
        boolean answer = true;
        for(int i = 2; i<number; i++){
            if(number%i == 0){
                //메서드가 return을 만나면 바로 종료
                //void 관련타입 메서드에서도 강제종료를 위해 return 사용가능
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static void print (int number){
        for(int i = 2; i<number; i++){
            if(number%i == 0) {
                //메서드가 return을 만나면 바로 종료
                //void 관련타입 메서드에서도 강제종료를 위해 return 사용가능
                System.out.println("소수가 아닙니다.");
                return;
            }
        }
        System.out.println("소수입니다");
    }
}
