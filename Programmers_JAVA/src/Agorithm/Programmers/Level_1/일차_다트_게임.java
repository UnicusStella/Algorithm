package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 일차_다트_게임 {
    public static void main(String[] args) {

        일차_다트_게임 stella = new 일차_다트_게임();

        String dartResult1 = "1S2D*3T";

        String dartResult2 = "1D2S#10S";

        String dartResult3 = "1D2S0T";

        String dartResult4 = "1S*2T*3S";

        String dartResult5 = "1D#2S*3S";

        String dartResult6 = "1T2D3D#";

        String dartResult7 = "1D2S3T*";

        System.out.println("Answer = " + stella.solution(dartResult1));
        System.out.println("Answer = " + stella.solution(dartResult2));
        System.out.println("Answer = " + stella.solution(dartResult3));
        System.out.println("Answer = " + stella.solution(dartResult4));
        System.out.println("Answer = " + stella.solution(dartResult5));
        System.out.println("Answer = " + stella.solution(dartResult6));
        System.out.println("Answer = " + stella.solution(dartResult7));
    }

    /*
        예제	dartResult	answer	설명
        1	    1S2D*3T	    37	    11 * 2 + 22 * 2 + 33
        2	    1D2S#10S	9	    12 + 21 * (-1) + 101
        3	    1D2S0T	    3	    12 + 21 + 03
        4	    1S*2T*3S	23	    11 * 2 * 2 + 23 * 2 + 31
        5	    1D#2S*3S	5	    12 * (-1) * 2 + 21 * 2 + 31
        6	    1T2D3D#	    -4	    13 + 22 + 32 * (-1)
        7	    1D2S3T*     59	    12 + 21 * 2 + 33 * 2
     */
    public int solution(String dartResult) {

        int[] answer = new int[3];

        int[] dartNumberList = Arrays.stream(dartResult.split("[\\D]"))
                .filter(s -> !s.equals(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[] dartScoreList = Arrays.stream(dartResult.split("[\\d]"))
                .filter(s -> !s.equals(""))
                .toArray(String[]::new);

        for (int i = 0; i < dartScoreList.length; i++) {
            for (int j = 0; j < dartScoreList[i].length(); j++) {
                switch (dartScoreList[i].charAt(j)) {
                    case 'S':
                        answer[i] = (int) Math.pow(dartNumberList[i], 1);
                        break;
                    case 'D':
                        answer[i] = (int) Math.pow(dartNumberList[i], 2);
                        break;
                    case 'T':
                        answer[i] = (int) Math.pow(dartNumberList[i], 3);
                        break;
                    case '*':
                        answer[i] *= 2;
                        if (i > 0) answer[i - 1] *= 2;
                        break;
                    case '#':
                        answer[i] *= -1;
                        break;

                }
            }
        }
        return answer[0] + answer[1] + answer[2];
    }

    public int solution2(String dartResult) {

        int[] answer = new int[3];

        String regex = "([0-9]{1,2}[S|T|D][*|#]{0,1})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dartResult);

        for (int i = 0; i < answer.length; i++) {
            matcher.find();
            String dartScore = matcher.group();
            int dartScoreNum = Integer.parseInt(dartScore.replaceAll("\\D", ""));
            for (int j = 1; j < dartScore.length(); j++) {
                switch (dartScore.charAt(j)) {
                    case 'S':
                        answer[i] = (int) Math.pow(dartScoreNum, 1);
                        break;
                    case 'D':
                        answer[i] = (int) Math.pow(dartScoreNum, 2);
                        break;
                    case 'T':
                        answer[i] = (int) Math.pow(dartScoreNum, 3);
                        break;
                    case '*':
                        answer[i] *= 2;
                        if (i > 0) answer[i - 1] *= 2;
                        break;
                    case '#':
                        answer[i] *= -1;
                        break;
                }
            }
        }

        return answer[0] + answer[1] + answer[2];
    }
}
