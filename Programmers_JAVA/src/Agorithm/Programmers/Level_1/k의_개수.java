package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class k의_개수 {
    public static void main(String[] args) {

        k의_개수 stella = new k의_개수();

        int i1 = 1;
        int j1 = 13;
        int k1 = 1;

        int i2 = 10;
        int j2 = 50;
        int k2 = 5;

        int i3 = 3;
        int j3 = 10;
        int k3 = 2;

        System.out.println("Answer = " + stella.solution(i1, j1, k1));
        System.out.println("Answer = " + stella.solution(i2, j2, k2));
        System.out.println("Answer = " + stella.solution(i3, j3, k3));
    }

    /*
        i	j	k	result
        1	13	1	6
        10	50	5	5
        3	10	2	0
     */
    public int solution(int i, int j, int k) {
        int answer = 0;

        return (int) Arrays.stream(IntStream.rangeClosed(i, j)
                        .boxed()
                        .map(operand -> String.valueOf(operand))
                        .collect(Collectors.joining())
                        .split(""))
                .filter(s -> Integer.parseInt(s) == k)
                .count();
    }
}
