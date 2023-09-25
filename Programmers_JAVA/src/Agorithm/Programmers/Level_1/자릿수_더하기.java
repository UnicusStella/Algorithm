package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 자릿수_더하기 {
    public static void main(String[] args) {

        자릿수_더하기 stella = new 자릿수_더하기();

        int n1 = 1234;

        int n2 = 930211;

        System.out.println("Answer = " + stella.solution(n1));
        System.out.println("Answer = " + stella.solution(n2));
    }

    /*
        n	        result
        1234	    10
        930211	    16
     */
    public int solution(int n) {
        int answer = 0;
        return Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
