package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 가까운_수 {
    public static void main(String[] args) {

        가까운_수 stella = new 가까운_수();

        int[] array1 = {3, 10, 28};
        int n1 = 20;

        int[] array2 = {10, 11, 12};
        int n2 = 13;

        System.out.println("Answer1 = " + stella.solution(array1, n1));
        System.out.println("Answer2 = " + stella.solution(array2, n2));
    }

    /*
        array	        n   	result
        [3, 10, 28]	    20  	28
        [10, 11, 12]	13  	12
     */
    public int solution(int[] array, int n) {
        Arrays.sort(array);

        int answer = array[0];
        int target = Math.abs(n - array[0]);

        for (Integer number : array) {;
            if (target > Math.abs(n - number)) {
                target = Math.abs(n - number);
                answer = number;
            }
        }
        return answer;
    }
}
