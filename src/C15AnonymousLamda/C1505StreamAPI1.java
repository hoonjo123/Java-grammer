package C15AnonymousLamda;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.IntBinaryOperator;
import java.util.stream.Stream;


public class C1505StreamAPI1 {
    public static void main(String[] args) {
//
//        int[] arr = {20,10,4,12};
//        //전통적인 방식의 데이터 접근 방식
//        for(int i = 0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
//
//        //데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 프로그래밍 방식
//        //java에서 함수형프로그래밍을 지원하기위한 라이브러리 -> StreamApi
//        //forEach는 Stream의 각 요소를 소모하면서 동작을 수행한다. //Enhanced for 문과 비슷하다.
//        Arrays.stream(arr).forEach(a -> System.out.println(a));
//
//        Arrays.stream(arr).sorted().forEach(a -> System.out.println(a)); //정렬하고 하나씩 뽑아내기 4,10,12,20
//
//        //스트림의 중개연산 : map, sorted, filter
//        String[] myArr = {"world","hello","java"};
//        String[] newarr = Arrays.stream(myArr).sorted().toArray(String[]::new);
//
        int[] arr1 = {1,2,3,4,5};
//        int answer = Arrays.stream(arr1).sum();
//        System.out.println(answer); //15

        //초기값을 지정하지 않으면 optional 객체 return
        //optional객체 : 값이 있을수도 있고, 없을수도 있다는 것을 명시한 타입
//        String st1 = null;
//        System.out.println(st1.length());
//        Optional<String> myOptional = Optional.ofNullable("hello");
//        if(myOptional.isPresent()){
//            System.out.println(myOptional.get().length());
//        }
        //reduce 누적연산
        //스트림소모 : forEach, reduce
        int result1 = Arrays.stream(arr1).reduce(1, (a,b) -> a*b); //120 배열의 누적 곱셈.
        System.out.println(result1);
        int result = Arrays.stream(arr1).reduce(0, (a,b) -> a+=b); //15 배열의 누적 합.
        System.out.println(result);
        int result2 = Arrays.stream(arr1).reduce((a,b) -> a+b).getAsInt();
        System.out.println(result2); //15


        String[] starr = {"hello","java","world"};
        Optional<String> answer = Arrays.stream(starr).reduce((a,b) -> a + ", " + b);
        if(answer.isPresent()){ //있으면 반환
            System.out.println(answer.get());
        }

        //count() : intstream과 stream<String>, sum()
        //map(a -> a.length()).sum() 실수 많이 하는 부분 맵사용할 일이 있을때 StreamInteger값이 들어가기 때문에 불가능
        //min() , max(int Stream)
        //findFirst(), findAny()
        //min() 최소, max()는 최대값, average()는 평균 -> optional 객체로 변환.

        //최소/최대/평균/총합 min max average sum
        List<Integer> mylist1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int[] myarr = new int[mylist1.size()];
        for(int i = 0; i < mylist1.size(); i++){
            myarr[i] += mylist1.get(i);
        }
        int answer94 = Arrays.stream(myarr).sum();
        System.out.println(answer94); //15

        //min, max, sum, avrg, count
        List<Integer> mylist2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//        mylist2.stream().map(a->a+1).min(객체);
        System.out.println(mylist2.stream().mapToInt(a->a).min().getAsInt());
        System.out.println(mylist2.stream().mapToInt(a->a).max().getAsInt());
        System.out.println(mylist2.stream().mapToInt(a->a).sum());
        System.out.println(mylist2.stream().mapToInt(a->a).average().getAsDouble());
        System.out.println(mylist2.stream().count());

        //findFirst: 들어가있는것중에 가장 앞에 있는것
        List<Student> myStudents = new ArrayList<>();
        myStudents.add(new Student("jo",25));
        myStudents.add(new Student("kim",35));
        myStudents.add(new Student("jeong",45));
        myStudents.add(new Student("jong",20));
        myStudents.add(new Student("king",34));
        Student s1 = myStudents.stream().filter(a->a.getAge()>30).findFirst().get();
        System.out.println(s1);
        Student s2 = myStudents.stream().findAny().get(); //병렬처리 이슈가 있을 수 있어서 안 씀.
        System.out.println(s2);

        //Student 객체 실습
        //1. 가장 나이 어린사람 찾기
        myStudents.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).findFirst().get();
        myStudents.stream().min((o1, o2) -> o1.getAge() - o2.getAge()).get();
        System.out.println(myStudents.stream().mapToInt(a -> a.getAge()).min().getAsInt()); //20

        //2. 30대가 몇명인지 출력
        System.out.println(myStudents.stream().filter(a -> a.getAge() >= 30).count()); //3
        //3. 모든 객체의 평균나이 출력
        System.out.println(myStudents.stream().mapToInt(a -> a.getAge()).average().getAsDouble()); // 31.8
//        Student s5 = myStudents.stream().mapToInt(a -> a).average();
        //4. 이벤트상황이였다고 가정을 하고 30세 이하 선착순 누구인지 객체 출력
        System.out.println(myStudents.stream().filter(a -> a.getAge()<=30).map(a -> a.getName()).findFirst().get()); //jo

        //기존의 java의 Null
        String st = null;
        if(st != null){ //전통적인 해결 방법
        System.out.println(st.compareTo("abc"));
        } //null포인트 exception

        //java 8이후에 나온 Optional 객체를 통해 특정 객체에 값이 없을지도 모른다는것을 명시적으로 표현

//        Optional<객체> 빈 값을 명시적으로 넣는 방법은 Optional.empty();
        Optional<String> opt1 = Optional.empty(); //내부적으로 비어있는 값이다.
        //빈값인지 아닌지 체크하는 메서드가 필요하다 : isPresent()
        if(opt1.isPresent()){
        System.out.println(opt1.get().compareTo("abc"));
        }else{
            System.out.println("값이 없습니다");
        };//no such ElementException

        //Optional 객체 생성
        Optional<String> opt2 = Optional.ofNullable("hello");
            //null이 있을수도 있음을 의미.
            //orElse 관련 메서드 사용하여 null(빈값)처리
            //orElse, orElseGet(), orElseThrow()
            //opt2.orElse(""); //없으면 "" <- 빈값을 넣어주겠다.

        //orElse는 값이 있으면 해당 값을 리턴, 없으면 default 지정값 return
        System.out.println(opt2.orElse("").compareTo("abc")); //<-hello랑 abc를 비교한거

        //orElseGet() <- 매게변수로 람다함수 또는 메서드 참조가 들어간다. 값이 있으면 해당값 리턴, 없으면 람다함수 또는 메소드참조 실행
        System.out.println(opt1.orElseGet(String::new));

        System.out.println(opt1.orElseGet(() -> new String()).compareTo("abc"));
        //orElseThrow() <- 값이 있으면 해당 값 리턴, 없으면 지정된 예외 강제 발생 ** 중요
        int result12 = opt1.orElseThrow(()->new NoSuchElementException("객체에 값이 없습니다.")).compareTo("abc");
        System.out.println(result12);

        //OptionalInt, OptionalDouble
        OptionalInt oi = new ArrayList<>(Arrays.asList(1,2,3,4)).stream().mapToInt(a -> a).max();

        //ispresent로 체크
        if(oi.isPresent()) {
        }else {
        }

        //orelse 문의 방법활용
        System.out.println(oi.orElseThrow(()->new NoSuchElementException("no value")));

        int[] arr = {1,2,3,4};

        int total = 0;
        for(int a : arr){
            System.out.println(a);
            total += a;
        }
    }
}
