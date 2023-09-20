package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 배열_원소의_길이 {
    public static void main(String[] args) {

        배열_원소의_길이 stella = new 배열_원소의_길이();

        String[] strlist1 = {"We", "are", "the", "world!"};
        String[] strlist2 = {"I", "Love", "Programmers."};

        System.out.println("Answer1 = " + Arrays.toString(stella.solution(strlist1)));
        System.out.println("Answer1 = " + Arrays.toString(stella.solution(strlist2)));
    }

    /*
        strlist	                            result
        ["We", "are", "the", "world!"]	    [2, 3, 3, 6]
        ["I", "Love", "Programmers."]	    [1, 4, 12]
     */
    public int[] solution(String[] strlist) {
        int[] answer = {};

        return Arrays.stream(strlist)
                .mapToInt(String::length)
                .toArray();
    }
}
