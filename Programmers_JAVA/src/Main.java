import Agorithm.Programmers.Level_1.이차원으로_만들기;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        이차원으로_만들기 stella = new 이차원으로_만들기();

        int[] num_list1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int n1 = 2;

        int[] num_list2 = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n2 = 3;

        System.out.println("Answer1 = " + Arrays.deepToString(stella.solution(num_list1, n1)));
        System.out.println("Answer1 = " + Arrays.deepToString(stella.solution(num_list2, n2)));
    }
}
/*
        num_list	                        n	    result
        [1, 2, 3, 4, 5, 6, 7, 8]	        2	    [[1, 2], [3, 4], [5, 6], [7, 8]]
        [100, 95, 2, 4, 5, 6, 18, 33, 948]	3	    [[100, 95, 2], [4, 5, 6], [18, 33, 948]]
 */