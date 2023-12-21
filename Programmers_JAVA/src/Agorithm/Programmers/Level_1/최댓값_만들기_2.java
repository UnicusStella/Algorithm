package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 최댓값_만들기_2 {
    public static void main(String[] args) {

        최댓값_만들기_2 stella = new 최댓값_만들기_2();

        int[] numbers1 = {1, 2, -3, 4, -5};

        int[] numbers2 = {0, -31, 24, 10, 1, 9};

        int[] numbers3 = {10, 20, 30, 5, 5, 20, 5};

        System.out.println("Answer = " + stella.solution(numbers1));
        System.out.println("Answer = " + stella.solution(numbers2));
        System.out.println("Answer = " + stella.solution(numbers3));
    }

    /*
        numbers	                    result
        [1, 2, -3, 4, -5]	        15
        [0, -31, 24, 10, 1, 9]	    240
        [10, 20, 30, 5, 5, 20, 5]	600
     */
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        return Math.max(numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length - 2]);
    }
}
