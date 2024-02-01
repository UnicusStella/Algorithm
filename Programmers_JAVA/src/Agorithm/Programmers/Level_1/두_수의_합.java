package Agorithm.Programmers.Level_1;

import java.math.BigInteger;

public class 두_수의_합 {
    public static void main(String[] args) {

        두_수의_합 stella = new 두_수의_합();

        String a1 = "582";
        String b1 = "734";

        String a2 = "18446744073709551615";
        String b2 = "287346502836570928366";

        String a3 = "0";
        String b3 = "0";

        System.out.println("Answer = " + stella.solution(a1, b1));
        System.out.println("Answer = " + stella.solution(a2, b2));
        System.out.println("Answer = " + stella.solution(a3, b3));
    }

    /*
        a	                        b	                        result
        "582"	                    "734"	                    "1316"
        "18446744073709551615"	    "287346502836570928366"	    "305793246910280479981"
        "0"	                        "0"                         "0"
     */
    public String solution(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int roundUp = 0;


        if (a.length() > b.length()) {
            b = sb.append("0".repeat(a.length() - b.length())).append(b).toString();
        } else if (b.length() > a.length()) {
            a = sb.append("0".repeat(b.length() - a.length())).append(a).toString();
        }
        sb.setLength(0);

        for (int i = a.length() - 1; i >= 0; i--) {

            // 자릿수 더하기 + 이전 올림 값
            int num = ((a.charAt(i) - '0') + (b.charAt(i) - '0')) + roundUp;

            // 올림 값
            roundUp = num / 10;

            // 자릿수 넘을 시 1의 자리수 만 더하기
            sb.append(num % 10);
        }
        if (roundUp != 0) sb.append(roundUp);

        sb.reverse();

        return sb.toString();
    }
    public String solution2(String a, String b) {

        BigInteger num_A = new BigInteger(a);
        BigInteger num_B = new BigInteger(b);

        return String.valueOf(num_A.add(num_B));
    }
}
