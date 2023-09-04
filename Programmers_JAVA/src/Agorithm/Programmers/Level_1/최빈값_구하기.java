package Agorithm.Programmers.Level_1;

import java.util.HashMap;
import java.util.Map;

public class 최빈값_구하기 {
    public static void main(String[] args) {

        최빈값_구하기 stella = new 최빈값_구하기();

        int[] array1 = {1, 2, 3, 3, 3, 4};
        int[] array2 = {1, 1, 2, 2};
        int[] array3 = {1};

        System.out.println("array1 = " + stella.solution(array1)); // 3
        System.out.println("array2 = " + stella.solution(array2)); // -1
        System.out.println("array3 = " + stella.solution(array3)); // 1
    }

    /*
        array           	    result
        [1, 2, 3, 3, 3, 4]	    3
        [1, 1, 2, 2]	        -1
        [1]	                    1
    */
    public int solution(int[] array) {
        int answer = 0;
        int maxCount = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int number : array) {
            int count = map.getOrDefault(number, 0) + 1;
            if (count > maxCount) {
                maxCount = count;
                answer = number;
            } else if (count == maxCount) {
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
}

