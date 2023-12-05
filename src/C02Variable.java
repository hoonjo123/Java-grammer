import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
//        //바이트 변수를 사용해서 num1 = 127 num2 = -128; num1 +1을 시키고 , num2 -1을 시켜서 num1, num2 출력
//        byte num1 = 127;
//        byte num2 = -128;
//        num1 ++;
//        num2 --;
//        System.out.println(num1);
//        System.out.println(num2);
//        //byte로 썻을때 -128부터 127까지 표현이 가능하고 그 이상의 값을 넣게되면 over, under값으로 자동 세팅됨.
//        //실수는 float, double이 있고 double이 기본타입이다.
//        double num3 = 1.12341234123412345453464575;
//        float num4 = 1.12341234123412345453464575F;
//        System.out.println(num3);
//        System.out.println(num4);
//        //float 는 6자리까지, double 은 15자리까지 -> 그냥 double을 쓰자.
//
//        //부동소수점 오차 테스트
//        double double_num = 0.1;
//        System.out.println(double_num);
//        // 미세오차는 조정되어 정상적으로 출력
//        //반복적인 연산 시 오차가 확대되어 오차확인가능
//        for(int i=0;i<100;i++){
//            System.out.println(i);
//        }
//        //0.1을 특정변수에 1000번을 더해서 더한값 출력.
//        double special = 0;
//        for(int i=0;i<1000;i++){
//            special = special + 0.1;
//        }
//        System.out.println(special); //0.1을 0에 1000번 더하면 100이 나와야하지만 99.9999...와같이 오차가발생한다.
//        //오차가 나오지 않게 하려면?
//
//        double special1 = 0;
//        for(int i=0;i<1000;i++){
//            special1 = special1 + 0.1*10;
//        }
//        System.out.println(special1/10);
//
//        BigDecimal myBig = new BigDecimal("1.03");
////        String mystr = new String("helloworld") String 은 예외적으로 편법 허용
//
//        double d1 = 1.03;
//        double d2 = 0.42;
//        System.out.println(d1 - d2); //0.6100000....오차가 발생한다.
//
//        BigDecimal myBig1 = new BigDecimal("1.03");
//        BigDecimal myBig2 = new BigDecimal("0.42");
//        System.out.println(myBig1.subtract(myBig2)); //0.61 깔끔하게 답이 나온다.
//        double result = myBig1.subtract(myBig2).doubleValue();
//        System.out.println(myBig1.subtract(myBig2)); //0.61 깔끔하게 나온다.
//
//        char a = '가';
//        System.out.println(a);
////        boolean : true(1) 아니면 false(2)
//        boolean my_bool = true;
//        System.out.println(my_bool);
//        if(my_bool){
//            System.out.println("조건식이 참입니다.");
//        }
//        int bool_nu1 = 20;
//        int bool_nu2 = 10;
//        if(bool_nu1 > bool_nu2){
//            System.out.println("조건식이 참입니다.");
//        }
//
//        //묵시적 타입변환
//        char ch1 = 'a';
//        int ch1_num = ch1;
//        System.out.println(ch1_num); //97
//
//        int my_int1 = 10;
//        double my_double1 = my_int1;
//        System.out.println(my_double1);
//        my_int1 = (int)my_double1;
//        //명시적 타입변환은 가능 => my_int1 = (int)mydouble1; 소수점값 손실 가능성이 있다.
//        double my_double2 = 7.2f;
//        System.out.println(my_double2);
//
//        //명시적 타입변환
//        char my_char2 = 'b';
//        int char_num = (int)my_char2;
        //int a가 1이고 int b가 4일때 둘을 나눈값을 int에 담아 출력,  double에 담아 출력
        int a = 1;
        int b = 4;
        int result = a/b;
        System.out.println(result);
        double result1 = a/b;
        System.out.println(result1); //java에서 int로 묵시적으로 실행함

        //변수와 상수
        //선언과 동시에 초기화
        int a1 = 10;
         //a1을 20으로 변경
        a1 = 20;
            //선언만 한 뒤에 나중에 초기화
        int a2;//선언만 됐을때는 값이 0으로 초기화
        a2 = 20;
            //상수는 값의 재할당이 불가능
        final int ages = 20;
        // ages = 30; <- 재할당이 불가능 오류가난다.

    }
}
