package Agorithm.Programmers.Level_1;

public class 이웃한_칸 {
    public static void main(String[] args) {

        이웃한_칸 stella = new 이웃한_칸();

        String[][] board1 = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
        int h1 = 1;
        int w1 = 1;

        String[][] board2 = {{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}};
        int h2 = 0;
        int w2 = 1;

        System.out.println("Answer = " + stella.solution(board1, h1, w1));
        System.out.println("Answer = " + stella.solution(board2, h2, w2));
    }

    /*
        board
        [["blue", "red", "orange", "red"], ["red", "red", "blue", "orange"], ["blue", "orange", "red", "red"], ["orange", "orange", "red", "blue"]]
        [["yellow", "green", "blue"], ["blue", "green", "yellow"], ["yellow", "blue", "blue"]]

        h	w	result
        1	1	2
        0	1	1
     */
    public int solution(String[][] board, int h, int w) {

        int answer = 0;

        int[] dh = {1, -1, 0, 0};
        int[] dw = {0, 0, -1, 1};
        int dh_Check, dw_Check;

        for (int i = 0; i < 4; i++) {
            dh_Check = h + dh[i];
            dw_Check = w + dw[i];

            if ((dh_Check >= 0 && dh_Check < board.length) && (dw_Check >= 0 && dw_Check < board.length)) {
                if (board[h][w].equals(board[dh_Check][dw_Check])) answer++;
            }
        }

        return answer;
    }
}
