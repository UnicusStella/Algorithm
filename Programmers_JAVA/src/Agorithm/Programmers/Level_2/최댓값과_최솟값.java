package Agorithm.Programmers.Level_2;

public class 최댓값과_최솟값 {
    public static void main(String[] args) {

        최댓값과_최솟값 stella = new 최댓값과_최솟값();

        String s1 = "1 2 3 4";

        String s2 = "-1 -2 -3 -4";

        String s3 = "-1 -1";

        System.out.println("Answer = " + stella.solution(s1));
        System.out.println("Answer = " + stella.solution(s2));
        System.out.println("Answer = " + stella.solution(s3));
    }

    /*
        s	            return
        "1 2 3 4"	    "1 4"
        "-1 -2 -3 -4"	"-4 -1"
        "-1 -1"	        "-1 -1"
     */
    public String solution(String s) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String str : s.split(" ")) {
            int num = Integer.parseInt(str);
            if (min > num) min = num;
            if (max < num) max = num;
        }

        return min + " " + max;
    }
}