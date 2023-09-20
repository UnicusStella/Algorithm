package Agorithm.Programmers.Level_1;

public class 암호_해독 {
    public static void main(String[] args) {

        암호_해독 stella = new 암호_해독();

        String cipher1 = "dfjardstddetckdaccccdegk";
        int code1 = 4;

        String cipher2 = "pfqallllabwaoclk";
        int code2 = 2;

        System.out.println("Answer1 = " + stella.solution(cipher1, code1));
        System.out.println("Answer2 = " + stella.solution(cipher2, code2));
    }

    /*
        cipher	                        code    result
        "dfjardstddetckdaccccdegk"  	4	    "attack"
        "pfqallllabwaoclk"	            2	    "fallback"
     */
    public String solution(String cipher, int code) {
        String answer = "";
        String[] strlist = cipher.split("");

        for (int i = code; i <= cipher.length(); i += code) {
            answer += strlist[i - 1];
        }
        return answer;
    }
}
