package Agorithm.Programmers.Level_1;

public class 둘만의_암호 {
    public static void main(String[] args) {

        둘만의_암호 stella = new 둘만의_암호();

        String s1 = "aukks";
        String skip1 = "wbqd";
        int index1 = 5;

        String s2 = "z";
        String skip2 = "a";
        int index2 = 1;

        String s3 = "z";
        String skip3 = "abcdefg";
        int index3 = 20;

        System.out.println("Answer = " + stella.solution2(s1, skip1, index1));
        System.out.println("Answer = " + stella.solution2(s2, skip2, index2));
        System.out.println("Answer = " + stella.solution2(s3, skip3, index3));
    }

    /*
        s	    skip	    index	result
        "aukks"	"wbqd"	    5	    "happy"
        "z"	    "a"	        1	    "b"
        "z"	    "abcdefg"	20	    "h"
     */
    public String solution(String s, String skip, int index) {

        String answer = "";
        int[] alphabet = new int[27];
        int skipCount = 0;
        int shift;

        for (char target : skip.toCharArray())
            alphabet[target - 'a']++;

        for (char target : s.toCharArray()) {
            shift = index;
            for (int i = 0; i <= shift; i++) {
                skipCount = i % 26;
                shift += alphabet[(target - 'a' + i) % 26];
            }

            answer += Character.toString(target + skipCount > 'z' ? target + skipCount - 26 : target + skipCount);
        }

        return answer;
    }

    public String solution2(String s, String skip, int index) {

        String answer = "";
        int shift;

        for (char target : s.toCharArray()) {
            shift = index;

            while (shift > 0) {
                if (target == 'z') target = 'a';
                else target++;

                if (!skip.contains(Character.toString(target))) shift--;
            }

            answer += Character.toString(target);
        }

        return answer;
    }
}
