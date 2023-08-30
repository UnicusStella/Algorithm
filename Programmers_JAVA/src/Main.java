import Agorithm.Programmers.Level_1.배열_뒤집기;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        배열_뒤집기 stella = new 배열_뒤집기();

        int[] num_list1 = {1, 2, 3, 4, 5};
        int[] num_list2 = {1, 1, 1, 1, 1, 2};
        int[] num_list3 = {1, 0, 1, 1, 1, 3, 5};

        System.out.println("Answer1 = " + Arrays.toString(stella.solution(num_list1)));
        System.out.println("Answer1 = " + Arrays.toString(stella.solution(num_list2)));
        System.out.println("Answer1 = " + Arrays.toString(stella.solution(num_list3)));
    }
}
/*
        [1, 2, 3, 4, 5]	[5, 4, 3, 2, 1]
        [1, 1, 1, 1, 1, 2]	[2, 1, 1, 1, 1, 1]
        [1, 0, 1, 1, 1, 3, 5]	[5, 3, 1, 1, 1, 0, 1]
 */