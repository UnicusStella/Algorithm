package Agorithm.Programmers.Level_1;

public class 이차원으로_만들기 {
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
