package C12ClassLecture;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1207RecurCombPermuPractice {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4)); //1,2,3,4
        List<List<Integer>> combination_list = new ArrayList<>();
        int n = 2;

//        combination(myList, combination_list, new ArrayList<>(), 0, n);
        permutation(myList, combination_list, new boolean[myList.size()], new ArrayList<Integer>(), n);
        System.out.println(combination_list);

        //
    }

    static void combination(List<Integer> myList, List<List<Integer>> combination_list, List<Integer> temp, int start, int n) {
        if (temp.size() == n) {
            combination_list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < myList.size(); i++) {
            temp.add(myList.get(i));
            combination(myList, combination_list, temp, i + 1, n);
            temp.remove(temp.size() - 1);

        }
    }

    static void permutation(List<Integer> myList, List<List<Integer>> combination_list, boolean[] visited, List<Integer> temp, int n) {
        // List 를 하나하나 조회하고 더한 값이 6보다 클 때 담아준다.
        if (temp.size() == n) {
            int sum = 0;
            for ( int a : temp ){
                sum = sum + a;
            }
            if(sum >= 6){
            combination_list.add(new ArrayList<>(temp));}
            return;
        }
        for (int i = 0; i < myList.size(); i++) {
            if (visited[i] == false) {
                visited[i] = true;
                temp.add(myList.get(i));
                permutation(myList, combination_list, visited, temp, n);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }

    static void permutation_quiz(List<Integer> myList, List<List<Integer>> combination_List, boolean[] visited, List<Integer> temp, int n){
        if(temp.size() == n){
            combination_List.add(new ArrayList<>(temp));

            return;
        }
    }


}