package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 배열_만들기_3 {
    public static void main(String[] args) {

        배열_만들기_3 stella = new 배열_만들기_3();

        int[] arr1 = {1, 2, 3, 4, 5};
        int[][] intervals1 = {{1, 3}, {0, 4}};

        System.out.println("Answer = " + Arrays.toString(stella.solution(arr1, intervals1)));
    }

    /*
        arr	                intervals	        result
        [1, 2, 3, 4, 5]	    [[1, 3], [0, 4]]	[2, 3, 4, 1, 2, 3, 4, 5]
     */
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};

        int[] arr1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] arr2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);

        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
    }

    public int[] solution2(int[] arr, int[][] intervals) {

        return Arrays.stream(intervals)
                .flatMapToInt(ints -> Arrays.stream(
                        Arrays.copyOfRange(arr, ints[0], ints[1] + 1))
                )
                .toArray();
    }
}
