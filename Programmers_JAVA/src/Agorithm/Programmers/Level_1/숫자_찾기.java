package Agorithm.Programmers.Level_1;

public class 숫자_찾기 {
    public static void main(String[] args) {

        숫자_찾기 stella = new 숫자_찾기();

        int num1 = 29183;
        int k1 = 1;

        int num2 = 232443;
        int k2 = 4;

        int num3 = 123456;
        int k3 = 7;

        System.out.println("Answer = " + stella.solution(num1, k1));
        System.out.println("Answer = " + stella.solution(num2, k2));
        System.out.println("Answer = " + stella.solution(num3, k3));
    }

    /*
        num     	k	    result
        29183	    1	    3
        232443	    4	    4
        123456	    7	   -1
     */
    public int solution(int num, int k) {
        int answer = 0;
        return ("-" + num).indexOf("" + k);
    }
}
