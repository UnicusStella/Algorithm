package Agorithm.Programmers.Level_1;

import java.util.HashMap;

public class 문자열_묶기 {
    public static void main(String[] args) {

        문자열_묶기 stella = new 문자열_묶기();

        String[] strArr1 = {"a", "bc", "d", "efg", "hi"};

        System.out.println("Answer = " + stella.solution(strArr1));
    }

    /*
        strArr	                    result
        ["a","bc","d","efg","hi"]	2
     */
    public int solution(String[] strArr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (String str : strArr) {
            map.put(str.length(), map.getOrDefault(str.length(), 0) + 1);
        }

        return map.values().stream().mapToInt(Integer::intValue).max().orElse(0);
    }
}
