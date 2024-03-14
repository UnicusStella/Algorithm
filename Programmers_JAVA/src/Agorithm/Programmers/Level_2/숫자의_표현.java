package Agorithm.Programmers.Level_2;

public class 숫자의_표현 {
    public static void main(String[] args) {

        숫자의_표현 stella = new 숫자의_표현();

        int n1 = 15;

        System.out.println("Answer = " + stella.solution(n1));
    }

    /*
        n	result
        15	4
     */
    public int solution(int n) {

        int answer = 0;
        int sumCheck = 0;

        for (int i = 1; i <= n; i++) {
            sumCheck = 0;
            for (int j = i; j <= n; j++) {
                sumCheck += j;
                if (sumCheck == n) {
                    answer++;
                    break;
                }
                if (sumCheck > n) break;
            }
        }
        return answer;
    }
}
