package Agorithm.Programmers.Level_1;

import java.util.*;
import java.util.stream.Collectors;

public class 배열의_유사도 {
    public static void main(String[] args) {

        배열의_유사도 stella = new 배열의_유사도();

        String[] s1_1 = {"a", "b", "c"};
        String[] s2_1 = {"com", "b", "d", "p", "c"};

        String[] s1_2 = {"n", "omg"};
        String[] s2_2 = {"m", "dot"};

        System.out.println("Answer1 = " + stella.solution2(s1_1, s2_1));
        System.out.println("Answer2 = " + stella.solution2(s1_2, s2_2));
    }

    /*
        s1	            s2	                            result
        ["a", "b", "c"]	["com", "b", "d", "p", "c"] 	2
        ["n", "omg"]	["m", "dot"]	                0
     */
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        int matchCount = 0;
        List<String> bigList = null;
        List<String> smallList = null;

        ArrayList list = new ArrayList();

        if (s1.length >= s2.length) {
            bigList = Arrays.stream(s1).collect(Collectors.toList());
            smallList = Arrays.stream(s2).collect(Collectors.toList());
        } else {
            bigList = Arrays.stream(s2).collect(Collectors.toList());
            smallList = Arrays.stream(s1).collect(Collectors.toList());
        }

        for (String target : smallList) {
            if (bigList.indexOf(target) != -1) matchCount++;
        }

        return matchCount;
    }

    // 개선된 방법
    public int solution2(String[] s1, String[] s2) {
        int answer = 0;
        long count = 0;

        // 방법1. Set
        Set set = new HashSet<>(Arrays.asList(s1));
        count = Arrays.stream(s2).filter(set::contains).count();

        // 방법2. Stream
        count = Arrays.stream(s1).filter(s -> Arrays.stream(s2).collect(Collectors.toList())
                        .contains(s))
                .count();

        return (int) count;
    }
}
