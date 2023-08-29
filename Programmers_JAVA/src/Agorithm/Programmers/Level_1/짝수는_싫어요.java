package Agorithm.Programmers.Level_1;

import java.util.ArrayList;

public class 짝수는_싫어요 {
    public int[] solution(int n) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i += 2) {
            list.add(i);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
