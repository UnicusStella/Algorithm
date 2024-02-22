package Agorithm.Programmers.Level_1;

public class 문자열_나누기 {
    public static void main(String[] args) {

        문자열_나누기 stella = new 문자열_나누기();

        String s1 = "banana";

        String s2 = "abracadabra";

        String s3 = "aaabbaccccabba";

        System.out.println("Answer = " + stella.solution(s1));
        System.out.println("Answer = " + stella.solution(s2));
        System.out.println("Answer = " + stella.solution(s3));
    }

    /*
        s	                result
        "banana"	        3
        "abracadabra"	    6
        "aaabbaccccabba"	3
     */
    public int solution(String s) {

        int answer = 0;
        int targetCount = 0;
        int nonTargetCount = 0;
        char compare = ' ';

        for (char target : s.toCharArray()) {
            if (targetCount == 0) {
                compare = target;
                targetCount++;
            } else if (compare == target) targetCount++;
            else nonTargetCount++;

            if (targetCount == nonTargetCount) {
                answer++;
                targetCount = 0;
                nonTargetCount = 0;
            }
        }

        return targetCount != 0 ? answer + 1 : answer;
    }
}
