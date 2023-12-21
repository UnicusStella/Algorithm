package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 숨어있는_숫자의_덧셈_2 {
    public static void main(String[] args) {

        숨어있는_숫자의_덧셈_2 stella = new 숨어있는_숫자의_덧셈_2();

        String my_string1 = "aAb1B2cC34oOp";

        String my_string2 = "1a2b3c4d123";

        System.out.println("Answer = " + stella.solution(my_string1));
        System.out.println("Answer = " + stella.solution(my_string2));
    }

    /*
        my_string	        result
        "aAb1B2cC34oOp"	    37
        "1a2b3c4d123Z"	    133
    */
    public int solution(String my_string) {
        int answer = 0;

        return Arrays.stream(my_string.replaceAll("[\\D]", " ")
                        .split(" "))
                .mapToInt(value -> value.equals("") == true ? 0 : Integer.parseInt(value))
                .sum();
    }
}

