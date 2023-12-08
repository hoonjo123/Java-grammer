import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
//
//        int[] int_arr1 = {1,2,3,4};//표현식1.
//
//        int[] int_arr2 = new int[4];//표현식2. 나중에 값을 세팅하는 방식
//        int_arr2[0]=1;
//        int_arr2[1]=2;
//        int_arr2[2]=3;
//        int_arr2[3]=4;

//        int[] int_arr3 = new int[]{1,2,3,4};//표현식3. 딱히 쓸 일 없음
//        int[] int_arr4 = new int[] //표현식4. 불가함. 배열은 반드시 길이를지정해야함
//        85, 65, 90 인 int 배열을 선언한뒤, 종합값, 평균값을 구하시오
//        int[] arr1 = {85,65,90};
//        int count = 0;
//        for(int i = 0; arr1.length>i; i++){
//            count += arr1[i];
//        }
//        System.out.println(count);
//        System.out.println(count/arr1.length);
//        최대값, 최소값
//        int[] arr = {10, 20, 30, 12, 8, 17};
//        int max = arr[0];
//        int min = arr[0];
//        for (int i = 0; arr.length > i; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//        }
//        for (int i = 0; arr.length > i; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//        }
        //배열의 순서바꾸기
//        int[] arr = {10,20};
//        arr[0] = arr[1];//불가능, 0번째 자리에 20이 들어가는거랑똑같음
//        arr[1] = arr[0];
//        System.out.println(arr);
//
//        int[] arr = {10,20};
//        int temp = arr[0]; //0번째 값이 날아가서 그 값을 먼저 keep해주는 개념 , 반드시기억하자
//        arr[0] = arr[1];
//        arr[1] = temp;
//        System.out.println();
//
//        int[] arr2 = {10, 20, 30, 40, 50, 60, 70};
//        int temp = arr2[0];
//        int temp1 = 0;
//        for (int i = 0; arr2.length - 1 > i; i++) {//i+1까지가면 범위가 초과되므로 오류가 난다.
//            temp1 = arr2[i];//밖에서 사용한 변수는 사용할 수 있다.
//            arr2[i] = arr2[i + 1];
//            arr2[i + 1] = temp1;
//        }
//        System.out.println(Arrays.toString(arr2));
//
//        //배열 뒤집기 //뒤집은 값을 신규 배열에 답은후 선언
//        int[] arr = {1,2,3,4,5};
//        //신규배열 선언 : arr2
//        int[] arr2 = new int[arr.length];
//        for(int i=0;arr.length>i;i++){
//       ff     arr2[arr2.length-1-i] = arr[i];
//        }
//        System.out.println(Arrays.toString(arr2));
//
//        String[] arr_st = new String[5];
//        for(int i=0; i<arr_st.length;i++){
//            if(arr_st[i].isEmpty()){
//                System.out.println("비어있습니다.");
//            }
//        }
//
        //정렬 :sort() 함수사용
        int[] arr = {4,3,2,7,6,9,1}; //오름차순 정렬이 기본이다
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //내림차순

//        방법1 : comparator 클레스사용
//        객체타입인 경우에만 Comparator 클래스 사용 가능
        String[] st_arr = {"hello","hi", "bye", "goodmorning"};
//        Arrays.sort(st_arr);
//        System.out.println(Arrays.toString(st_arr));
//        Arrays.sort(st_arr, Comparator.reverseOrder()); //거꾸로 뒤집기
//        System.out.println(Arrays.toString(st_arr));
//        Integer[] arr_integer = {5,1,2,7,3,1,2};
        //Comparator  클래스는 기본형타입은 처리불가
//        Arrays.sort(arr_integer, Comparator.reverseOrder());
//        방법2 : 배열 뒤집기
        String[] st_arr2 = new String[st_arr.length];
        for(int i =0; arr.length>i;i++){
            st_arr2[st_arr2.length-1-i] = st_arr[i];
        }
        System.out.println(Arrays.toString(st_arr));
        // Streamapi, lambda 를 활용한 내림차순 정렬
        int[] arr2 = {5,1,2,5,3,5,6,2};
        int[] new_arr2 = Arrays.stream(arr2)//stream 객체생성하는문법
                        .boxed() // Integer 형변환한 stream 객체생성
                        .sorted(Comparator.reverseOrder())// 내림차순정렬
                        .mapToInt(a->a) //Integer를 int로 변환
                        .toArray();//배열로 변환
    }
}
