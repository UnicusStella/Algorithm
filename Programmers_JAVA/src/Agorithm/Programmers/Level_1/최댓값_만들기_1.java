package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 최댓값_만들기_1 {
    public static void main(String[] args) {

        최댓값_만들기_1 stella = new 최댓값_만들기_1();

        int[] numbers1 = {1, 2, 3, 4, 5};

        int[] numbers2 = {0, 31, 24, 10, 1, 9};

        System.out.println("Answer1 = " + stella.solution(numbers1));
        System.out.println("Answer2 = " + stella.solution(numbers2));
    }

    /*
        numbers         	    result
        [1, 2, 3, 4, 5]	        20
        [0, 31, 24, 10, 1, 9]	744
     */
    public int solution(int[] numbers) {
        int answer = 0;

        List<Integer> list = Arrays.stream(numbers).boxed()
                .sorted(Collections.reverseOrder())
                .limit(2)
                .collect(Collectors.toList());

        return list.get(0) * list.get(1);
    }

    // 성능면에서는 아래쪽 코드가 더 빠름.
    public int solution2(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
