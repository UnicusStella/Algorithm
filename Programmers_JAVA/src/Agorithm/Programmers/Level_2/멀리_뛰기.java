package Agorithm.Programmers.Level_2;

public class 멀리_뛰기 {
    public static void main(String[] args) {

        멀리_뛰기 stella = new 멀리_뛰기();

        int n1 = 4;

        int n2 = 3;

        System.out.println("Answer = " + stella.solution(n1));
        System.out.println("Answer = " + stella.solution(n2));
    }

    /*
        n	result
        4	5
        3	3
     */
    public long solution(int n) {

        long[] DP = new long[n + 1];
        DP[1] = 1;

        Fibo(DP, n);

        return (DP[n] + DP[n - 1]) % 1234567;
    }

    private long Fibo(long[] DP, int n) {

        if (n < 2) return n;

        if (DP[n] == 0)
            DP[n] = (Fibo(DP, n - 1) + Fibo(DP, n - 2)) % 1234567;

        return DP[n];
    }
}