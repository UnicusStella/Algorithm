package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 배열_자르기 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
