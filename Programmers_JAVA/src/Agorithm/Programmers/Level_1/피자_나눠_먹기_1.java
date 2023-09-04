package Agorithm.Programmers.Level_1;

public class 피자_나눠_먹기_1 {
    public static void main(String[] args) {

        피자_나눠_먹기_1 stella = new 피자_나눠_먹기_1();

        int n1 = 7;
        int n2 = 1;
        int n3 = 15;

        System.out.println("n1 = " + stella.solution(n1));
        System.out.println("n2 = " + stella.solution(n2));
        System.out.println("n3 = " + stella.solution(n3));
    }

    /*
        n	result
        7	1
        1	1
        15	3
    */
    public int solution(int n) {
        int answer = 0;
        return (int) (Math.ceil(n / (double) 7));
    }
}

