package Agorithm.Programmers.Level_1;

public class 문자열_여러_번_뒤집기 {
    public static void main(String[] args) {

        문자열_여러_번_뒤집기 stella = new 문자열_여러_번_뒤집기();

        String my_string1 = "rermgorpsam";
        int[][] queries1 = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};

        System.out.println("Answer = " + stella.solution(my_string1, queries1));

    }

    /*
        my_string	    queries	                            result
        "rermgorpsam"	[[2, 3], [0, 7], [5, 9], [6, 10]]	"programmers"
     */
    public String solution(String my_string, int[][] queries) {

        StringBuilder sb = new StringBuilder();

        String head = "";
        String tail = "";
        String middle = "";

        for (int[] query : queries) {
            sb.setLength(0);
            head = my_string.substring(0, query[0]);
            middle = sb.append(my_string.substring(query[0], query[1] + 1)).reverse().toString();
            tail = my_string.substring(query[1] + 1);

            my_string = head + middle + tail;
        }

        return my_string;
    }
}
