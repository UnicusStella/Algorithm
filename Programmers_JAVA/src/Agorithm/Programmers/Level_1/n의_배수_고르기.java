package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class n의_배수_고르기 {
    public static void main(String[] args) {

        n의_배수_고르기 stella = new n의_배수_고르기();

        int n1 = 3;
        int[] numlist1 = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        int n2 = 5;
        int[] numlist2 = {1, 9, 3, 10, 13, 5};

        int n3 = 12;
        int[] numlist3 = {2, 100, 120, 600, 12, 12};

        System.out.println("Answer = " + Arrays.toString(stella.solution(n1, numlist1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(n2, numlist2)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(n3, numlist3)));
    }

    /*
        n	    numlist	                            result
        3	    [4, 5, 6, 7, 8, 9, 10, 11, 12]	    [6, 9, 12]
        5	    [1, 9, 3, 10, 13, 5]	            [10, 5]
        12	    [2, 100, 120, 600, 12, 12]	        [120, 600, 12, 12]
     */
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        return Arrays.stream(numlist)
                .filter(value -> value % n == 0)
                .toArray();
    }
}