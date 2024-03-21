package Agorithm.Programmers.Level_2;

public class 예상_대진표 {
    public static void main(String[] args) {

        예상_대진표 stella = new 예상_대진표();

        int N1 = 8;
        int A1 = 4;
        int B1 = 7;

        System.out.println("Answer = " + stella.solution(N1, A1, B1));
    }

    /*
        N	A	B	answer
        8	4	7	3
     */
    public int solution(int n, int a, int b) {

        int answer = 0;
        int A = Math.min(a, b);
        int B = Math.max(a, b);

        for (int i = 0; i < n; i++) {
            if (A % 2 == 1 && B % 2 == 0 && A + 1 == B) return i + 1;

            A = (int) Math.ceil(A / 2.0);
            B = (int) Math.ceil(B / 2.0);
        }

        return answer;
    }
}