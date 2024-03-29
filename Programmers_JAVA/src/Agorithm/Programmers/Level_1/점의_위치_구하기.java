package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 점의_위치_구하기 {
    public static void main(String[] args) {

        점의_위치_구하기 stella = new 점의_위치_구하기();

        int[] dot1 = {2, 4};
        int[] dot2 = {-7, 9};

        System.out.println("Answer1 = " + stella.solution(dot1));
        System.out.println("Answer2 = " + stella.solution(dot2));
    }

    /*
            dot	        result
            [2, 4]	    1
            [-7, 9]	    2
    */
    public int solution(int[] dot) {

        return dot[0] > 0 && dot[1] > 0 ? 1
                : dot[0] > 0 && dot[1] < 0
                ? 4
                : dot[0] < 0 && dot[1] > 0
                ? 2
                : 3;

    }

    public final String PLUS = "+";
    public final String MINUS = "-";

    public int solution1(int[] dot) {
        int answer = 0;

        List<String> sign = Arrays.stream(dot)
                .mapToObj(operand -> operand > 0 ? PLUS : MINUS)
                .collect(Collectors.toList());

        switch (sign.get(0)) {
            case PLUS:
                switch (sign.get(1)) {
                    case PLUS:
                        return answer = 1;
                    case MINUS:
                        return answer = 4;
                }
            case MINUS:
                switch (sign.get(1)) {
                    case PLUS:
                        return answer = 2;
                    case MINUS:
                        return answer = 3;
                }
        }
        return answer;
    }
}