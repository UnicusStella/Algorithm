package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.HashMap;

public class 달리기_경주 {
    public static void main(String[] args) {

        달리기_경주 stella = new 달리기_경주();

        String[] players1 = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings1 = {"kai", "kai", "mine", "mine"};

        System.out.println("Answer = " + Arrays.toString(stella.solution(players1, callings1)));
    }

    /*
        players	                                callings	                    result
        ["mumu", "soe", "poe", "kai", "mine"]	["kai", "kai", "mine", "mine"]	["mumu", "kai", "mine", "soe", "poe"]
     */
    public String[] solution(String[] players, String[] callings) {

        HashMap<String, Integer> callingsList = new HashMap<>();

        for (int i = 0; i < players.length; i++)
            callingsList.put(players[i], i);

        for (String calling : callings)
            swapRanking(players, callingsList, calling);

        return players;
    }

    private void swapRanking(String[] players, HashMap<String, Integer> callingsList, String calling) {

        int ranking = callingsList.get(calling);

        if (ranking != 0) {
            String overtakenPlayer = players[ranking - 1];
            players[ranking - 1] = calling;
            players[ranking] = overtakenPlayer;

            callingsList.put(players[ranking - 1], ranking - 1);
            callingsList.put(players[ranking], ranking);
        }
    }
}
