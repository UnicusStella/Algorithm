package Agorithm.Programmers.Level_1;

public class 편지 {
    public static void main(String[] args) {

        편지 stella = new 편지();

        String message1 = "happy birthday!";

        String message2 = "I love you~";

        System.out.println("Answer1 = " + stella.solution(message1));
        System.out.println("Answer2 = " + stella.solution(message2));
    }

    /*
        message	            result
        "happy birthday!"	30
        "I love you~"	    22
     */
    public int solution(String message) {
        int answer = 0;
        return message.split("").length * 2;
    }
}
