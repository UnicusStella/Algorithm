package Agorithm.Programmers.Level_1;

public class 유한소수_판별하기 {
    public static void main(String[] args) {

        유한소수_판별하기 stella = new 유한소수_판별하기();

        int a1 = 7;
        int b1 = 20;

        int a2 = 11;
        int b2 = 22;

        int a3 = 12;
        int b3 = 21;

        System.out.println("Answer = " + stella.solution(a1, b1));
        System.out.println("Answer = " + stella.solution(a2, b2));
        System.out.println("Answer = " + stella.solution(a3, b3));
    }

    /*
        a	    b	    result
        7	    20	    1
        11	    22	    1
        12	    21	    2
     */
    public int solution(int a, int b) {
        int answer = 0;
        int target = b / GCD(a, b);
        int divisor = 2;

        String checkNum = "";

        while (target >= 2) {
            if (target % divisor == 0) {
                target /= divisor;
                checkNum += String.valueOf(divisor);
            } else {
                divisor++;
            }
        }

        return checkNum.replaceAll("[25]", "").length() >= 1
                ? 2
                : 1;
    }

    private int GCD(int num1, int num2) {
        if (num1 % num2 == 0) return num2;

        return GCD(num2, num1 % num2);
    }
}
