package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class K번째수 {
    public static void main(String[] args) {

        K번째수 stella = new K번째수();

        int[] array = {1, 5, 2, 6, 3, 7, 4};

        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println("Answer = " + Arrays.toString(stella.solution(array, commands)));
    }

    /*
        array	                commands	                        return
        [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
     */
    public int[] solution(int[] array, int[][] commands) {

        return Arrays.stream(commands).mapToInt(ints -> {
                    int[] arr = Arrays.copyOfRange(array, ints[0] - 1, ints[1]);
                    Arrays.sort(arr);
                    return arr[ints[2] - 1];
                })
                .toArray();

    }
}
