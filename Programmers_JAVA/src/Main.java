import Agorithm.Programmers.Level_1.짝수는_싫어요;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        짝수는_싫어요 stella = new 짝수는_싫어요();

        int n1 = 10;
        int n2 = 15;

        System.out.println("n1 = " + Arrays.toString(stella.solution(n1))); // [1, 3, 5, 7, 9]
        System.out.println("n2 = " + Arrays.toString(stella.solution(n2))); // [1, 3, 5, 7, 9, 11, 13, 15]
    }
}
/*
    n	result
    10	[1, 3, 5, 7, 9]
    15	[1, 3, 5, 7, 9, 11, 13, 15]
 */