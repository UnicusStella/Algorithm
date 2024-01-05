package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 연속된_수의_합 {
    public static void main(String[] args) {

        연속된_수의_합 stella = new 연속된_수의_합();

        int num1 = 3;
        int total1 = 12;

        int num2 = 5;
        int total2 = 15;

        int num3 = 4;
        int total3 = 14;

        int num4 = 5;
        int total4 = 5;

        System.out.println("Answer = " + Arrays.toString(stella.solution(num1, total1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(num2, total2)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(num3, total3)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(num4, total4)));
    }

    /*
        num	    total	result
        3	    12	    [3, 4, 5]
        5	    15	    [1, 2, 3, 4, 5]
        4	    14	    [2, 3, 4, 5]
        5	    5	    [-1, 0, 1, 2, 3]
     */
    public int[] solution(int num, int total) {
        int[] answer = {};

        Integer number = IntStream.rangeClosed(-num, total)
                .boxed()
                .filter(integer -> {
                    int sum = integer;
                    for (int i = 1; i < num; i++) {
                        sum += ++integer;
                    }
                    return sum == total;
                })
                .findFirst()
                .get();

        return IntStream.range(number, number + num)
                .toArray();
    }
}