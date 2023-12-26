package Agorithm.Programmers.Level_1;

public class 저주의_숫자_3 {
    public static void main(String[] args) {

        저주의_숫자_3 stella = new 저주의_숫자_3();

        int n1 = 15;

        int n2 = 40;

        System.out.println("Answer = " + stella.solution(n1));
        System.out.println("Answer = " + stella.solution(n2));
    }

    /*
        n	    result
        15	    25
        40	    76
     */
    public int solution(int n) {
        int answer = 0;
        int count = 1;

        while (count <= n) {
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
            count++;
        }

        return answer;
    }
}