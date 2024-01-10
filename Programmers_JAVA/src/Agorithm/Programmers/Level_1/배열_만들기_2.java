package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 배열_만들기_2 {
    public static void main(String[] args) {

        배열_만들기_2 stella = new 배열_만들기_2();

        int l1 = 5;
        int r1 = 555;

        int l2 = 10;
        int r2 = 20;

        System.out.println("Answer = " + Arrays.toString(stella.solution(l1, r1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(l2, r2)));
    }

    /*
        l	r	result
        5	555	[5, 50, 55, 500, 505, 550, 555]
        10	20	[-1]
     */
    public int[] solution(int l, int r) {
        int[] answer = {};

        answer = IntStream.rangeClosed(l, r)
                .boxed()
                .map(String::valueOf)
                .filter(s -> s.matches("[5|0]+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (answer.length == 0) return new int[]{-1};

        return answer;
    }
}
