package Agorithm.Programmers.Level_1;

import java.util.HashMap;

public class 겹치는_선분의_길이 {
    public static void main(String[] args) {

        겹치는_선분의_길이 stella = new 겹치는_선분의_길이();

        int[][] lines1 = {{0, 1}, {2, 5}, {3, 9}};

        int[][] lines2 = {{-1, 1}, {1, 3}, {3, 9}};

        int[][] lines3 = {{0, 5}, {3, 9}, {1, 10}};

        System.out.println("Answer = " + stella.solution(lines1));
        System.out.println("Answer = " + stella.solution(lines2));
        System.out.println("Answer = " + stella.solution(lines3));
    }

    /*
        lines	                        result
        [[0, 1], [2, 5], [3, 9]]	    2
        [[-1, 1], [1, 3], [3, 9]]	    0
        [[0, 5], [3, 9], [1, 10]]	    8
     */
    public int solution(int[][] lines) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap();

        for (int[] line : lines) {
            for (int i = line[0]; i < line[1]; i++) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        // 방법 1
        for (Integer key : map.keySet()) {
            if (map.get(key) >= 2) answer++;
        }

        // 방법 2
        return (int) map.values().stream()
                .filter(integer -> integer >= 2)
                .count();
    }
}