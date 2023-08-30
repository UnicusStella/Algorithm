import Agorithm.Programmers.Level_1.모스부호_1;

public class Main {
    public static void main(String[] args) {

        모스부호_1 stella = new 모스부호_1();

        String letter1 = ".... . .-.. .-.. ---";
        String letter2 = ".--. -.-- - .... --- -.";

        System.out.println("Answer1 = " + stella.solution(letter1));
        System.out.println("Answer2 = " + stella.solution(letter2));
    }
}
/*
        letter	result
        ".... . .-.. .-.. ---"	"hello"
        ".--. -.-- - .... --- -."	"python"
 */