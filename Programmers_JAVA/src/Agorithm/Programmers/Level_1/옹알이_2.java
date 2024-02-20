package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 옹알이_2 {
    public static void main(String[] args) {

        옹알이_2 stella = new 옹알이_2();

        String[] babbling1 = {"aya", "yee", "u", "maa"};

        String[] babbling2 = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};


        System.out.println("Answer = " + stella.solution(babbling1));
        System.out.println("Answer = " + stella.solution(babbling2));
    }

    /*
        babbling	                                        result
        ["aya", "yee", "u", "maa"]	                        1
        ["ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"]	    2
     */
    public int solution(String[] babbling) {

        // babbling : aya, ye, woo, ma

        return (int) Arrays.stream(babbling)
                .filter(s -> s.matches("(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+"))
                .count();
    }
}
