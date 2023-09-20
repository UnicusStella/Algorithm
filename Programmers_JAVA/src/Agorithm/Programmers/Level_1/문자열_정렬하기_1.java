package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 문자열_정렬하기_1 {
    public static void main(String[] args) {

        문자열_정렬하기_1 stella = new 문자열_정렬하기_1();

        String my_string1 = "hi12392";

        String my_string2 = "p2o4i8gj2";

        String my_string3 = "abcde0";

        System.out.println("Answer1 = " + Arrays.toString(stella.solution(my_string1)));
        System.out.println("Answer2 = " + Arrays.toString(stella.solution(my_string2)));
        System.out.println("Answer3 = " + Arrays.toString(stella.solution(my_string3)));
    }

    /*
        my_string	    result
        "hi12392"	    [1, 2, 2, 3, 9]
        "p2o4i8gj2"	    [2, 2, 4, 8]
        "abcde0"	    [0]
    */
    public int[] solution(String my_string) {
        int[] answer = {};

        return Arrays.stream(my_string.replaceAll("[\\D]", "").split("")).sorted()
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
