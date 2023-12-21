package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 안전지대 {
    public static void main(String[] args) {

        안전지대 stella = new 안전지대();

        int[][] board1 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};

        int[][] board2 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};

        int[][] board3 = {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};

        System.out.println("Answer = " + stella.solution(board1));
        System.out.println("Answer = " + stella.solution(board2));
        System.out.println("Answer = " + stella.solution(board3));
    }

    /*
        board	                                                                                                                    result
        [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 0, 0], [0, 0, 0, 0, 0]]	                                    16
        [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 1, 0], [0, 0, 0, 0, 0]]	                                    13
        [[1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1]]	0
    */
    public int solution(int[][] board) {

        // 액자 배열 생성 board + 2
        int[][] matrix = new int[board.length + 2][board.length + 2];

        // 액자 배열 '2'로 초기화
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = 2;
            }
        }

        // board -> 액자 배열로 이식
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                matrix[i + 1][j + 1] = board[i][j];
            }
        }

        // 위험지역 탐색
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) {
                    // 위험지역 탐색 메소드 (위험지역 일시 2로 변경)
                    danger(matrix, i, j);
                }
            }
        }

        return (int) Arrays.stream(matrix)
                .flatMapToInt(ints -> Arrays.stream(ints))
                .filter(num -> num == 0)
                .count();
    }
    private int[][] danger(int[][] matrix, int x, int y) {

        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                try {
                    if (matrix[x + i][y + j] == 0) {
                        matrix[x + i][y + j] = 2;
                    }
                } catch (Exception e) {

                }

            }
        }

        return matrix;
    }
    public int solution2(int[][] board) {

        // 위험지역 탐색
        // solution 과 다른 점은 위험지역을 탐색하는 danger 에서
        // try-catch 문을 추가하여 범위를 벗어나더라도 종료되지 않게 처리
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    danger(board, i, j);
                }
            }
        }

        return (int) Arrays.stream(board)
                .flatMapToInt(ints -> Arrays.stream(ints))
                .filter(num -> num == 0)
                .count();
    }
}


