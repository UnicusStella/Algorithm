import Agorithm.Programmers.Level_1.진료순서_정하기;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        진료순서_정하기 stella = new 진료순서_정하기();

        int[] emergency1 = {3, 76, 24};
        int[] emergency2 = {1, 2, 3, 4, 5, 6, 7};
        int[] emergency3 = {30, 10, 23, 6, 100};


        System.out.println("Answer1 = " + Arrays.toString(stella.solution(emergency1)));
        System.out.println("Answer1 = " + Arrays.toString(stella.solution(emergency2)));
        System.out.println("Answer1 = " + Arrays.toString(stella.solution(emergency3)));
    }
}
/*
        emergency	            result
        [3, 76, 24]	            [3, 1, 2]
        [1, 2, 3, 4, 5, 6, 7]	[7, 6, 5, 4, 3, 2, 1]
        [30, 10, 23, 6, 100]	[2, 4, 3, 5, 1]
 */