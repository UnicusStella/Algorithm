package Agorithm.Programmers.Level_1;

import java.util.ArrayList;
import java.util.Arrays;

public class 카드_뭉치 {
    public static void main(String[] args) {

        카드_뭉치 stella = new 카드_뭉치();

        String[] cards1_1 = {"i", "drink", "water"};
        String[] cards1_2 = {"want", "to"};
        String[] goal1 = {"i", "want", "to", "drink", "water"};

        String[] cards2_1 = {"i", "water", "drink"};
        String[] cards2_2 = {"want", "to"};
        String[] goal2 = {"i", "want", "to", "drink", "water"};

        System.out.println("Answer = " + stella.solution(cards1_1, cards1_2, goal1));
        System.out.println("Answer = " + stella.solution(cards2_1, cards2_2, goal2));
    }

    /*
        cards1	                    cards2	        goal	                                result
        ["i", "drink", "water"]	    ["want", "to"]	["i", "want", "to", "drink", "water"]	"Yes"
        ["i", "water", "drink"]	    ["want", "to"]	["i", "want", "to", "drink", "water"]	"No"
     */
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        String[] answer = new String[goal.length];

        ArrayList<String> listCard1 = new ArrayList<>(Arrays.asList(cards1));
        ArrayList<String> listCard2 = new ArrayList<>(Arrays.asList(cards2));

        for (int i = 0; i < goal.length; i++) {
            if (!listCard1.isEmpty() && listCard1.get(0).equals(goal[i])) {
                answer[i] = goal[i];
                listCard1.remove(0);
            } else if (!listCard2.isEmpty() && listCard2.get(0).equals(goal[i])) {
                answer[i] = goal[i];
                listCard2.remove(0);
            } else {
                return "No";
            }
        }

        return Arrays.equals(answer, goal) ? "Yes" : "No";
    }
}
