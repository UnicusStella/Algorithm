package Agorithm.Programmers.Level_2;

public class 다음_큰_숫자 {
    public static void main(String[] args) {

        다음_큰_숫자 stella = new 다음_큰_숫자();

        int n1 = 78;
        int n2 = 15;

        System.out.println("Answer = " + stella.solution(n1));
        System.out.println("Answer = " + stella.solution(n2));
    }

    /*
        n	result
        78	83
        15	23
     */
    public int solution(int n) {

        int oneBitCount = Integer.bitCount(n);
        int oneBitCountCheck = 0;

        while (oneBitCount != oneBitCountCheck) {
            n++;
            oneBitCountCheck = Integer.bitCount(n);
        }

        return n;
    }
}
