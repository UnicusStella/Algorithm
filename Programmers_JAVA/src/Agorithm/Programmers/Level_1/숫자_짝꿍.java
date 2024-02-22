package Agorithm.Programmers.Level_1;

public class 숫자_짝꿍 {
    public static void main(String[] args) {

        숫자_짝꿍 stella = new 숫자_짝꿍();

        String X1 = "100";
        String Y1 = "2345";

        String X2 = "100";
        String Y2 = "203045";

        String X3 = "100";
        String Y3 = "123450";

        String X4 = "12321";
        String Y4 = "42531";

        String X5 = "5525";
        String Y5 = "1255";

        System.out.println("Answer = " + stella.solution(X1, Y1));
        System.out.println("Answer = " + stella.solution(X2, Y2));
        System.out.println("Answer = " + stella.solution(X3, Y3));
        System.out.println("Answer = " + stella.solution(X4, Y4));
        System.out.println("Answer = " + stella.solution(X5, Y5));
    }

    /*
        X	    Y	        result
        "100"	"2345"	    "-1"
        "100"	"203045"	"0"
        "100"	"123450"	"10"
        "12321"	"42531"	    "321"
        "5525"	"1255"	    "552"
     */
    public String solution(String X, String Y) {

        String answer = "";
        String[] xSplit = X.split("");
        String[] ySplit = Y.split("");

        int[] xCount = new int[10];
        int[] yCount = new int[10];

        for (String target : xSplit) {
            xCount[Integer.parseInt(target)]++;
        }
        for (String target : ySplit) {
            yCount[Integer.parseInt(target)]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            int min = Math.min(xCount[i], yCount[i]);
            for (int j = 0; j < min; j++) {
                sb.append(i);
            }
        }

        answer = sb.reverse().toString();

        if (answer.equals("")) return "-1";
        if (answer.replace("0", "").equals("")) return "0";

        return answer;
    }
}
