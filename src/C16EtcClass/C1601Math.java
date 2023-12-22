package C16EtcClass;

public class C1601Math {
    public static void main(String[] args) {
        for(int i =0; i<10; i++){
            //Math.randon() : 0.0 ~ 1.0 미만의 임의 double형을 반환
            double randomvalue = Math.random();
            System.out.println((int)(randomvalue*100));
        }

        //abs() 메소드 : 절대값 반환
        System.out.println(Math.abs(-5));

        //floor() : 소수점내림, ceil() : 소수점 오릶, round(): 소수점반올림
        System.out.println(Math.floor(5.7)); //5.0
        System.out.println(Math.ceil(5.7)); //6.0
        System.out.println(Math.round(5.7)); // 6

        //Max, min
        System.out.println(Math.max(5,8)); //8
        System.out.println(Math.min(5,8)); //5

        // pow(a,b) : 계급 연산 수행 -> a의 b제곱
        System.out.println(Math.pow(5,2)); //25.0

        //sqrt() : 제곱근 연산수행 , 루트
        System.out.println(Math.sqrt(25)); //5
        int n = 100;
        for(int i = 0; i<=(int)Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.println("소수가 아닙니다");
                break;
            }
        }
    }
}
