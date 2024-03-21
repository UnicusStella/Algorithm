package Agorithm.Programmers.Level_2;

public class 피보나치_수 {
    public int[] DP = new int[100_000];

    public static void main(String[] args) {

        피보나치_수 stella = new 피보나치_수();

        int n1 = 3;
        int n2 = 5;

        System.out.println("Answer = " + stella.solution(n1));
        System.out.println("Answer = " + stella.solution(n2));
    }

    /*
        n	return
        3	2
        5	5
     */
    public int solution(int n) {

        DP[1] = 1;

        return Fibo(n);
    }

    private int Fibo(int n) {

        if (n < 2) return n;

        return Fibo(n - 1) + Fibo(n - 2);
    }

    private int FiboDP(int n) {

        if (n < 2) return n;

        if (DP[n] == 0)
            DP[n] = Fibo(n - 1) + Fibo(n - 2);

        return DP[n];
    }

    private int FiboArr(int n) {

        int[] arr = new int[n + 1];
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++)
            arr[i] = (arr[i - 2] + arr[i - 1]) % 1234567;

        return arr[n];
    }
}
