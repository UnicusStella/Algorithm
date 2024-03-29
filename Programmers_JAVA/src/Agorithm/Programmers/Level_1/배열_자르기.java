package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 배열_자르기 {
    public static void main(String[] args) {

        배열_자르기 stella = new 배열_자르기();

        int[] numbers1 = {1, 2, 3, 4, 5};
        int num1_1 = 1;
        int num1_2 = 3;

        int[] numbers2 = {1, 3, 5};
        int num2_1 = 1;
        int num2_2 = 2;


        System.out.println("Answer1 = " + Arrays.toString(stella.solution(numbers1, num1_1, num1_2)));
        System.out.println("Answer1 = " + Arrays.toString(stella.solution(numbers2, num2_1, num2_2)));
    }

    /*
            numbers	        num1    num2	result
            [1, 2, 3, 4, 5]	    1	    3	[2, 3, 4]
            [1, 3, 5]	        1	    2	[3, 5]
     */
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
