package Agorithm.Programmers.Level_1;

public class 조건_문자열 {
    public static void main(String[] args) {

        조건_문자열 stella = new 조건_문자열();

        String ineq1 = "<";
        String eq1 = "=";
        int n1 = 20;
        int m1 = 50;

        String ineq2 = ">";
        String eq2 = "!";
        int n2 = 41;
        int m2 = 78;


        System.out.println("Answer1 = " + stella.solution(ineq1, eq1, n1, m1));
        System.out.println("Answer2 = " + stella.solution(ineq2, eq2, n2, m2));
    }

    /*
        ineq	eq	  n	    m	  result
        "<"	    "="	  20	50	  1
        ">"	    "!"	  41	78	  0
     */
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        switch (ineq) {
            case "<":
                switch (eq) {
                    case "=":
                        return n <= m == true ? 1 : 0;

                    case "!":
                        return n < m == true ? 1 : 0;
                }
            case ">":
                switch (eq) {
                    case "=":
                        return n >= m == true ? 1 : 0;

                    case "!":
                        return n > m == true ? 1 : 0;
                }
        }

        return answer;
    }
}
