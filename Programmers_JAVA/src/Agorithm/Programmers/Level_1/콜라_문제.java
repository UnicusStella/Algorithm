package Agorithm.Programmers.Level_1;

public class 콜라_문제 {
    public static void main(String[] args) {

        콜라_문제 stella = new 콜라_문제();

        int a1 = 2;
        int b1 = 1;
        int n1 = 20;

        int a2 = 3;
        int b2 = 1;
        int n2 = 20;

        System.out.println("Answer = " + stella.solution(a1, b1, n1));
        System.out.println("Answer = " + stella.solution(a2, b2, n2));
    }

    /*
        a	b	n	result
        2	1	20	19
        3	1	20	9
     */
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            answer += (n / a * b);
            n = (n / a * b) + n % a;
        }
        return answer;
    }
}
