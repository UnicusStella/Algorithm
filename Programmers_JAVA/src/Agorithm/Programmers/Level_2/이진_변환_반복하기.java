package Agorithm.Programmers.Level_2;

import java.util.Arrays;

public class 이진_변환_반복하기 {
    public static void main(String[] args) {

        이진_변환_반복하기 stella = new 이진_변환_반복하기();

        String s1 = "110010101001";

        String s2 = "01110";

        String s3 = "1111111";

        System.out.println("Answer = " + Arrays.toString(stella.solution(s1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(s2)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(s3)));
    }

    /*
        s	            result
        "110010101001"	[3,8]
        "01110"	        [3,3]
        "1111111"	    [4,1]
     */
    public int[] solution(String s) {

        int[] answer = new int[2];
        int len = 0;

        while (s.length() != 1) {
            len = s.replace("0", "").length();
            answer[0]++;
            answer[1] += s.length() - len;

            s = Integer.toString(len, 2);
        }

        return answer;
    }
}
