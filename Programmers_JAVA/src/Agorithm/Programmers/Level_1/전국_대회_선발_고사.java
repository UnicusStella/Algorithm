package Agorithm.Programmers.Level_1;

import java.util.HashMap;
import java.util.stream.IntStream;

public class 전국_대회_선발_고사 {
    public static void main(String[] args) {

        전국_대회_선발_고사 stella = new 전국_대회_선발_고사();

        int[] rank1 = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance1 = {false, true, true, true, true, false, false};

        int[] rank2 = {1, 2, 3};
        boolean[] attendance2 = {true, true, true};

        int[] rank3 = {6, 1, 5, 2, 3, 4};
        boolean[] attendance3 = {true, false, true, false, false, true};

        System.out.println("Answer = " + stella.solution(rank1, attendance1));
        System.out.println("Answer = " + stella.solution(rank2, attendance2));
        System.out.println("Answer = " + stella.solution(rank3, attendance3));
    }

    /*
        rank	                attendance	                                    result
        [3, 7, 2, 5, 4, 6, 1]	[false, true, true, true, true, false, false]	20403
        [1, 2, 3]	            [true, true, true]	                            102
        [6, 1, 5, 2, 3, 4]	    [true, false, true, false, false, true]	        50200
     */
    public int solution(int[] rank, boolean[] attendance) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < rank.length; i++) {
            map.put(rank[i], i);
        }

        int[] ranking = IntStream.range(0, rank.length)
                .filter(value -> attendance[value])
                .map(operand -> rank[operand])
                .sorted()
                .limit(3)
                .toArray();

        return (map.get(ranking[0]) * 10000) + (map.get(ranking[1]) * 100) + map.get(ranking[2]);
    }
}
