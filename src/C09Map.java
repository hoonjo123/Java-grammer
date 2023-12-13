import java.util.*;

public class C09Map {
    public static void main(String[] args) {

//        HashMap <String,String> mymap = new HashMap<>();
//        mymap.put("basketball","농구");
//        mymap.put("baseball","야구");
//        mymap.put("soccer","축구");
//        System.out.println(mymap); //삽입된 데이터에 순서가 없다.
//        System.out.println(mymap.get("baseball"));
//
//        //size(),isEmpty() 도 사용할 수 있다.
//        HashMap<String, String> mymap = null;
//        mymap.put("basketball", "탁구"); //put을 통해서 덮어쓰기, (이미 key가 있을경우)
//
//        // mymap.putIfAbsent("baseball","배구"); // 없으면 넣어라.
//        System.out.println(mymap);
//
//        //getOrDefault : 없으면 default를 준다? 초기값처럼 사용가능
//        System.out.println(mymap.get("tennis")); //null
//        System.out.println(mymap.getOrDefault("tennis","sports")); //sports
//        System.out.println(mymap.containsKey("tennis")); //false
//
//        mymap.remove("baseball");
//        System.out.println(mymap);
//        System.out.println(mymap.keySet()); //[soccer, basketball]
//        System.out.println(mymap.values()); //[축구, 탁구]
//
//        //enhanced for : key값 하나씩 출력.
//
//        for(String a : mymap.keySet()){
//            System.out.println(a);
//
//        }
        //iterator 을 통해 key값을 하나씩 출력.
//        mymap = new HashMap<>();
//        mymap.put("basketball", "농구");
//        mymap.put("baseball", "야구");
//        mymap.put("soccer", "축구");
//        Iterator<String> myIter = mymap.keySet().iterator();
        //next() 메서드는 데이터를 소모시키면서 return
//        System.out.println(myIter.next());
//        System.out.println(myIter);
        //hasnext() : Iterator 안에 값이 있는지 없는지.
//
//        while(myIter.hasNext()){
//            System.out.println(myIter.next());
//        }
// 아래의 리스트를 가지고 좋아하는 운동종목과 사람숫자를 map형태로 나타내시오.
//        List<String> myList = new ArrayList<>();
//        myList.add("baseketball");
//        myList.add("baseketball");
//        myList.add("baseketball");
//        myList.add("tennis");
//        myList.add("tennis");
//        myList.add("tennis");
//        myList.add("baseball");
//        myList.add("baseball");
//        myList.add("baseball");
//
//        Map<String, Integer> myMap = new HashMap<>();
//        for (String a : myList) {
//            if (myMap.containsKey(a)) {
//                myMap.put(a, myMap.get(a) + 1);
//            } else {
//                myMap.put(a, 1);
//            }
//            myMap.put(a, myMap.getOrDefault(a,0)+1);
//        }

        //완주하지 못한 선수
//        String[] participant = {"leo","kiki","eden"};
//        String[] completion = {"eden","kiki"};
//        HashMap<String,Integer>map = new HashMap<>();
//        for(String player : participant){
//            map.put(player,map.getOrDefault(player,0) + 1);
//            for(String player : completion){
//                map.put(player, map.get(player)-1);
//                Iterator<Map.Entry<String,Integer>> iter = map.entrySet().iterator();
//
//                while(iter.hasNext()){
//                    Map.Entry<String, Integer> entry = iter.next();
//                    if(entry.getValue() != 0){
//                        answer = entry.getKey();
//                        break;
//                    }
//                }

//            }





//        }



//        }
        //LinkedHashMap : 데이터 삽입 순서 유지
        Map<String,Integer> mymap = new LinkedHashMap<>();
        mymap.put("Hello5" ,1);
        mymap.put("Hello4" ,1);
        mymap.put("Hello3" ,1);
        mymap.put("Hello2" ,1);
        mymap.put("Hello1" ,1);

        System.out.println(mymap);
//        {Hello5=1, Hello4=1, Hello3=1, Hello2=1, Hello1=1}


        //treemap : 키를 통해 데이터 정렬
        Map<String,Integer> mymap2 = new TreeMap<>();
        mymap2.put("Hello5" ,1);
        mymap2.put("Hello4" ,1);
        mymap2.put("Hello3" ,1);
        mymap2.put("Hello2" ,1);
        mymap2.put("Hello1" ,1);

        System.out.println(mymap2);//
//        {Hello1=1, Hello2=1, Hello3=1, Hello4=1, Hello5=1}
    }
}
