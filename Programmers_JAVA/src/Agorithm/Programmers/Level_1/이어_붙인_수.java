package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 이어_붙인_수 {
    public static void main(String[] args) {

        이어_붙인_수 stella = new 이어_붙인_수();

        int[] num_list1 = {3, 4, 5, 2, 1};

        int[] num_list2 = {5, 7, 8, 3};

        System.out.println("Answer = " + stella.solution(num_list1));
        System.out.println("Answer = " + stella.solution(num_list2));
    }

    /*
        num_list	        result
        [3, 4, 5, 2, 1]	    393
        [5, 7, 8, 3]	    581
     */
    public int solution(int[] num_list) {

        String even = Arrays.stream(num_list).boxed()
                .filter(value -> value % 2 == 0)
                .map(String::valueOf)
                .collect(Collectors.joining());

        String odd = Arrays.stream(num_list).boxed()
                .filter(value -> value % 2 != 0)
                .map(String::valueOf)
                .collect(Collectors.joining());

        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}
