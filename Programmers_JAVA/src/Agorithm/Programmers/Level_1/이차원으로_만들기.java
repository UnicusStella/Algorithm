package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 이차원으로_만들기 {
    public static void main(String[] args) {

        이차원으로_만들기 stella = new 이차원으로_만들기();

        int[] num_list1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int n1 = 2;

        int[] num_list2 = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n2 = 3;

        System.out.println("Answer1 = " + Arrays.deepToString(stella.solution(num_list1, n1)));
        System.out.println("Answer1 = " + Arrays.deepToString(stella.solution(num_list2, n2)));
    }

    /*
            num_list	                        n	    result
            [1, 2, 3, 4, 5, 6, 7, 8]	        2	    [[1, 2], [3, 4], [5, 6], [7, 8]]
            [100, 95, 2, 4, 5, 6, 18, 33, 948]	3	    [[100, 95, 2], [4, 5, 6], [18, 33, 948]]
     */
    public int[][] solution(int[] num_list, int n) {

        int row = num_list.length / n;
        int col = n;
        int count = 0;

        int[][] answer = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                answer[i][j] = num_list[count];
                count++;
            }
        }
        return answer;
    }
}
