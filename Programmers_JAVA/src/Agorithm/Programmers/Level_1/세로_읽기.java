package Agorithm.Programmers.Level_1;

public class 세로_읽기 {
    public static void main(String[] args) {

        세로_읽기 stella = new 세로_읽기();

        String my_string1 = "ihrhbakrfpndopljhygc";
        int m1 = 4;
        int c1 = 2;

        String my_string2 = "programmers";
        int m2 = 1;
        int c2 = 1;

        System.out.println("Answer = " + stella.solution(my_string1, m1, c1));
        System.out.println("Answer = " + stella.solution(my_string2, m2, c2));

    }

    /*
        my_string	            m	c	result
        "ihrhbakrfpndopljhygc"	4	2	"happy"
        "programmers"	        1	1	"programmers"
     */
    public String solution(String my_string, int m, int c) {
        String answer = "";

        for (int i = c - 1; i < my_string.length(); i += m) {

            answer += my_string.charAt(i);
        }

        return answer;
    }
}
