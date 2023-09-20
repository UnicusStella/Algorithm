package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 대문자와_소문자 {
    public static void main(String[] args) {

        대문자와_소문자 stella = new 대문자와_소문자();

        String my_string1 = "CCCccc";

        String my_string2 = "ABcDeFGHij";

        System.out.println("Answer1 = " + stella.solution(my_string1));
        System.out.println("Answer2 = " + stella.solution(my_string2));
    }

    /*
        my_string	    result
        "cccCCC"	    "CCCccc"
        "abCdEfghIJ"	"ABcDeFGHij"
     */
    public String solution(String my_string) {
        String answer = "";

        return Arrays.stream(my_string.split(""))
                .map(s -> Character.isUpperCase(s.charAt(0)) == true
                        ? s.toLowerCase()
                        : s.toUpperCase())
                .collect(Collectors.joining());
    }
}
