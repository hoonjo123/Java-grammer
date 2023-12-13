import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class javapractice {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("basketball");
        myList.add("basketball");
        myList.add("basketball");
        myList.add("baseball");
        myList.add("baseball");
        myList.add("baseball");
        myList.add("tennis");
        myList.add("tennis");
        myList.add("tennis");

        System.out.println(myList);

        Map<String, Integer> mymap = new HashMap<>();
        for(String a : myList) {
            if(mymap.containsKey(a)) {
                mymap.put(a, mymap.get(a) + 1);
            }else{
                mymap.put(a, 1);
            }
            mymap.put(a,mymap.getOrDefault(a,0)+1);
        }
        System.out.println();
    }
}
