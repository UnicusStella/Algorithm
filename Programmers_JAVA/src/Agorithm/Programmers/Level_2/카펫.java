package Agorithm.Programmers.Level_2;

import java.util.Arrays;

public class 카펫 {
    public static void main(String[] args) {

        카펫 stella = new 카펫();

        int brown1 = 10;
        int yellow1 = 2;

        int brown2 = 8;
        int yellow2 = 1;

        int brown3 = 24;
        int yellow3 = 24;

        System.out.println("Answer = " + Arrays.toString(stella.solution(brown1, yellow1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(brown2, yellow2)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(brown3, yellow3)));
    }

    /*
        brown	yellow	return
        10	    2	    [4, 3]
        8	    1	    [3, 3]
        24	    24	    [8, 6]
     */
    public int[] solution(int brown, int yellow) {

        int[] answer = new int[2];

        int carpetSize = brown + yellow;

        for (int i = 2; i < carpetSize; i++) {
            if (carpetSize % i == 0 && i >= carpetSize / i && (i - 2) * ((carpetSize / i) - 2) == yellow) {
                answer[0] = i;
                answer[1] = carpetSize / i;
                break;
            }
        }

        return answer;
    }
}