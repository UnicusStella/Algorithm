package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 햄버거_만들기 {
    public static void main(String[] args) {

        햄버거_만들기 stella = new 햄버거_만들기();

        int[] ingredient1 = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int[] ingredient2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        int[] ingredient3 = {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
        int[] ingredient4 = {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};

        System.out.println("Answer = " + stella.solution(ingredient1));
        System.out.println("Answer = " + stella.solution(ingredient2));
        System.out.println("Answer = " + stella.solution(ingredient3));
        System.out.println("Answer = " + stella.solution(ingredient4));
    }

    /*
        ingredient	                    result
        [2, 1, 1, 2, 3, 1, 2, 3, 1]	    2
        [1, 3, 2, 1, 2, 1, 3, 1, 2]	    0
     */
    public int solution(int[] ingredient) {

        int answer = 0;
        int idx;
        StringBuilder burger = new StringBuilder();

        burger.append(Arrays.stream(ingredient).mapToObj(String::valueOf).collect(Collectors.joining()));

        while (burger.indexOf("1231") != -1) {

            idx = burger.indexOf("1231");
            burger.delete(idx, idx + 4);
            answer++;
        }

        return answer;
    }
    public int solution2(int[] ingredient) {

        int[] stack = new int[ingredient.length];
        int burger = 0;
        int answer = 0;
        for (int i : ingredient) {
            stack[burger++] = i;
            if (burger >= 4 && stack[burger - 1] == 1
                    && stack[burger - 2] == 3
                    && stack[burger - 3] == 2
                    && stack[burger - 4] == 1) {
                burger -= 4;
                answer++;
            }
        }

        return answer;
    }
}
