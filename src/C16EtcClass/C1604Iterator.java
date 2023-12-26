package C16EtcClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C1604Iterator {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        mylist.add("apple");
        mylist.add("banana");
        mylist.add("cherry");
        mylist.add("strawberry");

        //enhanced for문 " 원본이 변경안됨 삭제(remove)불가
        for (String fruits : mylist) {
            System.out.println(fruits);
            //remove method 없음
        }
        //참조하고 있는 원본데이터 삭제 가능 : remove
        Iterator<String> iterator = mylist.iterator();
        while (iterator.hasNext()) {
            String temp = iterator.next();
            if(iterator.next().equals("banana")){
                iterator.remove();
            }
        }
        System.out.println(mylist);

    }
}
