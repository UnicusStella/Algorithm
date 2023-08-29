package Agorithm.Programmers.Level_1;

public class 피자_나눠_먹기_2 {
    public int solution(int n) {
        int answer = 0;

        return LCM(n, 6);
    }

    private int LCM(int num1, int num2) {

        return ((num1 * num2) / GCD(num1, 6)) / 6;
    }

    private int GCD(int num1, int num2) {
        if (num1 % num2 == 0) return num2;

        return GCD(num2, num1 % num2);
    }
}
