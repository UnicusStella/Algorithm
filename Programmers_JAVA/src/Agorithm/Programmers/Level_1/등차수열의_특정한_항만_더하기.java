package Agorithm.Programmers.Level_1;

import java.util.stream.IntStream;

public class 등차수열의_특정한_항만_더하기 {
    public static void main(String[] args) {

        등차수열의_특정한_항만_더하기 stella = new 등차수열의_특정한_항만_더하기();

        int a1 = 3;
        int d1 = 4;
        boolean[] included1 = {true, false, false, true, true};

        int a2 = 7;
        int d2 = 1;
        boolean[] included2 = {false, false, false, true, false, false, false};

        System.out.println("Answer = " + stella.solution(a1, d1, included1));
        System.out.println("Answer = " + stella.solution(a2, d2, included2));
    }

    /*
        a	d	included	                                        result
        3	4	[true, false, false, true, true]	                37
        7	1	[false, false, false, true, false, false, false]	10
     */
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a + d * i;
            }
        }

        return answer;
    }

    public int solution2(int a, int d, boolean[] included) {

        return IntStream.range(0, included.length)
                .map(operand -> included[operand] ? a + d * operand : 0)
                .sum();
    }


}