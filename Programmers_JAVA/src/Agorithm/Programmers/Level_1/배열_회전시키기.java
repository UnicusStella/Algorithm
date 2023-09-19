package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 배열_회전시키기 {
    public static void main(String[] args) {

        배열_회전시키기 stella = new 배열_회전시키기();

        int[] numbers1 = {1, 2, 3};
        String direction1 = "right";

        int[] numbers2 = {4, 455, 6, 4, -1, 45, 6};
        String direction2 = "left";

        System.out.println("Answer1 = " + Arrays.toString(stella.solution(numbers1, direction1)));
        System.out.println("Answer2 = " + Arrays.toString(stella.solution(numbers2, direction2)));
    }

    /*
        numbers	                    direction   result
        [1, 2, 3]	                "right"	    [3, 1, 2]
        [4, 455, 6, 4, -1, 45, 6]	"left"	    [455, 6, 4, -1, 45, 6, 4]
     */
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};

        List<Integer> list = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList());

        if (direction.equals("right")) {
            Integer lastNum = list.remove(list.size() - 1);
            list.add(0, lastNum);
        } else {
            Integer firstNum = list.remove(0);
            list.add(firstNum);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
