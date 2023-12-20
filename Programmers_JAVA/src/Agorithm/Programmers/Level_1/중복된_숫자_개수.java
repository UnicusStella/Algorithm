package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 중복된_숫자_개수 {
    public static void main(String[] args) {

        중복된_숫자_개수 stella = new 중복된_숫자_개수();

        int[] array1 = {1, 1, 2, 3, 4, 5};
        int n1 = 1;

        int[] array2 = {0, 2, 3, 4};
        int n2 = 1;

        System.out.println("Answer1 = " + stella.solution(array1, n1));
        System.out.println("Answer2 = " + stella.solution(array2, n2));
    }

    /*
        array	                n	    result
        [1, 1, 2, 3, 4, 5]	    1	    2
        [0, 2, 3, 4]	        1	    0
     */

    public int solution(int[] array, int n) {
        int answer = 0;

        return (int) Arrays.stream(array).filter(value -> value == n).count();
    }
}
