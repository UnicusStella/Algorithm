package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 가장_가까운_같은_글자 {
    public static void main(String[] args) {

        가장_가까운_같은_글자 stella = new 가장_가까운_같은_글자();

        String s1 = "banana";

        String s2 = "foobar";

        System.out.println("Answer = " + Arrays.toString(stella.solution(s1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(s2)));
    }

    /*
        s	        result
        "banana"	[-1, -1, -1, 2, 2, 2]
        "foobar"	[-1, -1, 1, -1, -1, -1]
     */
    public int[] solution(String s) {

        return IntStream.range(0, s.length())
                .map(operand -> {
                    int idx = s.substring(0, operand).lastIndexOf(String.valueOf(s.charAt(operand)));

                    return idx == -1 ? -1 : operand - idx;
                })
                .toArray();
    }
}
