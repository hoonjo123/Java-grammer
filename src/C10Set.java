import apple.laf.JRSUIUtils;

import java.util.*;

public class C10Set{
    public static void main(String[] args) {
//      중복 없고 순서없다.
//        Set<String> mySet = new HashSet<>();
//        mySet.add("H");
//        mySet.add("H");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);
//      [e, H, l, o]   중복값제거, 순서 뒤죽박죽 집합처럼 생각하면 좋다.
//      실습 1.반 학생들이 좋아하는 운동종목 리스트형태로 만들고 좋아하는 종목만 추리도록 Set으로 변환해보기
        List<String> favoritesports = new ArrayList<>();
        favoritesports.add("basketball");
        favoritesports.add("basketball");
        favoritesports.add("basketball");
        favoritesports.add("baseball");
        favoritesports.add("baseball");
        favoritesports.add("baseball");
        favoritesports.add("tennis");
        favoritesports.add("tennis");
        favoritesports.add("tennis");

//        Set<String> favorite = new HashSet<>();
//        favorite.add(favoritesports.get(0));
//        for(int i =0;i<favoritesports.size(); i++){
//            String temp = favoritesports.get(i);
//            favorite.add(temp);
//        }
//        System.out.println(favorite.size()); //3

//        Set<String> mySet = new HashSet<>();
//        System.out.println(mySet.size());
//        //list를 인자값으로 받아 초기값 세팅 가능
//
//        //배열을 인자값으로 받아 set 초기값 세팅
//        String[] arr = {"C","java","python","java","python"};
//        Set<String> mySet1 = new HashSet<>(Arrays.asList(arr));
//        System.out.println(mySet1); //[python, C, java]
//        mySet1.remove("java");
//        System.out.println(mySet1); //[python, C]
//
//        int[] myint = {1,2,3,4,5};
////      Set<Integer> mySet2 = new HashSet<>(Arrays.asList(myint));  //형변환 이슈로 인해 불가능하다.
//        Set<Integer> myset2 = new HashSet<>();
//        for(int a : myint){
//            myset2.add(a);
//        }
//        System.out.println(myset2); // [1, 2, 3, 4, 5]


        Set<String> mySet1 = new HashSet<>(Arrays.asList("Java","Python","javascript"));
        Set<String> mySet2 = new HashSet<>(Arrays.asList("Java","Python","CSS"));


        //교집합 : retainAll
        Set<String> temp1 = new HashSet<>(mySet1);
        temp1.retainAll(mySet2);
        System.out.println(temp1); //[Java, Python]
        //합집합 : addAll
        temp1 = new HashSet<>(mySet1);
        temp1.addAll(mySet2);
        System.out.println(temp1); // [Java, CSS, javascript, Python]
        //차집합 : removeAll
        temp1 = new HashSet<>(mySet1);
        temp1.removeAll(mySet2);
        System.out.println(temp1); // [javascript]

        //프로그래머스 : 전화번호 목록 풀어보기

        //순서가 없으므로 enhanced for문, iterator사용
        //Linkedhashset, treeset
        Set<String> mySet = new TreeSet<>();
        mySet.add("Hello5");
        mySet.add("Hello4");
        mySet.add("Hello3");
        mySet.add("Hello2");
        mySet.add("Hello1");
        System.out.println(mySet);
        //[Hello1, Hello2, Hello3, Hello4, Hello5] 기본 오름차순

        //프로그래머스 : 두개 뽑아서 더하기 treeSet 사용해서 풀어보자


        Stack<String> newStack = new Stack<>();


    }
}
