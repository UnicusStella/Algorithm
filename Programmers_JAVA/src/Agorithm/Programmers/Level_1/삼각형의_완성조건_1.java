package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 삼각형의_완성조건_1 {
    public static void main(String[] args) {

        삼각형의_완성조건_1 stella = new 삼각형의_완성조건_1();

        int[] sides1 = {1, 2, 3};

        int[] sides2 = {3, 6, 2};

        int[] sides3 = {199, 72, 222};

        System.out.println("Answer1 = " + stella.solution(sides1));
        System.out.println("Answer2 = " + stella.solution(sides2));
        System.out.println("Answer3 = " + stella.solution(sides3));
    }

    /*
        sides	            result
        [1, 2, 3]   	    2
        [3, 6, 2]	        2
        [199, 72, 222]  	1
     */
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);

        return sides[2] < sides[0] + sides[1]
                ? 1
                : 2;
    }
}
