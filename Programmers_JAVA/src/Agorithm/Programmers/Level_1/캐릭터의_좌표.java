package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 캐릭터의_좌표 {
    public static void main(String[] args) {

        캐릭터의_좌표 stella = new 캐릭터의_좌표();

        String[] keyinput1 = {"left", "right", "up", "right", "right"};
        int[] board1 = {11, 11};

        String[] keyinput2 = {"down", "down", "down", "down", "down"};
        int[] board2 = {7, 9};

        System.out.println("Answer1 = " + Arrays.toString(stella.solution(keyinput1, board1)));
        System.out.println("Answer2 = " + Arrays.toString(stella.solution(keyinput2, board2)));
    }

    /*
        keyinput	                                board	    result
        ["left", "right", "up", "right", "right"]	[11, 11]	[2, 1]
        ["down", "down", "down", "down", "down"]	[7, 9]	    [0, -4]
     */
    public int[] solution(String[] keyinput, int[] board) {

        int[] answer = {};

        int[] initPoint = new int[2];

        for (String move : keyinput) {

            switch (move) {
                case "left":
                    if (initPoint[0] > -(board[0] / 2)) initPoint[0]--;
                    break;
                case "right":
                    if (initPoint[0] < (board[0] / 2)) initPoint[0]++;
                    break;
                case "up":
                    if (initPoint[1] < (board[1] / 2)) initPoint[1]++;
                    break;
                case "down":
                    if (initPoint[1] > -(board[1] / 2)) initPoint[1]--;
                    break;
            }
        }

        return initPoint;
    }
}
