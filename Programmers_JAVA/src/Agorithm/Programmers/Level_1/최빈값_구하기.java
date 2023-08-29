package Agorithm.Programmers.Level_1;

import java.util.HashMap;
import java.util.Map;

public class 최빈값_구하기 {
    public int solution(int[] array) {
        int answer = 0;
        int maxCount = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int number : array) {
            int count = map.getOrDefault(number, 0) + 1;
            if (count > maxCount) {
                maxCount = count;
                answer = number;
            } else if (count == maxCount) {
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
}