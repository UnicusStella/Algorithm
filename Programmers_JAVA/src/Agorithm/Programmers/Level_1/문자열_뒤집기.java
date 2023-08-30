package Agorithm.Programmers.Level_1;

public class 문자열_뒤집기 {
    public String solution(String my_string) {
        String answer = "";

        return new StringBuilder(my_string).reverse().toString();
    }

    // 방법 2
    public String solution1(String my_string) {
        String answer = "";

        String[] split = my_string.split("");

        for (int i = split.length; i > 0; i--) {
            answer += split[i - 1];
        }

        return answer;
    }

}

