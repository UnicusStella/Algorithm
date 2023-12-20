package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 잘라서_배열로_저장하기 {
    public static void main(String[] args) {

        잘라서_배열로_저장하기 stella = new 잘라서_배열로_저장하기();

        String my_str1 = "abc1Addfggg4556b";
        int n1 = 6;

        String my_str2 = "abcdef123";
        int n2 = 3;

        System.out.println("Answer1 = " + Arrays.toString(stella.solution(my_str1, n1)));
        System.out.println("Answer2 = " + Arrays.toString(stella.solution(my_str2, n2)));
    }

    /*
        my_str	            n	    result
        "abc1Addfggg4556b"	6	    ["abc1Ad", "dfggg4", "556b"]
        "abcdef123"	        3	    ["abc", "def", "123"]
     */

    public String[] solution(String my_str, int n) {

        int len = (my_str.length() + n - 1) / n;

        String[] answer = new String[len];

        for (int i = 0; i < len; i++) {
            // 마지막 반복에서는 남은 문자열 전부 집어 넣기.
            if (i + 1 == len) {
                answer[i] = my_str.substring(0);
            } else {
                answer[i] = my_str.substring(0, n);
                my_str = my_str.substring(n);
            }
        }
        return answer;
    }
}
