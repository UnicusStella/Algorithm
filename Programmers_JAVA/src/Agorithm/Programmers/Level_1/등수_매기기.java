package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 등수_매기기 {
    public static void main(String[] args) {

        등수_매기기 stella = new 등수_매기기();

        int[][] score1 = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};

        int[][] score2 = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};

        System.out.println("Answer = " + Arrays.toString(stella.solution(score1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(score2)));
    }

    /*
        score	                                                                    result
        [[80, 70], [90, 50], [40, 70], [50, 80]]	                                [1, 2, 4, 3]
        [[80, 70], [70, 80], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]]	[4, 4, 6, 2, 2, 1, 7]
     */
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        double[] array = Arrays.stream(score)
                .mapToDouble(value -> Arrays.stream(value)
                        .average()
                        .orElse(0)
                )
                .toArray();

        for (int i = 0; i < array.length; i++) {
            double rank = array[i];
            int ranking = array.length + 1;
            for (int j = 0; j < array.length; j++) {
                if (rank >= array[j]) ranking--;
            }
            answer[i] = ranking;
        }

        return answer;
    }
    // Stream 연산만으로 해결.
    public int[] solution2(int[][] score) {

        return Arrays.stream(score)
                .map(ints -> Arrays.stream(ints)
                        .average()
                        .orElse(0))
                .mapToInt(value -> Arrays.stream(score)
                        .map(ints -> Arrays.stream(ints)
                                .average()
                                .orElse(0))
                        .collect(Collectors.toList())
                        .indexOf(value + 1))
                .toArray();
    }
}