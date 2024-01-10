package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 수열과_구간_쿼리_4 {
    public static void main(String[] args) {

        수열과_구간_쿼리_4 stella = new 수열과_구간_쿼리_4();

        int[] arr1 = {0, 1, 2, 4, 3};
        int[][] queries1 = {{0, 4, 2}, {0, 3, 2}, {0, 3, 3}};

        System.out.println("Answer = " + Arrays.toString(stella.solution(arr1, queries1)));
    }

    /*
        arr	                queries	                            result
        [0, 1, 2, 4, 3]	    [[0, 4, 2],[0, 3, 2],[0, 3, 3]]	    [3, 2, 4, 6, 4]
     */
    public int[] solution(int[] arr, int[][] queries) {

        int[] answer = arr;
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                if (i == 0) answer[i] += 1;
                else if (i % query[2] == 0) {
                    answer[i] += 1;
                }
            }
        }
        return answer;
    }
}
