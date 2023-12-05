public class C03Operator {
    public static void main(String[] args) {
//        int num1 = 8;
//        int num2 = 3;
//        int num1 = 8, num2 = 3; 이렇게도 가능하다.
//        int num1 = 8; int num2 =3; 자바에서는 줄바꿈이 의미가 없다. ;이 있기 때문에
//        System.out.println(num1 + num2);
//        System.out.println(num1 * num2);
//        System.out.println(num1 % num2);
        Math.floorMod(10,26);

        //대입연산자

        int n4 = 10;
//        /=3; %=3;
        int n5 = 10;
        System.out.println(n4 /= 3);
        System.out.println(n5 %= 3);

        //증감연산자
        int a = 5;
        int b = a++; //후위연산자 : 실행문이 끝나고 증감
        System.out.println(a); //6
        System.out.println(b); //5

        a=5;
        b=++a; //전위연산자 : 실행문이 끝나기전에 증감
        System.out.println(a); //6
        System.out.println(b); //6

        //비교연산자

        //비교연산자 실습. char1은 a할당, char2은 A를 할당
        // char1이 char2와 같은지 출력
        //char1이 char2와 같지 않은지 출력

        char char1 = 'a';
        char char2 = 'A';
        System.out.println(char1 == char2); //연산의결과가 불린타입이다.
        System.out.println(char1 != char2);

        //논리연산자

        //논리연산자 실습. && || !
//        int num1 = 10, int num2 = 20;
        boolean result1, result2;
//        result1에 num1이 5보다 큰지 조건과 num1 20보다 작은지 조건을 and조건을 통해 boolean 담기
//        result2에 num2가 10보다 작은 조건과 num2가 30보다 작은 조건을 or조건을 통해 boolean 담기
//        result1, result2 각각 출력
//        result2에 !달아서 출력.
        int num1 = 10, num2 = 20;
        result1=5 < num1 && num1 < 20;
        System.out.println(result1); //true

        result2 = !(10 > num2 || 30 > num2);
        System.out.println(result2);

        //비트연산자 : &, 각 자리의 수가 모두 1일때만 가능하다.
        System.out.println(2 & 1);

    }
}
