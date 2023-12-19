package Agorithm.Programmers.Level_1;

public class 제곱수_판별하기 {
    public static void main(String[] args) {

        제곱수_판별하기 stella = new 제곱수_판별하기();

        int n1 = 2;
        int t1 = 10;

        int n2 = 7;
        int t2 = 15;

        System.out.println("Answer = " + stella.solution(n1, t1));
        System.out.println("Answer = " + stella.solution(n2, t2));
    }

    /*
        n	t	result
        2	10	2048
        7	15	229,376
     */
    public int solution(int n, int t) {
        int answer = 0;

        while(t > 0) {
            n *= 2;
            t--;
        }
        return n;
    }
}
