package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 정사각형으로_만들기 {
    public static void main(String[] args) {

        정사각형으로_만들기 stella = new 정사각형으로_만들기();

        int[][] arr1 = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};

        int[][] arr2 = {{57, 192, 534, 2}, {9, 345, 192, 999}};

        int[][] arr3 = {{1, 2}, {3, 4}};

        System.out.println("Answer = " + Arrays.deepToString(stella.solution(arr1)));
        System.out.println("Answer = " + Arrays.deepToString(stella.solution(arr2)));
        System.out.println("Answer = " + Arrays.deepToString(stella.solution(arr3)));
    }

    /*
        arr	                                                                    result
        [[572, 22, 37], [287, 726, 384], [85, 137, 292], [487, 13, 876]]	    [[572, 22, 37, 0], [287, 726, 384, 0], [85, 137, 292, 0], [487, 13, 876, 0]]
        [[57, 192, 534, 2], [9, 345, 192, 999]]	                                [[57, 192, 534, 2], [9, 345, 192, 999], [0, 0, 0, 0], [0, 0, 0, 0]]
        [[1, 2], [3, 4]]	                                                    [[1, 2], [3, 4]]
     */
    public int[][] solution(int[][] arr) {

        int matrix = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[matrix][matrix];

        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, arr[i].length);
        }

        return answer;
    }
}
