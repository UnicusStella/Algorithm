package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 세_개의_구분자 {
    public static void main(String[] args) {

        세_개의_구분자 stella = new 세_개의_구분자();

        String myStr1 = "baconlettucetomato";

        String myStr2 = "abcd";

        String myStr3 = "cabab";


        System.out.println("Answer = " + Arrays.toString(stella.solution(myStr1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(myStr2)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(myStr3)));
    }

    /*
        myStr	                result
        "baconlettucetomato"	["onlettu", "etom", "to"]
        "abcd"	                ["d"]
        "cabab"	                ["EMPTY"]
     */
    public String[] solution(String myStr) {

        String[] answer = Arrays.stream(myStr.split("[abc]+"))
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);

        return answer.length == 0 ? new String[]{"EMPTY"} : answer;
    }
}
