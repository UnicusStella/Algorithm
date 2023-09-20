package Agorithm.Programmers.Level_1;

import java.util.*;
import java.util.stream.Collectors;

public class 한_번만_등장한_문자 {
    public static void main(String[] args) {

        한_번만_등장한_문자 stella = new 한_번만_등장한_문자();

        String s1 = "abcabcadc";

        String s2 = "abdc";

        String s3 = "hello";

        System.out.println("Answer1 = " + stella.solution(s1));
        System.out.println("Answer2 = " + stella.solution(s2));
        System.out.println("Answer3 = " + stella.solution(s3));
    }

    /*
        s           	result
        "abcabcadc"	    "d"
        "abdc"	        "abcd"
        "hello"	        "eho"
     */
    // Stream 1
    public String solution(String s) {
        String answer = "";

        List<String> list = Arrays.stream(s.split(""))
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        for (String target : list) {
            if (s.indexOf(target) == s.lastIndexOf(target)) {
                answer += target;
            }
        }

        return answer;
    }
    // Stream 2
    public String solution2(String s) {
        return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() <= 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());
    }
    // map 을 이용해 봤지만 성능이 느림..
    public String solution3(String s) {

        String answer = "";

        char[] chList = s.toCharArray();

        Arrays.sort(chList);

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : chList) {
            int count = map.getOrDefault(ch, 0) + 1;
            map.put(ch, count);
        }

        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                answer += ch;
            }
        }

        return answer;
    }
}
