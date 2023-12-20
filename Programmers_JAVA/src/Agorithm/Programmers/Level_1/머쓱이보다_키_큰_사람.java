package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 머쓱이보다_키_큰_사람 {
    public static void main(String[] args) {

        머쓱이보다_키_큰_사람 stella = new 머쓱이보다_키_큰_사람();

        int[] array1 = {149, 180, 192, 170};
        int height1 = 167;

        int[] array2 = {180, 120, 140};
        int height2 = 190;

        System.out.println("Answer1 = " + stella.solution(array1, height1));
        System.out.println("Answer2 = " + stella.solution(array2, height2));
    }

    /*
        array	                height	    result
        [149, 180, 192, 170]	167	        3
        [180, 120, 140]	        190	        0
     */

    public int solution(int[] array, int height) {
        int answer = 0;
        return (int) Arrays.stream(array).filter(value -> value > height).count();
    }
}
