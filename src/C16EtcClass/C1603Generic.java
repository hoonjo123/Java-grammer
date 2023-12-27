package C16EtcClass;



import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1603Generic {
    public static void main(String[] args) {
//        List<T>mylist = new ArrayList<>()
//        T자리에 어떤 타입이든 들어갈 수 있다.
//        재사용성을 향상시킨다.


        //실습 : 자리바꾸기 메서드 만들어보기

        String[] stArr = {"Java", "Hello", "World"};
//      0번째와 1번째 자리 change 메서드
//        String mystr = stArr[0];
//        stArr[0] = stArr[1];
//        stArr[1] = mystr;
//        System.out.println(Arrays.toString(stArr));
        Swap(stArr,0,1); //제네릭 메서드 활용
        System.out.println(Arrays.toString(stArr));


        Integer[] intArr = {1, 2, 3, 4, 5};
        // 1번째 2번째 자리 change
//        Integer myint = intArr[1];
//        intArr[1] = intArr[2];
//        intArr[2] = myint;
//        System.out.println(Arrays.toString(intArr));
//        intSwap(intArr, 1, 2);
//        System.out.println(intArr);
        Swap(intArr, 1,2); //제네릭 메서드 활용
        System.out.println(Arrays.toString(intArr));

//        Genericclass<Integer> studentage = new Genericclass<>();
//        studentage.setAge(30);
        Genericclass<String > studentage = new Genericclass<>();
        studentage.setAge("30");

        Genericclass<String> studentName = new Genericclass<>();
        studentName.setName("조훈");

        System.out.println(studentage.getAge());
        System.out.println(studentName.getName());


    }

    //        제네릭 메서드 생성 : 반환타입 왼쪽에 <T> 선언!
//    public static void stringSwap(String[] stArr1, int A, int B) {
//        String temp = stArr1[A];
//        stArr1[A] = stArr1[B];
//        stArr1[B] = temp;
//    }
//
//    public static void intSwap(Integer[] myint1, int A, int B) {
//        Integer temp = myint1[A];
//        myint1[A] = myint1[B];
//        myint1[B] = temp;
//    }

    //  제네릭 메서드 생성 : 반환타입 왼쪽에 <T> 선언!
    //  제네릭은 객체 타입이 들어와야 함에 유의
    public static <T> void Swap(T[] arr, int A, int B) {
        T temp = arr[A];
        arr[A] = arr[B];
        arr[B] = temp;
    }
    //GenericStudent 클래스 생성 : String name, String age 객체1개는 String age형태로 생성, int age형태로 생성
    public static class Genericclass<T>{
        private T age;

        private String name = "";

        public T getAge() {
            return age;
        }

        public void setAge(T age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
