package Agorithm.Programmers.Level_1;

public class 팩토리얼 {
    public static void main(String[] args) {

        팩토리얼 stella = new 팩토리얼();

        int n1 = 3628800;

        int n2 = 2;

        System.out.println("Answer1 = " + stella.solution(n1));
        System.out.println("Answer2 = " + stella.solution(n2));
    }

    /*
        n	        result
        3628800    	10
        7	        3
     */
    public int solution(int n) {

        int answer = 1;
        int factorial = 1;

        if (n == 2) return 2;

        for (int i = 1; i <= n; i++) {
            factorial *= i;

            if (factorial > n) {
                answer = i - 1;
                break;
            }
        }
        return answer;
    }
}
