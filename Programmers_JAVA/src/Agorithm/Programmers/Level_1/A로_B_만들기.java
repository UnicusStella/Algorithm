package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class A로_B_만들기 {
    public static void main(String[] args) {

        A로_B_만들기 stella = new A로_B_만들기();

        String before1 = "olleh";
        String after1 = "hello";

        String before2 = "allpe";
        String after2 = "apple";

        System.out.println("Answer = " + stella.solution(before1, after1));
        System.out.println("Answer = " + stella.solution(before2, after2));
    }

    /*
        before	    after	    result
        "olleh"	    "hello"	    1
        "allpe"	    "apple"	    0
     */
    public int solution(String before, String after) {
        int answer = 0;


        // 방안 1. Stream
        before = Arrays.stream(before.split(""))
                .sorted()
                .collect(Collectors.joining());

        after = Arrays.stream(after.split(""))
                .sorted()
                .collect(Collectors.joining());


        // 방안 2. toCharArray
        char[] beforeCharArray = before.toCharArray();
        char[] afterCharArray = after.toCharArray();

        Arrays.sort(beforeCharArray);
        Arrays.sort(afterCharArray);

        before = new String(beforeCharArray);
        after = new String(afterCharArray);

        return before.equals(after) == true ? 1 : 0;
    }
}