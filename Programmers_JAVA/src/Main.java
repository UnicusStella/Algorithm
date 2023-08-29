import Agorithm.Programmers.Level_1.배열_두_배_만들기;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        배열_두_배_만들기 stella = new 배열_두_배_만들기();

        int[] number1 = {1, 2, 3, 4, 5};
        int[] number2 = {1, 2, 100, -99, 1, 2, 3};

        System.out.println("number1 = " + Arrays.toString(stella.solution(number1)));
        System.out.println("number2 = " + Arrays.toString(stella.solution(number2)));
    }
}
/*
    numbers	result
    [1, 2, 3, 4, 5]	[2, 4, 6, 8, 10]
    [1, 2, 100, -99, 1, 2, 3]	[2, 4, 200, -198, 2, 4, 6]
 */