package Agorithm.Programmers.Level_1;

public class 키패드_누르기 {

    private static int[][] KEYPAD = {
            {3, 1}, {0, 0}, {0, 1}, {0, 2},
            {1, 0}, {1, 1}, {1, 2},
            {2, 0}, {2, 1}, {2, 2}
    };
    private static int[] LEFT = {3, 0};
    private static int[] RIGHT = {3, 2};
    private static String HAND = "left";

    public static void main(String[] args) {

        키패드_누르기 stella = new 키패드_누르기();

        int[] numbers1 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand1 = "right";

        int[] numbers2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand2 = "left";

        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand3 = "right";

        System.out.println("Answer = " + stella.solution(numbers1, hand1));
        System.out.println("Answer = " + stella.solution(numbers2, hand2));
        System.out.println("Answer = " + stella.solution(numbers3, hand3));
    }

    /*
        numbers	                            hand	    result
        [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"	    "LRLLLRLLRRL"
        [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]	"left"	    "LRLLRRLLLRR"
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]	    "right"	    "LLRLLRLLRL"
     */
    public String solution(int[] numbers, String hand) {

        StringBuilder sb = new StringBuilder();

        HAND = hand.equals("left") ? "left" : "right";

        for (int number : numbers) {
            String touchHand = getTouchHand(number);

            if (touchHand.equals("L"))
                LEFT = KEYPAD[number];
            else
                RIGHT = KEYPAD[number];

            sb.append(touchHand);
        }

        return sb.toString();
    }

    private String getTouchHand(int number) {

        if (number == 1 || number == 4 || number == 7) return "L";
        if (number == 3 || number == 6 || number == 9) return "R";

        return getDistance(number);
    }

    private String getDistance(int number) {

        int[] keyInfo = KEYPAD[number];

        int left_Distance = Math.abs(keyInfo[0] - LEFT[0]) + Math.abs(keyInfo[1] - LEFT[1]);
        int right_Distance = Math.abs(keyInfo[0] - RIGHT[0]) + Math.abs(keyInfo[1] - RIGHT[1]);

        if (left_Distance == right_Distance)
            if (HAND.equals("left")) return "L";
            else return "R";

        else if (left_Distance > right_Distance) return "R";
        else return "L";
    }
}
