import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C08List {
    public static void main(String[] args) {
//        List 선언방법
//        ArrayList<String> myList = new ArrayList<String>(); //가장 원초적인 방식

//        List<String> myList = new ArrayList<>(); //가장 원초적인 방식
        //가장 일반적인 방식
        //왼쪽엔 인터페이스, 오른쪽에 구현체

        //초기값 생성방법
//        myList.add("java");
//        myList.add("python");
//        myList.add("C++");
//        System.out.println(myList); //내부적으로 이미 toString이 접목되어있다.

        //한꺼번에 add하는방법 / 배열을 이용한 변환 / 배열이 int인 경우 한꺼번에 형변환하는게 문제가 된다.
//        String[] myArr1 = {"java","python","C++"};
//        List<String> myList2 = new ArrayList<>(Arrays.asList("java","python","C++"));
//        //배열이 int인경우
//        int[] myIntarr1 = {2,3,4};
////        List<Integer>myIntList1 = new ArrayList<>(Arrays.asList(myIntarr1)); //에러가 뜬다 , 형변환이슈
//        List<Integer>myIntList1 = new ArrayList<>();
//        for ( int a : myIntarr1){
//            myIntList1.add(a);
//        }
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        // add(int index);, int element(); 사이에 끼워넣는것은 기본적으로 성능저하를 유발시킨다
//        myList.add(1, 15); //사이에 끼워넣는것은 기본적으로 성능저하를 유발시킨다
//        System.out.println(myList);
//
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(30);
//        myList2.add(40);
//        myList2.add(50);
//
//        // addall(collection객체)
//        myList.addAll(myList2); //myList에 myList2를 addAll
//        System.out.println(myList); //[10, 15, 20, 30, 40, 50]
//
//        // get(int : index) : 특정 위치의 요소를 반환
//        System.out.println(myList.get(0)); //그냥 조회하는거
//
//        for(int i = 0;i<myList.size();i++){ //for문을 써서 조회해보기
//            myList.get(i);
//            System.out.println(myList.get(i));
//        }
//
//        //remove :요소삭제
//        //요소삭제 방법1 remove 는 value 삭제, index를 통한 삭제
//
//        // list에서 index를 통한 삭제
//        myList.remove(0);
//        System.out.println(myList); //[15, 20, 30, 40, 50] 10이 삭제가 되었다.
//        myList.remove(Integer.valueOf(15)); //[20, 30, 40, 50] //index 15인지 value 15인지 모르니까 객체로 명확하게 변환해서
//        System.out.println(myList);
//
//        //set(int index, E element) : index자리에 값을 변경하는 것
//        myList.set(myList.size()-1, 100);
//        System.out.println(myList); //[20, 30, 40, 50]  -> [20, 30, 40, 100]
//
//        //contains ; 특정값이 있는지 없는지 boolean으로 return한다.
//        System.out.println(myList.contains(30)); //true
//

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        System.out.println(myList);
//        //indexOf : 몇번째 index에 위치해 있는지 return
//        //찾으려는 요소가 없으면 -1 return
//        System.out.println(myList.indexOf(10)); //0 //같은 숫자가 있으면 첫번째 값을 return한다.
//        System.out.println(myList.indexOf(20)); //2
//        // isEmpty : 값이 비었는지 어떤지
//        System.out.println(myList.isEmpty()); //false
//        // 전체삭제 : clear
//        myList.clear();
//        System.out.println(myList);  //[]
//        System.out.println(myList.isEmpty()); //true
//        // -- 기본 메서드 끝 --
//
//        //리스트 출력
//        List<int[]> myList2 = new ArrayList<>();
//        myList2.add(new int[]{1,2,3});
//        myList2.add(new int[2]);
//        myList2.add(new int[3]);
//        myList2.get(1)[0] = 10;
//        myList2.get(1)[1] = 20;
//        for(int[] a : myList2){
//            System.out.println(Arrays.toString(a));
//        }
//
//        for(int i = 0; i<myList2.size(); i++){
//            System.out.println(Arrays.toString(myList2.get(i)));
//        }
//
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[3]);
//        myList.add(new int[3]);
//        myList.add(new int[3]);
//
//        //위 list에 값 1,2,3 10,20,30 100,200,300
//        int count = 1;
//        for(int i=0; i<myList.size(); i++){
//            for(int j=0; j<myList.get(i).length; j++){
//                myList.get(i)[j] = (j+1)*count;
//
//            }
//            count *= 10;
//            System.out.println(Arrays.toString(myList.get(i)));
//        }
//        //[1, 2, 3]
//        //[10, 20, 30]
//        //[100, 200, 300]

//        List<Integer> myList = new ArrayList<>(Arrays.asList(5,3,2,1,5));

        //List 정렬 1 : collection.sort[]
//        Collections.sort(myList);
//        System.out.println(myList); //오름차순
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList); //내림차순
//
        //List 정렬 2 : 개체.sort()

//        myList.sort(Comparator.naturalOrder()); //java 9이상
//        System.out.println(myList); //오름차순
//        myList.sort(Comparator.reverseOrder());
//        System.out.println(myList); //내림차순

        //1. String 배열을 List로 변환

//        String [] mySt = {"10","20","30"};
//        List<String> mySt1 = new ArrayList<>(Arrays.asList(mySt)); //방법 1-1
//        System.out.println(mySt1); //[10, 20, 30]

//        for(String a : mySt ){ //방법 1-2
//            mySt1.add(a);
//        }
//        System.out.println(mySt1);
//
//        List<String> mySt3 = Arrays.stream(mySt).collect(Collectors.toList());
//
        //2. int 배열을 List로 변환

//        int [] myint = {1,2,3,4,5};
        //위 Arrays.asList 사용불가
        // for문 담기는 가능 (자동으로 형변환)
//        List<Integer> mySt4 = Arrays.stream(myint).boxed().collect(Collectors.toList());


        //3. String 리스트를 String 배열로 변환
//        List<String> newst4 = new ArrayList<>();
//        newst4.add("Hello");
//        newst4.add("java");
//        newst4.add("python");
//        newst4.add("house");
        //3-1 for문으로 할당하는 방식
//        String[] newst1 = new String[newst4.size()];
//        for(int i=0;i<newst1.length;i++){
//            newst1[i] = newst4.get(i);
//        System.out.println();
//    }

    //3-2 StreamAPI
//        String[] Starr2 = newst4.stream().toArray(a->new String[a]);
    //4 int 리스트를 int배열로 변환

    //두개뽑아서 더하기를 List로 풀어보기
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
//        int[] numbers = {2, 1, 3, 4, 1};
//        List<Integer> resultList = getRandomSum(numbers);
//
//        // 결과 출력
//        System.out.println("Selected numbers: " + resultList.get(0) + ", " + resultList.get(1));
//        System.out.println("Sum: " + (resultList.get(0) + resultList.get(1)));
//    }

//    int[] numbers = {2, 1, 3, 4, 1};
//        List<Integer> resultList = getRandomSum(numbers);
//
//        // 결과 출력
//        System.out.println("Selected numbers: " + resultList.get(0) + ", " + resultList.get(1));
//        System.out.println("Sum: " + (resultList.get(0) + resultList.get(1)));


//        System.out.println();

        //n의 배수 고르기
//        int[] numlist = {4,5,6,7,8,9,10,11,12};
//        List<Integer> new_number = new ArrayList<>();
//        int n = 3;
//        for(int i=0;i<numlist.length;i++){
//            if(numlist[i] % n ==0){
//                new_number.add(numlist[i]);
//            }
//        }
//        System.out.println(new_number);
//        int[] new_numlist = new int[new_number.size()];
//        for(int i=0; i<new_number.size(); i++){
//            new_numlist[i] = new_number.get(i);
//        }
//        System.out.println();


        //map
        // key+해시함수를 가지고 해시값을 만들고, 이 해시값으로 key:value의 주소값을 삼는다.

//        이후, key 를 가지고 값을 찾고자 할 때, 항상 같은 해시값을 얻을 수 있으므로 o(1) 복잡도로 빠르게 검색가능






    }
}







