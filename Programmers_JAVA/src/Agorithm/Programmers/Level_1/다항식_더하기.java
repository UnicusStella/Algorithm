package Agorithm.Programmers.Level_1;

public class 다항식_더하기 {
    public static void main(String[] args) {

        다항식_더하기 stella = new 다항식_더하기();

        String polynomial1 = "3x + 7 + x";

        String polynomial2 = "x + x + x";

        System.out.println("Answer = " + stella.solution(polynomial1));
        System.out.println("Answer = " + stella.solution(polynomial2));
    }

    /*
        polynomial	    result
        "3x + 7 + x"	"4x + 7"
        "x + x + x"	    "3x"
     */
    public String solution(String polynomial) {

        StringBuilder answer = new StringBuilder();

        int xCount = 0;
        int count = 0;

        String[] split = polynomial.split(" ");

        for (String num : split) {
            // num 에 x 가 포함 여부 체크
            if (num.indexOf("x") != -1) {
                // num = "x" 일 경우 +1
                if (num.indexOf("x") == 0) {
                    xCount++;
                    // num = "숫자x" 일 경우 숫자만큼 xCount 증가
                } else {
                    xCount += Integer.parseInt(num.replace("x", ""));
                }
                // 숫자가 들어올 경우 count
            } else if (!num.equals("+")) {
                count += Integer.parseInt(num);
            }

        }

        // 1x = x
        if (xCount > 1) {
            answer.append(xCount).append("x");
        } else if (xCount == 1) {
            answer.append("x");
        }

        // count 가 0 일 경우에는 숫자 안붙이기
        if (xCount == 0 && count > 0) {
            answer.append(count);
        } else if (count > 0) {
            answer.append(" + ").append(count);
        }

        return answer.toString();
    }
}
