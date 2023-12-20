package C12ClassLecture;

import javax.swing.event.ListDataListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1207RecurCombPermu {
    public static void main(String[] args) {
        //재귀함수를 쓰는 대표적인 경우 comb(조합) 와 permu(순열)
        List <Integer> mylist = new ArrayList<>(Arrays.asList(1,2,3,4));
        //두개씩 조합을 찾아보자
        List<List <Integer>> combination = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();// 구조를 맞추기위해 안에 있던걸 밖으로 뺌
        for(int i=0; i<mylist.size();i++){
            temp.add(mylist.get(i));
            for(int j=i+1; j<mylist.size(); j++){
                temp.add(mylist.get(j));
                combination.add(new ArrayList<>(temp));//temp를 더하면 안됨 : 밖에서 temp선언되서 주소가 있는데 아래 temp.remove에서 temp를 지워버리면 곤란해짐.
                //그러면? 객체를 새롭게 만들어야함 즉, temp의 주소가 아닌 값을 다시 집어넣어주어야 함.
                temp.remove(temp.size()-1); //더해주고나서 remove로 잘라주는거 더하고버리고 더하고 버리고 .. index값 1번째
            }
            temp.remove(temp.size()-1); //1,2 1,3 1,4 // 0번째 인덱스를 버리고 // 2,3 2,4 //또 버리고  3,4 이럭식으로 : index 값 0번째
        }
        System.out.println(combination); //[[1, 2], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]]
    }

    static void combination(List<Integer> mylist, List<Integer> temp, List<List<Integer>> combination,int n,int start){
        //1,2,3,4

        if(temp.size() == 2){
            combination.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start; i<mylist.size(); i++) { //지속적으로 변화해야한다. i+1부터 스타트하게 해야함. 0으로 하게 될 경우 순열이 되므로
            // 변수화 해서 숫자가 들어가면 +1이 되도록 해주어야함.
            temp.add(mylist.get(i));
            combination(mylist, temp, combination, n, i + 1); //start +1,i+1 의 차이
            temp.remove(temp.size() - 1);
            //i 와 j로 구분지어보자
//            i=0 이고 j=1일인 상황에서 temp: 1,2  가 담겼다. ...
        }

        //프로그래머스 구슬을 나누는 경우의 수


    }
}
