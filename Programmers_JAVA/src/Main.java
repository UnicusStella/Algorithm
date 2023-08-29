import Agorithm.Programmers.Level_1.피자_나눠_먹기_3;

public class Main {
    public static void main(String[] args) {

        피자_나눠_먹기_3 stella = new 피자_나눠_먹기_3();

        int slice1 = 7;
        int n1 = 10;

        int slice2 = 4;
        int n2 = 12;

        System.out.println("n1 = " + stella.solution(slice1, n1));
        System.out.println("n2 = " + stella.solution(slice2, n2));
    }
}
/*
    slice	n	result
     7	    10	    2
     4	    12	    3
 */