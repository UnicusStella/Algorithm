package Agorithm.Programmers.Level_2;

public class 점프와_순간_이동 {
    public static void main(String[] args) {

        점프와_순간_이동 stella = new 점프와_순간_이동();

        int N1 = 3;

        int N2 = 6;

        int N3 = 5000;

        System.out.println("Answer = " + stella.solution(N1));
        System.out.println("Answer = " + stella.solution(N2));
        System.out.println("Answer = " + stella.solution(N3));
    }

    /*
        N	    result
        5	    2
        6	    2
        5000	5
     */
    public int solution(int n) {

        int moveCount = 1;

        while (n > 1) {
            if (n % 2 != 0) {
                n = (n - 1) / 2;
                moveCount++;
            } else
                n /= 2;
        }

        return moveCount;
    }
}