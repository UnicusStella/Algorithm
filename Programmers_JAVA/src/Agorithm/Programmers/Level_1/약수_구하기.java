package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 약수_구하기 {
    public static void main(String[] args) {

        약수_구하기 stella = new 약수_구하기();

        int n1 = 24;

        int n2 = 29;


        System.out.println("Answer1 = " + Arrays.toString(stella.solution(n1)));
        System.out.println("Answer2 = " + Arrays.toString(stella.solution(n2)));
    }

    /*
        n	    result
        24	    [1, 2, 3, 4, 6, 8, 12, 24]
        29	    [1, 29]
    */
    public int[] solution(int n) {
        int[] answer = {};

        return IntStream.rangeClosed(1, n)
                .filter(target -> n % target == 0)
                .toArray();
    }
}
