package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 배열의_원소만큼_추가하기 {
    public static void main(String[] args) {

        배열의_원소만큼_추가하기 stella = new 배열의_원소만큼_추가하기();

        int[] arr1 = {5, 1, 4};

        int[] arr2 = {6, 6};

        int[] arr3 = {1};

        System.out.println("Answer = " + Arrays.toString(stella.solution(arr1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(arr2)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(arr3)));
    }

    /*
        arr	            result
        [5, 1, 4]	    [5, 5, 5, 5, 5, 1, 4, 4, 4, 4]
        [6, 6]	        [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
        [1]	            [1]
     */
    public int[] solution(int[] arr) {

        return IntStream.range(0, arr.length)
                .flatMap(operand -> IntStream.range(0, arr[operand])
                        .map(value -> arr[operand]))
                .toArray();

    }
}
