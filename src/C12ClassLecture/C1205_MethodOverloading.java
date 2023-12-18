package C12ClassLecture;

import java.util.ArrayList;
import java.util.List;

public class C1205_MethodOverloading {
    public static void main(String[] args) {
        //메서드 오버로딩을 통해 같은 메서드명 재활용 대표적으로 println 이 있다.
        //제네릭을 통해 타입재활용

        C1205_MethodOverloading mto = new C1205_MethodOverloading();
        System.out.println(mto.sum(10,20)); //30
        System.out.println(mto.sum(10,20,30)); //60

        //소수점을 넣으면 자동으로 double로 인식한다.

        C1205_MethodOverloading double1 = new C1205_MethodOverloading();
        System.out.println(double1.sum(0.232323,0.123123)); // 0.355446

        //제네릭을 통해 타입재활용
        List<Integer> myList = new ArrayList<>();
    }


    int sum (int a, int b){
        return a + b;
    }
    int sum (int a, int b, int c){
        return a + b + c;
    }
    double sum (double a, double b){
        return a + b;
    }
}