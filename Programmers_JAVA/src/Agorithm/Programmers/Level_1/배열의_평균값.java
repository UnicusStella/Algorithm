package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 배열의_평균값 {
    public double solution(int[] numbers) {
        double answer = 0;

        return Arrays.stream(numbers).average().orElse(0);
    }
}
