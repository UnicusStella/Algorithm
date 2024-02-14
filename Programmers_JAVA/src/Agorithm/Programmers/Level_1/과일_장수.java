package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.Collections;

public class 과일_장수 {
    public static void main(String[] args) {

        과일_장수 stella = new 과일_장수();

        int k1 = 3;
        int m1 = 4;
        int[] score1 = {1, 2, 3, 1, 2, 3, 1};

        int k2 = 4;
        int m2 = 3;
        int[] score2 = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        System.out.println("Answer = " + stella.solution(k1, m1, score1));
        System.out.println("Answer = " + stella.solution(k2, m2, score2));
    }

    /*
        k	m	score	                                result
        3	4	[1, 2, 3, 1, 2, 3, 1]	                8
        4	3	[4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2]	33
     */
    public int solution(int k, int m, int[] score) {

        int len = score.length / m;

        score = Arrays.stream(score)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        int[][] apples = new int[len][m];

        for (int i = 0; i < len; i++) {
            System.arraycopy(score, i * m, apples[i], 0, m);
        }

        return Arrays.stream(apples)
                .mapToInt(ints -> Arrays.stream(ints)
                        .map(operand -> operand * m)
                        .min()
                        .getAsInt())
                .sum();
    }

    public int solution2(int k, int m, int[] score) {

        int answer = 0;

        Arrays.sort(score);

        for (int i = score.length - m; i >= 0; i -= m) {
            answer += score[i] * m;
        }

        return answer;
    }
}
