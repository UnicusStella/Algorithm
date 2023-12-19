package Agorithm.Programmers.Level_1;

public class 문자열안에_문자열 {
    public static void main(String[] args) {

        문자열안에_문자열 stella = new 문자열안에_문자열();

        String str1_1 = "ab6CDE443fgh22iJKlmn1o";
        String str2_1 = "6CD";

        String str1_2 = "ppprrrogrammers";
        String str2_2 = "pppp";

        String str1_3 = "AbcAbcA";
        String str2_3 = "AAA";

        System.out.println("Answer = " + stella.solution(str1_1,str2_1));
        System.out.println("Answer = " + stella.solution(str1_2,str2_2));
        System.out.println("Answer = " + stella.solution(str1_3,str2_3));
    }

    /*
        str1	                    str2	    result
        "ab6CDE443fgh22iJKlmn1o"	"6CD"	    1
        "ppprrrogrammers"	        "pppp"	    2
        "AbcAbcA"	                "AAA"	    2
     */
    public int solution(String str1, String str2) {
        int answer = 0;
        return str1.indexOf(str2) == -1 ? 2 : 1;
    }
}
