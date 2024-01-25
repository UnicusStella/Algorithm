package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 숫자2의_영역 {
    public static void main(String[] args) {

        숫자2의_영역 stella = new 숫자2의_영역();

        int[] arr1 = {1, 2, 1, 4, 5, 2, 9};

        int[] arr2 = {1, 2, 1};

        int[] arr3 = {1, 1, 1};

        int[] arr4 = {1, 2, 1, 2, 1, 10, 2, 1};

        System.out.println("Answer = " + Arrays.toString(stella.solution(arr1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(arr2)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(arr3)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(arr4)));
    }

    /*
        arr	                        result
        [1, 2, 1, 4, 5, 2, 9]	    [2, 1, 4, 5, 2]
        [1, 2, 1]	                [2]
        [1, 1, 1]	                [-1]
        [1, 2, 1, 2, 1, 10, 2, 1]	[2, 1, 2, 1, 10, 2]
     */
    public int[] solution(int[] arr) {

        int[] array = IntStream.range(0, arr.length).filter(value -> arr[value] == 2).toArray();

        return array.length == 0
                ? new int[]{-1}
                : array.length == 1
                ? new int[]{arr[array[0]]}
                : Arrays.copyOfRange(arr, array[0], array[array.length - 1] + 1);
    }

    public int[] solution2(int[] arr) {

        int[] arrs = IntStream.range(0, arr.length).filter(value -> arr[value] == 2).toArray();

        if (arrs.length == 0) return new int[]{-1};

        return IntStream.rangeClosed(arrs[0], arrs[arrs.length - 1]).map(i -> arr[i]).toArray();
    }

}
