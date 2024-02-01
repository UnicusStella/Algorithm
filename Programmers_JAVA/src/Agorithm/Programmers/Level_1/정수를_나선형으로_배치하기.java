package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 정수를_나선형으로_배치하기 {
    public static void main(String[] args) {

        정수를_나선형으로_배치하기 stella = new 정수를_나선형으로_배치하기();

        int n1 = 4;

        int n2 = 5;

        System.out.println("Answer = " + Arrays.deepToString(stella.solution(n1)));
        System.out.println("Answer = " + Arrays.deepToString(stella.solution(n2)));
    }

    /*
        n	result
        4	[[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]
        5	[[1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9]]
     */
    public int[][] solution(int n) {

        int[][] answer = new int[n][n];

        int num = 1;
        int colStart = 0;
        int colEnd = n - 1;
        int rowStart = 0;
        int rowEnd = n - 1;

        while (colStart <= colEnd && rowStart <= rowEnd) {

            // 왼쪽 => 오른쪽
            for (int i = colStart; i <= colEnd; i++) {
                answer[rowStart][i] = num++;
            }
            rowStart++;

            // 위 => 아래
            for (int i = rowStart; i <= rowEnd; i++) {
                answer[i][colEnd] = num++;
            }
            colEnd--;

            // 오른쪽 => 왼쪽
            for (int i = colEnd; i >= colStart; i--) {
                answer[rowEnd][i] = num++;
            }
            rowEnd--;

            // 아래 => 위
            for (int i = rowEnd; i >= rowStart; i--) {
                answer[i][colStart] = num++;
            }
            colStart++;
        }
        return answer;
    }
}
