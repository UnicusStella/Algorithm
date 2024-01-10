package Agorithm.Programmers.Level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class 수열과_구간_쿼리_2 {
    public static void main(String[] args) {

        수열과_구간_쿼리_2 stella = new 수열과_구간_쿼리_2();

        int[] arr1 = {0, 1, 2, 4, 3};
        int[][] queries1 = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};

        int[] arr2 = {5, 4, 3, 2, 1};
        int[][] queries2 = {{0, 4, 2}};

        System.out.println("Answer = " + Arrays.toString(stella.solution(arr1, queries1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(arr2, queries2)));
    }

    /*
        arr	                queries	                            result
        [0, 1, 2, 4, 3]	    [[0, 4, 2],[0, 3, 2],[0, 2, 2]]	    [3, 4, -1]
     */
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            for (int j = query[0]; j <= query[1]; j++) {
                if (arr[j] > query[2]) {
                    list.add(arr[j]);
                } else {
                    answer[i] = -1;
                }
            }
            if (!list.isEmpty()) {
                Collections.sort(list);
                answer[i] = list.get(0);
            }
            list.clear();
        }

        return answer;
    }

    public int[] solution2(int[] arr, int[][] queries) {

        return Arrays.stream(queries)
                .mapToInt(ints -> IntStream.rangeClosed(ints[0],ints[1])
                        .map(operand -> arr[operand])
                        .filter(value -> value > ints[2])
                        .min()
                        .orElse(-1))
                .toArray();
    }
}
