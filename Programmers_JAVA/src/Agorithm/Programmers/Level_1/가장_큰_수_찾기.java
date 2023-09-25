package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 가장_큰_수_찾기 {
    public static void main(String[] args) {

        가장_큰_수_찾기 stella = new 가장_큰_수_찾기();

        int[] array1 = {1, 8, 3};

        int[] array2 = {9, 10, 11, 8};

        System.out.println("Answer1 = " + Arrays.toString(stella.solution(array1)));
        System.out.println("Answer2 = " + Arrays.toString(stella.solution(array2)));
    }

    /*
        array	        result
        [1, 8, 3]	    [8, 1]
        [9, 10, 11, 8]	[11, 2]
     */
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }

    public int[] solution2(int[] array) {
        int[] answer = new int[2];

        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        Integer max = list.stream().max(Integer::compareTo).orElse(0);
        Integer index = list.indexOf(max);

        return new int[]{max, index};
    }
}
