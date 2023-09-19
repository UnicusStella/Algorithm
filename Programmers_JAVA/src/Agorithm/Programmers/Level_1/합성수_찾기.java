package Agorithm.Programmers.Level_1;

import java.util.stream.IntStream;

public class 합성수_찾기 {
    public static void main(String[] args) {

        합성수_찾기 stella = new 합성수_찾기();

        int n1 = 10;

        int n2 = 15;

        System.out.println("Answer1 = " + stella.solution(n1));
        System.out.println("Answer2 = " + stella.solution(n2));
    }

    /*
        n	    result
        10	    5
        15	    8
     */
    public int solution(int n) {
        int answer = 0;

        if (n < 4) return 0;

        return (int) IntStream.rangeClosed(4, n)
                .filter(target -> IntStream.rangeClosed(2, target - 1).anyMatch(i -> target % i == 0))
                .count();
    }
}
