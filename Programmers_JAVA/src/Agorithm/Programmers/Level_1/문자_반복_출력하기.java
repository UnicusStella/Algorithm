package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 문자_반복_출력하기 {
    public String solution(String my_string, int n) {
        String answer = "";

        return Arrays.stream(my_string.split("")).map(s -> s.repeat(n)).collect(Collectors.joining());
    }
}
