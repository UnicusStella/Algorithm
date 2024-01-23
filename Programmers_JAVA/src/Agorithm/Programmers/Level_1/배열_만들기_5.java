package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 배열_만들기_5 {
    public static void main(String[] args) {

        배열_만들기_5 stella = new 배열_만들기_5();

        String[] intStrs1 = {"0123456789", "9876543210", "9999999999999"};
        int k1 = 50000;
        int s1 = 5;
        int l1 = 5;

        System.out.println("Answer = " + Arrays.toString(stella.solution(intStrs1, k1, s1, l1)));

    }

    /*
        intStrs	                                        k	    s	l	result
        ["0123456789","9876543210","9999999999999"]	    50000	5	5	[56789, 99999]
     */
    public int[] solution(String[] intStrs, int k, int s, int l) {

        return Arrays.stream(intStrs)
                .mapToInt(value -> Integer.parseInt(value.substring(s, s + l)))
                .filter(value -> value > k)
                .toArray();

    }
}
