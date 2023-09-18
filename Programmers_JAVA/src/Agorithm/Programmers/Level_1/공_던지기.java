package Agorithm.Programmers.Level_1;

public class 공_던지기 {
    public static void main(String[] args) {

        공_던지기 stella = new 공_던지기();

        int[] numbers1 = {1, 2, 3, 4};
        int k1 = 2;

        int[] numbers2 = {1, 2, 3, 4, 5, 6};
        int k2 = 5;

        int[] numbers3 = {1, 2, 3};
        int k3 = 3;

        System.out.println("Answer1 = " + stella.solution(numbers1, k1));
        System.out.println("Answer2 = " + stella.solution(numbers2, k2));
        System.out.println("Answer3 = " + stella.solution(numbers3, k3));
    }

    /*
            numbers             	k   result
            [1, 2, 3, 4]       	    2	3
            [1, 2, 3, 4, 5, 6]	    5	3
            [1, 2, 3]	            3	2
     */
    public int solution(int[] numbers, int k) {
        int answer = 0;

        // 반복문 범위는 처음 수를 포함하므로 k - 1 까지
        // 또한, 1칸씩 건너서 이동 한다는 건 원래 한칸씩 이동한 거리의 2배 와 같다.

        return numbers[(k - 1) * 2 % numbers.length];
    }
}
