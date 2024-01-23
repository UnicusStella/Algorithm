package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 접미사_배열 {
    public static void main(String[] args) {

        접미사_배열 stella = new 접미사_배열();

        String my_string1 = "banana";

        String my_string2 = "programmers";

        System.out.println("Answer = " + Arrays.toString(stella.solution(my_string1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(my_string2)));

    }

    /*
        my_string	    result
        "banana"	    ["a", "ana", "anana", "banana", "na", "nana"]
        "programmers"	["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]
     */
    public String[] solution(String my_string) {

        return IntStream.range(0, my_string.length())
                .mapToObj(my_string::substring)
                .sorted()
                .toArray(String[]::new);
    }
}
