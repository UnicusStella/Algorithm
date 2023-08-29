package Agorithm.Programmers.Level_1;

public class 피자_나눠_먹기_3 {
    public int solution(int slice, int n) {
        int answer = 0;

        return (int) Math.ceil(n / (double) slice);
    }
}
