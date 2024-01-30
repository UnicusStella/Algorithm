package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 무작위로_K개의_수_뽑기 {
    public static void main(String[] args) {

        무작위로_K개의_수_뽑기 stella = new 무작위로_K개의_수_뽑기();

        int[] arr1 = {0, 1, 1, 2, 2, 3};
        int k1 = 3;

        int[] arr2 = {0, 1, 1, 1, 1};
        int k2 = 4;

        System.out.println("Answer = " + Arrays.toString(stella.solution(arr1, k1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(arr2, k2)));
    }

    /*
        arr	                    k	    result
        [0, 1, 1, 2, 2, 3]	    3	    [0, 1, 2]
        [0, 1, 1, 1, 1]	        4	    [0, 1, -1, -1]
     */
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];

        Arrays.fill(answer, -1);

        int[] array = Arrays.stream(arr).distinct().limit(k).toArray();

        for (int i = 0; i < array.length; i++) {
            answer[i] = array[i];
        }

        return answer;
    }

    public int[] solution2(int[] arr, int k) {

        return IntStream.concat(Arrays.stream(arr).distinct(), IntStream.range(0, k).map(operand -> -1))
                .limit(k)
                .toArray();
    }
}
