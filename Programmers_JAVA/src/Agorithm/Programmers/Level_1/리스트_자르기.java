package Agorithm.Programmers.Level_1;

import java.util.ArrayList;
import java.util.Arrays;

public class 리스트_자르기 {
    public static void main(String[] args) {

        리스트_자르기 stella = new 리스트_자르기();

        int n1 = 3;
        int[] slicer1 = {1, 5, 2};
        int[] num_list1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int n2 = 4;
        int[] slicer2 = {1, 5, 2};
        int[] num_list2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Answer = " + Arrays.toString(stella.solution(n1, slicer1, num_list1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(n2, slicer2, num_list2)));
    }

    /*
        n	slicer	    num_list	                    result
        3	[1, 5, 2]	[1, 2, 3, 4, 5, 6, 7, 8, 9]	    [2, 3, 4, 5, 6]
        4	[1, 5, 2]	[1, 2, 3, 4, 5, 6, 7, 8, 9]	    [2, 4, 6]
     */
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};

        switch (n) {
            case 1:
                return Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
            case 2:
                return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
            case 3:
                return Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
            case 4:
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                    list.add(num_list[i]);
                }
                return list.stream().mapToInt(Integer::intValue).toArray();
        }
        return answer;
    }
}