package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 숨어있는_숫자의_덧셈_1 {
    public static void main(String[] args) {

        숨어있는_숫자의_덧셈_1 stella = new 숨어있는_숫자의_덧셈_1();

        String my_string1 = "aAb1B2cC34oOp";

        String my_string2 = "1a2b3c4d123";

        System.out.println("Answer1 = " + stella.solution(my_string1));
        System.out.println("Answer2 = " + stella.solution(my_string2));
    }

    /*
        my_string	        result
        "aAb1B2cC34oOp"	    10
        "1a2b3c4d123"	    16
    */
    public int solution(String my_string) {
        int answer = 0;
        return Arrays.stream(my_string.replaceAll("[\\D]", "")
                        .split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
