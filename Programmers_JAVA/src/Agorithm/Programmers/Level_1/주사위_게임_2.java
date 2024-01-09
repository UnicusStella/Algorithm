package Agorithm.Programmers.Level_1;

public class 주사위_게임_2 {
    public static void main(String[] args) {

        주사위_게임_2 stella = new 주사위_게임_2();

        int a1 = 2;
        int b1 = 6;
        int c1 = 1;

        int a2 = 5;
        int b2 = 3;
        int c2 = 3;

        int a3 = 4;
        int b3 = 4;
        int c3 = 4;

        System.out.println("Answer = " + stella.solution(a1, b1, c1));
        System.out.println("Answer = " + stella.solution(a2, b2, c2));
        System.out.println("Answer = " + stella.solution(a3, b3, c3));
    }

    /*
        a	b	c	result
        2	6	1	9
        5	3	3	473
        4	4	4	110592
     */
    public int solution(int a, int b, int c) {
        int answer = 1;
        int square = 1;

        int square1 = a + b + c;
        int square2 = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        int square3 = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));

        if (a == b || a == c || b == c) square++;
        if (a == b && b == c) square++;

        // 방안 1 Switch 문
//        switch (square) {
//            case 0:
//                return square1;
//            case 1:
//                return square1 * square2;
//            default:
//                return square1 * square2 * square3;
//        }


        // 방안 2 For 문
        for (int i = 1; i <= square; i++) {
            answer *= (int) (Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i));
        }
        return answer;
    }
}