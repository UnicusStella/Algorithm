package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 배열_두_배_만들기 {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        return Arrays.stream(numbers).
                map(item -> item * 2)
                .toArray();
    }
}
