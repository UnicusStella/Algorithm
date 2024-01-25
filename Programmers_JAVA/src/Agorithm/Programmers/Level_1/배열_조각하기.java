package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 배열_조각하기 {
    public static void main(String[] args) {

        배열_조각하기 stella = new 배열_조각하기();

        int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] query1 = {4, 1, 2};

        System.out.println("Answer = " + Arrays.toString(stella.solution(arr1, query1)));
    }

    /*
        arr	                query	    result
        [0, 1, 2, 3, 4, 5]	[4, 1, 2]	[1, 2, 3]
     */
    public int[] solution(int[] arr, int[] query) {

        int start = 0;
        int end = arr.length - 1;

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i] - 1;
            } else {
                start += query[i];
            }
        }

        return Arrays.copyOfRange(arr, start, end + 2);
    }
}
