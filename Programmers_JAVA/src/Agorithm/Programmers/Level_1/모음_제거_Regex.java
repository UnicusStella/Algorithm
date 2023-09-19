package Agorithm.Programmers.Level_1;

public class 모음_제거_Regex {
    public static void main(String[] args) {

        모음_제거_Regex stella = new 모음_제거_Regex();

        String my_string1 = "bus";

        String my_string2 = "nice to meet you";

        System.out.println("Answer1 = " + stella.solution(my_string1));
        System.out.println("Answer2 = " + stella.solution(my_string2));
    }

    /*
        my_string	        result
        "bus"           	"bs"
        "nice to meet you"	"nc t mt y"
    */
    public String solution(String my_string) {
        String answer = "";

        return my_string.replaceAll("[aeiou]","");
    }
}
