package Agorithm.Programmers.Level_1;

import java.util.*;

public class 뒤에서_5등_위로 {
    public static void main(String[] args) {

        뒤에서_5등_위로 stella = new 뒤에서_5등_위로();

        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};

        System.out.println("Answer = " + Arrays.toString(stella.solution(num_list)));
    }

    /*
        num_list	result
        [12, 4, 15, 46, 38, 1, 14, 56, 32, 10]	[15, 32, 38, 46, 56]
     */
    public int[] solution(int[] num_list) {
        int[] answer = {};

        Arrays.sort(num_list);

        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }

    public int[] solution2(int[] num_list) {

        return Arrays.stream(num_list).sorted().skip(5).toArray();
    }
}