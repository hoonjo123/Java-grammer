import org.w3c.dom.ls.LSOutput;

import java.util.*;

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
//        int[] arr = {4,3,2,7,6,9,1}; //오름차순 정렬이 기본이다
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        //내림차순

//        방법1 : comparator 클레스사용
//        객체타입인 경우에만 Comparator 클래스 사용 가능
//        String[] st_arr = {"hello","hi", "bye", "goodmorning"};
//        Arrays.sort(st_arr);
//        System.out.println(Arrays.toString(st_arr));
//        Arrays.sort(st_arr, Comparator.reverseOrder()); //거꾸로 뒤집기
//        System.out.println(Arrays.toString(st_arr));
//        Integer[] arr_integer = {5,1,2,7,3,1,2};
        //Comparator  클래스는 기본형타입은 처리불가
//        Arrays.sort(arr_integer, Comparator.reverseOrder());
//        방법2 : 배열 뒤집기
//        String[] st_arr2 = new String[st_arr.length];
//        for(int i =0; arr.length>i;i++){
//            st_arr2[st_arr2.length-1-i] = st_arr[i];
//        }
//        System.out.println(Arrays.toString(st_arr));
//        // Streamapi, lambda 를 활용한 내림차순 정렬
//        int[] arr2 = {5,1,2,5,3,5,6,2};
//        int[] new_arr2 = Arrays.stream(arr2)//stream 객체생성하는문법
//                        .boxed() // Integer 형변환한 stream 객체생성
//                        .sorted(Comparator.reverseOrder())// 내림차순정렬
//                        .mapToInt(a->a) //Integer를 int로 변환
//                        .toArray();//배열로 변환

//        int [] arr = {30,22,20,25,12};
//        int temp = arr[0];
//        for(int i =0; arr.length>i; i++){
//            for(int j =i+1; arr.length-1>i; i++){
//                if(arr[i]<arr[j]){
//                    int temp1 = arr[j];
//                    arr[j] = arr[i];
//                    arr[j+1] = temp;
//                }
//            }
//            System.out.println(temp);

//오름차순
//        int[] arr = {30, 22, 20, 25, 12};
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        //숫자 조합의 합 : 각기 다른 숫자의 배열이 있을 때 만들어질 수 있는 2개의 조합의 합을 출력하라.
//        int[] int_arr = {10,20,30,40,50,60};
//        for(int i = 0; i<int_arr.length-1; i++){
//            for(int j = i+1; j<int_arr.length; j++){
//                System.out.println(int_arr[i] + " + " + int_arr[j] + " = " + (int_arr[i]+int_arr[j]));
//            }
//        }
        //중복 제거하기
//        int[] temp = {10, 10, 40, 5, 7, 40, 5, 6, 7, 8, 10, 20, 31}; //배열은 길이가 정해져있다.
//        Arrays.sort(temp);
//        int[] new_temp = new int[temp.length];
//        int index = 0;
//        for (int i = 0; i < temp.length; i++) {
//            if (i == temp.length - 1) {
//                new_temp[index] = temp[i];
//                index++;
//                break;
//            }
//            if (temp[i] != temp[i + 1]) {
//                new_temp[index] = temp[i];
//                index++;
//            }
//        }
//        new_temp[index++] = temp[temp.length ]
//        int[] answer = Arrays.copyOfRange(new_temp, 0 , index);
//        System.out.println(Arrays.toString(answer));

        //두개 뽑아서 더하기
//        int[] numbers = {2,1,3,4,1};
//        int[] numbers_combination  = new int[numbers.length * numbers.length]; //크기를 최대로 잡아놓은것
//        int combination_count = 0;
//        for(int i =0; i<numbers.length-1; i++){
//            for(int j=i+1; j<numbers.length; j++){
//                numbers_combination[combination_count] = numbers[i]+numbers[i];
//                combination_count++;
//            }
//        }
//        int[] temp = Arrays.copyOfRange(numbers_combination,0,combination_count);
//        System.out.println(Arrays.toString(temp));
//        Arrays.sort(temp);
//        int[] new_temp = new int[temp.length];
//        int index = 0;
//        for (int i = 0; i < temp.length; i++) {
//            if (i == temp.length - 1) {
//                new_temp[index] = temp[i];
//                index++;
//                break;
//            }
//            if (temp[i] != temp[i + 1]) {
//                new_temp[index] = temp[i];
//                index++;
//            }
//        }
//        new_temp[index++] = temp[temp.length-1];
//        int[] answer = Arrays.copyOfRange(new_temp, 0 , index);
//        System.out.println(Arrays.toString(answer));
//
//        int[] arr3 = {10,20,50,60,70,30,11,14,25,36,57,36,30,12,34,25,64,45,3,22,45,3,2,1,453,2536,453};
//        int index = 0;
//        int[] new_temp = new int[arr3.length];
//        for( int i =0; i<arr3.length; i++){
//            for ( int j = 0; j<arr3.length-1-i ; j++) {
//                if (arr3[j] > arr3[j+1]){
//                    int temp = arr3[j];
//                    arr3[j] = arr3[j+1];
//                    arr3[j+1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr3));

        //배열의 검색
//
//        int[] arr = {5,3,2,5,1,5,5,8,9}; //숫자 8이 배열의 몇번째에 있는지 ?
//        int answer = 0;
//        for(int i = 0; i<arr.length; i++){
//            if(arr[i]==8){
//                answer = i;
//                break;
//            }
//        }
//        System.out.println(answer);

        //answer = 7       n만큼의 복잡도를 가지고 있다.
        //바이너리써치 2진검색, 데이터가 사전에 오름차순 정렬이 되어있어야 한다.
//        int[] arr = {1,2,3,9,3,4,5,6,7};
//        //for 문과 if문을 쓰면 복잡도가 n만큼 증가한다.
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int answer = Arrays.binarySearch(arr, 3);
//        System.out.println(answer);

        //힙정렬

        //배열간의 비교 : equals
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(Arrays.equals(arr1,arr2)); //순서까지 동일해야 확인이 가능하다. 순서까지 동일하다면 true가 나온다.
        // ==을 쓰지 않도록!

        //배열복사 :  copyOf(배열, end), copyOfRange(배열, start, end)
//        int[] arr = {1,20,30,40,50};
//        int[] new_arr1 = Arrays.copyOf(arr, 10);
//        int[] new_arr2 = Arrays.copyOfRange(arr,1,4);
//        System.out.println(Arrays.toString(new_arr1));
//        System.out.println(Arrays.toString(new_arr2));

        //2차원배열 : 배열안에 또다른 배열이 있는 경우

//        int[][] arr = new int[2][3]; //[2] 전체 배열은 2개, [3] 배열 한개당 크기
//        int[][] arr2 = new int[2][];//가변배열
//        int[][] arr3 = {{1,2,3},{1,2,3}};//리터럴 방식
//        int[][] arr4 = {{10,20},{10,20,30},{10,20,30,40}};//리터럴방식
//
//        int[][] arr = new int[2][3];
////        {{1,2,3},{4,5,6}}
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;
//
//        //2차원 가별배열 선언 및 할당
//        int[][] arr2 = new int[3][];
//        arr2[0] = new int[1];
//        arr2[1] = new int[2];
//        arr2[2] = new int[3];
//
//        arr2[0][0] = 10;
//        arr2[1][0] = 20;
//        arr2[2][0] = 30;
//        System.out.println(Arrays.deepToString(arr2));

//        int[][] arr3 = {{10},{10,20,30},{10,20,30}}; //가변배열 리터럴 방식

//        [3][4] 사이즈의 배열을 선언한 뒤
//        int[][] arr4 = new int[3][4];
//        int count = 1;
////                1,2,3 ~12 까지의 숫자값 각 배열에 할당 : for를 써서 할당
//        for ( int i = 0 ; i<arr4.length; i++){
//            for(int k = 0; k<arr4[i].length; k++){
//                arr4[i][k] = count;
//                count ++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr4));
//
        //가변배열 만들기 : 전체사이즈는 5 , 각 배열마다 사이즈 1,2,3,4,5로 커지도록, 값은 count1 부터 시작해서...마지막찰때까지
//
        int[][] arr5 = new int[5][];
        int count = 1;
        for ( int i=0; i<arr5.length; i++) {
            arr5[i] = new int[i + 1];
            for (int j = 0; j < arr5[i].length; j++) {
                arr5[i][j] = count * 10;
            }
            count++;
        }
        System.out.println(Arrays.deepToString(arr5));






    }
}
