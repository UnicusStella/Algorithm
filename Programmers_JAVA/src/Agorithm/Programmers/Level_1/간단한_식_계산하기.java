
package Agorithm.Programmers.Level_1;

public class 간단한_식_계산하기 {
    public static void main(String[] args) {

        간단한_식_계산하기 stella = new 간단한_식_계산하기();

        String binomial1 = "43 + 12";

        String binomial2 = "0 - 7777";

        String binomial3 = "40000 * 40000";

        System.out.println("Answer = " + stella.solution(binomial1));
        System.out.println("Answer = " + stella.solution(binomial2));
        System.out.println("Answer = " + stella.solution(binomial3));
    }

    /*
        binomial	        result
        "43 + 12"	        55
        "0 - 7777"	        -7777
        "40000 * 40000"	    1600000000
     */
    public int solution(String binomial) {

        String[] calc = binomial.split(" ");
        String op = calc[1];

        if (op.equals("+")) {
            return Integer.parseInt(calc[0]) + Integer.parseInt(calc[2]);
        } else if (op.equals("-")) {
            return Integer.parseInt(calc[0]) - Integer.parseInt(calc[2]);
        } else {
            return Integer.parseInt(calc[0]) * Integer.parseInt(calc[2]);
        }
    }
}
