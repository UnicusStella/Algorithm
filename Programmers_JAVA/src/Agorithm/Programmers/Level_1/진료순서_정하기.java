package Agorithm.Programmers.Level_1;

import java.util.*;
import java.util.stream.Collectors;

public class 진료순서_정하기 {
    public static void main(String[] args) {

        진료순서_정하기 stella = new 진료순서_정하기();

        int[] emergency1 = {3, 76, 24};
        int[] emergency2 = {1, 2, 3, 4, 5, 6, 7};
        int[] emergency3 = {30, 10, 23, 6, 100};


        System.out.println("Answer1 = " + Arrays.toString(stella.solution(emergency1)));
        System.out.println("Answer1 = " + Arrays.toString(stella.solution(emergency2)));
        System.out.println("Answer1 = " + Arrays.toString(stella.solution(emergency3)));
    }

    /*
            emergency	            result
            [3, 76, 24]	            [3, 1, 2]
            [1, 2, 3, 4, 5, 6, 7]	[7, 6, 5, 4, 3, 2, 1]
            [30, 10, 23, 6, 100]	[2, 4, 3, 5, 1]
     */
    public int[] solution(int[] emergency) {

        List<Integer> list = Arrays.stream(emergency)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i + 1);
        }

        return Arrays.stream(emergency)
                .map(item -> map.get(item))
                .toArray();
    }
}
