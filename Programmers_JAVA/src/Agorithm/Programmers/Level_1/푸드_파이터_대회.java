package Agorithm.Programmers.Level_1;

public class 푸드_파이터_대회 {
    public static void main(String[] args) {

        푸드_파이터_대회 stella = new 푸드_파이터_대회();

        int[] food1 = {1, 3, 4, 6};

        int[] food2 = {1, 7, 1, 2};

        System.out.println("Answer = " + stella.solution(food1));
        System.out.println("Answer = " + stella.solution(food2));
    }

    /*
        food	        result
        [1, 3, 4, 6]	"1223330333221"
        [1, 7, 1, 2]	"111303111"
     */
    public String solution(int[] food) {

        String answer = "";

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            sb.append(String.valueOf(i).repeat(food[i] / 2));
        }

        answer = sb + "0";

        return answer + sb.reverse();
    }
}
