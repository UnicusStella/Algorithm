package Agorithm.Programmers.Level_1;

public class 치킨_쿠폰 {
    public static void main(String[] args) {

        치킨_쿠폰 stella = new 치킨_쿠폰();

        int chicken1 = 100;

        int chicken2 = 1_081;

        System.out.println("Answer = " + stella.solution(chicken1));
        System.out.println("Answer = " + stella.solution(chicken2));
    }

    /*
        chicken	    result
        100	        11
        1,081	    120
     */
    public int solution(int chicken) {
        int answer = 0;

        while (chicken >= 10) {
            answer += chicken / 10;

            chicken = chicken / 10 + chicken % 10;
        }

        return answer;
    }
}