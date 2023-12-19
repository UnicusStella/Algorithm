package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 문자열_정렬하기_2 {
    public static void main(String[] args) {

        문자열_정렬하기_2 stella = new 문자열_정렬하기_2();

        String str1 = "Bcad";

        String str2 = "heLLo";

        String str3 = "Python";

        System.out.println("Answer = " + stella.solution(str1));
        System.out.println("Answer = " + stella.solution(str2));
        System.out.println("Answer = " + stella.solution(str3));
    }

    /*
        my_string	    result
        "Bcad"	        "abcd"
        "heLLo"	        "ehllo"
        "Python"	    "hnopty"
     */
    public String solution(String my_string) {
        String answer = "";
        return Arrays.stream(my_string.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining());
    }
}
