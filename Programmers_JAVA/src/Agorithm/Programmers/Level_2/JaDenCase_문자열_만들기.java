package Agorithm.Programmers.Level_2;

public class JaDenCase_문자열_만들기 {
    public static void main(String[] args) {

        JaDenCase_문자열_만들기 stella = new JaDenCase_문자열_만들기();

        String s1 = "3people unFollowed me";

        String s2 = "for the last week";

        String s3 = "  for the what 1what  ";

        System.out.println("Answer = " + stella.solution(s1));
        System.out.println("Answer = " + stella.solution(s2));
        System.out.println("Answer = " + stella.solution(s3));
    }

    /*
        s	                        return
        "3people unFollowed me"	    "3people Unfollowed Me"
        "for the last week"	        "For The Last Week"
        "  for the what 1what  "    "  For The What 1what  "
     */
    public String solution(String s) {

        boolean isBlank = true;
        StringBuilder sb = new StringBuilder();

        for (String str : s.toLowerCase().split("")) {
            sb.append(isBlank == true ? str.toUpperCase() : str);
            isBlank = str.isBlank();
        }

        return sb.toString();
    }
}