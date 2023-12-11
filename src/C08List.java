import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08List {
    public static void main(String[] args) {
//        List 선언방법
//        ArrayList<String> myList = new ArrayList<String>(); //가장 원초적인 방식

        List<String> myList = new ArrayList<>(); //가장 원초적인 방식
        //가장 일반적인 방식
        //왼쪽엔 인터페이스, 오른쪽에 구현체

        //초기값 생성방법
        myList.add("java");
        myList.add("python");
        myList.add("C++");
        System.out.println(myList); //내부적으로 이미 toString이 접목되어있다.

        //한꺼번에 add하는방법 / 배열을 이용한 변환 / 배열이 int인 경우 한꺼번에 형변환하는게 문제가 된다.
        String[] myArr1 = {"java","python","C++"};
        List<String> myList2 = new ArrayList<>(Arrays.asList("java","python","C++"));
        //배열이 int인경우
        int[] myIntarr1 = {2,3,4};
//        List<Integer>myIntList1 = new ArrayList<>(Arrays.asList(myIntarr1)); //에러가 뜬다 , 형변환이슈
        List<Integer>myIntList1 = new ArrayList<>();
        for ( int a : myIntarr1){
            myIntList1.add(a);
        }

    }
}
