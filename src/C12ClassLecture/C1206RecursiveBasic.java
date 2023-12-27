package C12ClassLecture;

public class C1206RecursiveBasic {
    public static void main(String[] args) {

        //반복문으로 1부터 10까지 누적합계를 구해보자.
        int total = 0;
        for (int i = 10; i >= 1; i--) {
            total += i;
        }
        System.out.println(total); //55
        System.out.println(add_acc(10));
        System.out.println(factorial(5)); //120 //펙토리얼 호출

        //10번째 피보나치 수열의 값은 얼마인지 구해보자.
        //피보나치 재귀호출 : 복잡도가 2의 n제곱으로 상당히 크다.. 비추
        System.out.println(Fibonacci(9)); //55


        //배열로 피보나치
        int[] myArr = new int[11]; //10까지 적을경우 0부터 9까지
            //배열을 쓰는 이유 : 값을 트레킹하기 위해, 메모이제이션(dp)을 위해
            //단계마다 계산결과값이 필요할때 메모이제이션 활용
        myArr[0] = 1;
        myArr[1] = 1;
        for (int i = 2; i < myArr.length; i++) {
            myArr[i] = myArr[i - 2] + myArr[i - 1];
        }
        System.out.println(myArr[10]); //55

        //for문으로 피보나치
        int first = 1;
        int second = 1;
        for (int i = 2; i < 10; i++) {
            int third = first + second;
            first = second;
            second = third;
        }

        //누적 곱하기값을 재귀함수 형식으로 만들어보기( 펙토리얼 10*9*8...*1)
    }

    //메서드가 자기 자신을 호출하는 메서드를 재귀함수라고 정의한다.
    //재귀호출
    static int add_acc(int n) { //static 붙이면 바로 호출 가능
        if (n == 1) {
            return 1;
        }
        return n + add_acc(n - 1); //스텍오버플로우가 나오기 때문에 n을 붙여야한다.
    }
    // add_acc(10) -> 10 + add_acc(9) -> 10+9+ add_acc(8) -> 10 + 9 +...+2+add_acc(1)


    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1); //펙토리얼
        //fac(10) -> 10*fac(9) -> 10+9*...fac(1)
    }

    //Fibonacci 재귀함수
    static int Fibonacci(int n) {
        if (n <= 1) {
            return 1;
        }
            return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
