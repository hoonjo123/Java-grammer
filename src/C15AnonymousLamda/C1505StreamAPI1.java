package C15AnonymousLamda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.stream.Stream;

public class C1505StreamAPI1 {
    public static void main(String[] args) {

        int[] arr = {20,10,4,12};
        //전통적인 방식의 데이터 접근 방식
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        //데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 프로그래밍 방식
        //java에서 함수형프로그래밍을 지원하기위한 라이브러리 -> StreamApi
        //forEach는 Stream의 각 요소를 소모하면서 동작을 수행한다. //Enhanced for 문과 비슷하다.
        Arrays.stream(arr).forEach(a -> System.out.println(a));

        Arrays.stream(arr).sorted().forEach(a -> System.out.println(a)); //정렬하고 하나씩 뽑아내기 4,10,12,20

        //스트림의 중개연산 : map, sorted, filter
        String[] myArr = {"world","hello","java"};
        String[] newarr = Arrays.stream(myArr).sorted().toArray(String[]::new);

        int[] arr1 = {1,2,3,4,5};
        int answer = Arrays.stream(arr1).sum();
        System.out.println(answer); //15



    }
}
