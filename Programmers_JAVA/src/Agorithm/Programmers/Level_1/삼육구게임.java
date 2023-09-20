package Agorithm.Programmers.Level_1;

public class 삼육구게임 {
    public static void main(String[] args) {

        삼육구게임 stella = new 삼육구게임();

        int order1 = 3;

        int order2 = 29423;

        System.out.println("Answer1 = " + stella.solution(order1));
        System.out.println("Answer2 = " + stella.solution(order2));
    }

    /*
        order   	result
        3	        1
        29423	    2
     */
    public int solution(int order) {
        int answer = 0;
        String str = order + "";

        return str.length() - str.replaceAll("[369]", "").length();
    }
}
