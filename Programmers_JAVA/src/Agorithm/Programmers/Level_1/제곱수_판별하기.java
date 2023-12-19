package Agorithm.Programmers.Level_1;

public class 제곱수_판별하기 {
    public static void main(String[] args) {

        제곱수_판별하기 stella = new 제곱수_판별하기();

        int n1 = 144;

        int n2 = 976;

        System.out.println("Answer = " + stella.solution(n1));
        System.out.println("Answer = " + stella.solution(n2));
    }

    /*
        n	    result
        144	    1
        976	    2
     */
    public int solution(int n) {
        int answer = 0;
        return Math.sqrt(n) == (int) (Math.sqrt(n))  ? 1 : 2;
    }
}
