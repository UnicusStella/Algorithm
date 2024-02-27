package Agorithm.Programmers.Level_1;

import java.util.Stack;

public class 크레인_인형뽑기_게임 {
    public static void main(String[] args) {

        크레인_인형뽑기_게임 stella = new 크레인_인형뽑기_게임();

        int[][] board1 = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves1 = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println("Answer = " + stella.solution(board1, moves1));
    }

    /*
        board	                                                        moves	            result
        [[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]	[1,5,3,5,1,2,1,4]	4
     */
    public int solution(int[][] board, int[] moves) {

        int answer = 0;
        boolean isMove;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                isMove = false;
                if (board[i][move - 1] != 0) {
                    stack.push(board[i][move - 1]);
                    board[i][move - 1] = 0;
                    isMove = true;
                }
                if (isMove) break;
            }

            if (stack.size() >= 2 && stack.get(stack.size() - 1) == stack.get(stack.size() - 2)) {
                stack.pop();
                stack.pop();
                answer += 2;
            }
        }

        return answer;
    }
}
