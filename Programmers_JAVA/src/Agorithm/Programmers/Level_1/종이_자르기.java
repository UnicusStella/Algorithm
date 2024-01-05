package Agorithm.Programmers.Level_1;

public class 종이_자르기 {
    public static void main(String[] args) {

        종이_자르기 stella = new 종이_자르기();

        int M1 = 2;
        int N1 = 2;

        int M2 = 2;
        int N2 = 5;

        int M3 = 1;
        int N3 = 1;

        System.out.println("Answer = " + stella.solution(M1, N1));
        System.out.println("Answer = " + stella.solution(M2, N2));
        System.out.println("Answer = " + stella.solution(M3, N3));
    }

    /*
        M	N	result
        2	2	3
        2	5	9
        1	1	0
     */
    public int solution(int M, int N) {
        int answer = 0;
        return M * N - 1;
    }
}