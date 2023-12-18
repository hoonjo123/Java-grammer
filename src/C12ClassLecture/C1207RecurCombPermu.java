package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1207RecurCombPermu {
    public static void main(String[] args) {
        //재귀함수를 쓰는 대표적인 경우 comb(조합) 와 permu(순열)
        List <Integer> mylist = new ArrayList<>(Arrays.asList(1,2,3,4));
        //두개씩 조합을 찾아보자
        List<List <Integer>> combination = new ArrayList<>();

        for(int i=0; i<mylist.size();i++){
            for(int j=i+1; j<mylist.size(); j++){
                List<Integer> temp = new ArrayList<>();
                temp.add(mylist.get(i));
                temp.add(mylist.get(j));
                combination.add(temp);
            }
        }
        System.out.println(combination); //[[1, 2], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]]
    }
}
