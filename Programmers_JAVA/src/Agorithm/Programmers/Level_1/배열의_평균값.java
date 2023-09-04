package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 배열의_평균값 {
    public static void main(String[] args) {

        배열의_평균값 stella = new 배열의_평균값();

        int[] number1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] number2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

        System.out.println("number1 = " + stella.solution(number1));
        System.out.println("number2 = " + stella.solution(number2));
    }

    /*
        numbers	result
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]             	5.5
        [89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]	94.0
     */
    public double solution(int[] numbers) {
        double answer = 0;

        return Arrays.stream(numbers).average().orElse(0);
    }
}
