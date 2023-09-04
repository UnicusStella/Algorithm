package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 문자_반복_출력하기 {
    public static void main(String[] args) {

        문자_반복_출력하기 stella = new 문자_반복_출력하기();

        String my_string = "hello";
        int n1 = 3;

        System.out.println("Answer1 = " + stella.solution(my_string, n1));
    }

    /*
            my_string	n	result
            "hello"	3	"hhheeellllllooo"
     */
    public String solution(String my_string, int n) {
        String answer = "";

        return Arrays.stream(my_string.split("")).map(s -> s.repeat(n)).collect(Collectors.joining());
    }
}
