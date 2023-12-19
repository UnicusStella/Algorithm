package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class OX퀴즈 {
    public static void main(String[] args) {

        OX퀴즈 stella = new OX퀴즈();

        String[] quiz1 = {"3 - 4 = -3", "5 + 6 = 11"};

        String[] quiz2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};

        System.out.println("Answer = " + Arrays.toString(stella.solution(quiz1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(quiz2)));
    }

    /*
        quiz	                                                    result
        ["3 - 4 = -3", "5 + 6 = 11"]	                            ["X", "O"]
        ["19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"]	["O", "O", "X", "O"]
     */
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        // quiz 배열 값을 " " split 배열 생성
        Object[] s = Arrays.stream(quiz).map(string -> string.split(" ")).collect(Collectors.toList()).toArray();

        // sign '-' 인지 '+' 인지 하여 배열 마지막 값 체크
        for (int i = 0; i < s.length; i++) {
            String[] o = (String[]) s[i];
            if (o[1].equals("-")){
                int ans = Integer.parseInt(o[0]) - Integer.parseInt(o[2]);
                if (ans ==  Integer.parseInt(o[4])){
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                int ans = Integer.parseInt(o[0]) + Integer.parseInt(o[2]);
                if (ans ==  Integer.parseInt(o[4])){
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }

        return answer;
    }
}
