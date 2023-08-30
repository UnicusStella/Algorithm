import Agorithm.Programmers.Level_1.점의_위치_구하기;

public class Main {
    public static void main(String[] args) {

        점의_위치_구하기 stella = new 점의_위치_구하기();

        int[] dot1 = {2, 4};
        int[] dot2 = {-7, 9};

        System.out.println("Answer1 = " + stella.solution(dot1));
        System.out.println("Answer2 = " + stella.solution(dot2));
    }
}
/*
        dot	        result
        [2, 4]	    1
        [-7, 9]	    2
 */