package Agorithm.Programmers.Level_1;

public class 문자열_밀기 {
    public static void main(String[] args) {

        문자열_밀기 stella = new 문자열_밀기();

        String A1 = "hello";
        String B1 = "ohell";

        String A2 = "apple";
        String B2 = "elppa";

        String A3 = "atat";
        String B3 = "tata";

        String A4 = "abc";
        String B4 = "abc";

        System.out.println("Answer = " + stella.solution(A1, B1));
        System.out.println("Answer = " + stella.solution(A2, B2));
        System.out.println("Answer = " + stella.solution(A3, B3));
        System.out.println("Answer = " + stella.solution(A4, B4));
    }

    /*
        A	        B	        result
        "hello"	    "ohell"	    1
        "apple"	    "elppa"	    -1
        "atat"	    "tata"	    1
        "abc"	    "abc"	    0
     */
    public int solution(String A, String B) {
        int answer = -1;

        StringBuilder sb = new StringBuilder(A);

        if (A.equals(B)) return 0;

        for (int i = 0; i < A.length(); i++) {
            String lastWord = sb.substring(sb.length() - 1);
            sb.insert(0, lastWord);
            sb.deleteCharAt(sb.length() - 1);

            if (sb.toString().equals(B)) {
                return i + 1;
            }
        }

        return answer;
    }

    public int solution2(String A, String B) {

        // 발상의 전환의 답...
        return B.repeat(2).indexOf(A);
    }
}