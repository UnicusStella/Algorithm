package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 인덱스_바꾸기 {
    public static void main(String[] args) {

        인덱스_바꾸기 stella = new 인덱스_바꾸기();

        String my_string1 = "hello";
        int num1_1 = 1;
        int num2_1 = 2;

        String my_string2 = "I love you";
        int num1_2 = 3;
        int num2_2 = 6;

        System.out.println("Answer1 = " + stella.solution(my_string1, num1_1, num2_1));
        System.out.println("Answer2 = " + stella.solution(my_string2, num1_2, num2_2));
    }

    /*
        my_string	    num1	num2	result
        "hello"	        1	    2	    "hlelo"
        "I love you"	3	    6	    "I l veoyou"
     */
    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        List<String> list = Arrays.stream(my_string.split(""))
                .collect(Collectors.toList());

        Collections.swap(list, num1, num2);

        return String.join("", list);
    }

    // Stream 없이 성능 향상시 해당 방법.
    public String solution2(String my_string, int num1, int num2) {
        String answer = "";

        char[] ch = my_string.toCharArray();

        ch[num1] = my_string.charAt(num2);
        ch[num2] = my_string.charAt(num1);

        return String.valueOf(ch);
    }
}
