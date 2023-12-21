package C15AnonymousLamda;

import java.util.*;

public class C1504ComparableComparator {
    public static void main(String[] args) {
        //자바에서는 비교를 위한 인터페이스가 대표적으로 두개 제공되는데.
        //comparable과 comparator가 있다.
        //comparable 인터페이스에는 compareTo메서드가 선언, java의 많은 클래스에서 구현하고있음 =>일반적으로 클래스 내에서 직접 구현해서 사용하는 방식
        //comparator 인터페이스에는 compare 메서드가 선언. => 일반적으로 익명객체를 만들어서활용.


        //문자열 비교
        //두 문자열의 각 문자를 앞에서부터 순차적으로 비교
        //첫번째 문자열 자릿수에 차이가 발생할때 그 문자의 유니코드값의 차이를 반환한다.
        //유니코드값 (아스키코드라고 이해하면 좋음)
        //
        String a = "hello";
        String b = "horld";

        //list 정렬방식에는 collection, sort, collections.sort->오름차순정렬,
        //컬렉션 프레임워크 클래스에
        System.out.println(a.compareTo(b)); //String 클래스에서 불러옴 //-10

        Integer intA = 1;
        Integer intB = 1;
        System.out.println(intA.compareTo(intB));

        List<String> mylist = new ArrayList<>();
        mylist.add(a);
        mylist.add(b);
        Collections.sort(mylist); //Comparable의 compareTo메서드를 통해 정렬
        Collections.sort(mylist, Comparator.reverseOrder());
        mylist.sort(Comparator.naturalOrder());
        mylist.sort(Comparator.reverseOrder());

        //Student에서 정렬
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("일",50));
        studentList.add(new Student("이",80));
        studentList.add(new Student("삼",220));
        studentList.add(new Student("사",41));
        studentList.add(new Student("오",56));
//        for(Student stu : studentList){
//            System.out.println(stu.getName() + " " + stu.getAge());

        //정렬하는 방법 1 : Comparable 인터페이스 implements 후 compareTo메서드 구현 //매개변수1개
//            Collections.sort(studentList);
        //정렬하는 방법 2 : Comparator 를 익명객체 방식으로 활용하여 정렳    //매개변수 2개


        String[] stArr = {"hello","java","C++","world"};
        Arrays.sort(stArr, (o1, o2) -> o1.length()-o2.length());
        System.out.println(Arrays.toString(stArr)); //[C++, java, hello, world]
        Arrays.sort(stArr,Comparator.reverseOrder());

        //Priority Queue 내림차순
        Queue<String> myQue = new PriorityQueue<>(Comparator.reverseOrder());


        //comparable 을 이용한 정렬


        //3,39,34,5,9(문자라고 가정) 이 숫자들을 결합했을때 가장 큰 숫자를 구하라
        //(o1+o2) (o2+o1)
        //프로그래머스 가장 큰 수
        class solution{
        int[] numbers = {3,30,34,5,9};

            public String solution(int[] numbers) {
                StringBuilder answer = new StringBuilder();

                String[] arr = new String[numbers.length];

                for(int i =0; i < arr.length; i++){
                    arr[i] = String.valueOf(numbers[i]);
                }
                Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

                if(arr[0].equals("0")){
                    return "0";
                }
                for(int i = 0;i<arr.length; i++){
                    answer.append(arr[i]);
                }
                return answer.toString();
            }
        }

            //방법2 - 나이 기준으로 정렬
        studentList.sort(((o1, o2) -> o1.getAge()-o2.getAge()));
        System.out.println(studentList);
        //[이름은사나이는41, 이름은일나이는50, 이름은오나이는56, 이름은이나이는80, 이름은삼나이는220]


        studentList.sort(((o1, o2) -> o1.getName().compareTo(o2.getName()))); //이름으로정렬
        System.out.println(studentList);
        //[이름은사나이는41, 이름은삼나이는220, 이름은오나이는56, 이름은이나이는80, 이름은일나이는50]
            studentList.sort(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    //기본적으로 오름차순으로 정렬한다.
                    //o1.getAge()가 더 작은숫자라고 가정을 해보자.
                    //o2-o1 양수가 나온다고 한다면... >내림차순으로 // 기본적으로 오름차순이라서
                    // o2.getAge() - o1.getAge()
                    return o1.getAge() - o2.getAge();
                }
            });
            System.out.println(studentList);
            //방법1 = 이름으로 정렬

        Collections.sort(studentList);
        System.out.println(studentList);


        }

    }


class Student implements Comparable<Student>{
    private String name;


    public int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    //조상클래스인 objects 클래스에 toString을 overriding하여 객체호출시 자동으로 toString메서드호출
    @Override
    public String toString(){
        return "이름은" + this.name + "나이는" +  this.age;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}


