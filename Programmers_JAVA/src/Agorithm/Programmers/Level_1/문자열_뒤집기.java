package Agorithm.Programmers.Level_1;

public class 문자열_뒤집기 {
    public static void main(String[] args) {

        문자열_뒤집기 stella = new 문자열_뒤집기();

        String my_String1 = "noraj";
        String my_String2 = "daerb";

        System.out.println("Answer1 = " + stella.solution(my_String1));
        System.out.println("Answer1 = " + stella.solution(my_String2));
    }

    /*
            my_string	return
            "jaron"	"noraj"
            "bread"	"daerb"
     */
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

