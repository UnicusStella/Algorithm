package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 카운트_업 {
    public static void main(String[] args) {

        카운트_업 stella = new 카운트_업();

        int start_num1 = 3;
        int end_num1 = 10;

        System.out.println("Answer = " + Arrays.toString(stella.solution(start_num1, end_num1)));
    }

    /*
        start_num	end_num	    result
        3	        10	        [3, 4, 5, 6, 7, 8, 9, 10]
     */
    public int[] solution(int start_num, int end_num) {

        return IntStream.rangeClosed(start_num, end_num)
                .toArray();
    }
}
