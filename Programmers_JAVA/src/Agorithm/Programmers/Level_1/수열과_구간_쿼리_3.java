package Agorithm.Programmers.Level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 수열과_구간_쿼리_3 {
    public static void main(String[] args) {

        수열과_구간_쿼리_3 stella = new 수열과_구간_쿼리_3();

        int[] arr1 = {0, 1, 2, 3, 4};
        int[][] queries1 = {{0, 3}, {1, 2}, {1, 4}};

        System.out.println("Answer = " + Arrays.toString(stella.solution(arr1, queries1)));
    }

    /*
        arr	                queries	                    result
        [0, 1, 2, 3, 4]	    [[0, 3],[1, 2],[1, 4]]	    [3, 4, 1, 0, 2]
     */
    public int[] solution(int[] arr, int[][] queries) {

        // 방법 1 Stream
        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));

        for (int i = 0; i < queries.length; i++) {
            int change1 = queries[i][0];
            int change2 = queries[i][1];

            int value1 = list.get(change1);
            int value2 = list.get(change2);

            list.set(change1, value2);
            list.set(change2, value1);
        }

        // 방법 2 Arrays, For
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int[] query : queries) {
            int x = query[0];
            int y = query[1];

            int swap = answer[x];
            answer[x] = answer[y];
            answer[y] = swap;
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public int[] solution2(int[] arr, int[][] queries) {

        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));

        for (int[] query : queries) {
            Collections.swap(list, query[0], query[1]);
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
