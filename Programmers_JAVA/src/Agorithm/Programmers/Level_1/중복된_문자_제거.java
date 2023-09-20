package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 중복된_문자_제거 {
    public static void main(String[] args) {

        중복된_문자_제거 stella = new 중복된_문자_제거();

        String my_string1 = "people";

        String my_string2 = "We are the world";

        System.out.println("Answer1 = " + stella.solution(my_string1));
        System.out.println("Answer2 = " + stella.solution(my_string2));
    }

    /*
        my_string	        result
        "people"	        "peol"
        "We are the world"	"We arthwold"
    */
    public String solution(String my_string) {
        String answer = "";

        return Arrays.stream(my_string.split(""))
                .distinct()
                .collect(Collectors.joining());
    }
}
