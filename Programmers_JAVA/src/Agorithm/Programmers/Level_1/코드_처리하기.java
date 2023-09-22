package Agorithm.Programmers.Level_1;

public class 코드_처리하기 {
    public static void main(String[] args) {

        코드_처리하기 stella = new 코드_처리하기();

        String code1 = "abc1abc1abc";

        System.out.println("Answer1 = " + stella.solution(code1));
    }

    /*
        code	            result
        "abc1abc1abc"	    "acbac"
     */
    public String solution(String code) {
        String answer = "";
        String[] strs = code.split("");
        int mode = 0;


        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals("1")) {
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if (i % 2 == mode) {
                answer += strs[i];
            }
        }
        return answer.length() == 0 ? "EMPTY" : answer;
    }
}
