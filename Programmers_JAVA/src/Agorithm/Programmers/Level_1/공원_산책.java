package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 공원_산책 {
    public static void main(String[] args) {

        공원_산책 stella = new 공원_산책();

        String[] park1 = {"SOO", "OOO", "OOO"};
        String[] routes1 = {"E 2", "S 2", "W 1"};

        String[] park2 = {"SOO", "OXX", "OOO"};
        String[] routes2 = {"E 2", "S 2", "W 1"};

        String[] park3 = {"OSO", "OOO", "OXO", "OOO"};
        String[] routes3 = {"E 2", "S 3", "W 1"};

        String[] park4 = {"XXX", "XSX", "XXX"};
        String[] routes4 = {"E 2", "S 3", "W 1"};

        System.out.println("Answer = " + Arrays.toString(stella.solution(park1, routes1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(park2, routes2)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(park3, routes3)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(park4, routes4)));
    }

    /*
        park	                    routes	                result
        ["SOO","OOO","OOO"]	        ["E 2","S 2","W 1"]	    [2,1]
        ["SOO","OXX","OOO"]	        ["E 2","S 2","W 1"]	    [0,1]
        ["OSO","OOO","OXO","OOO"]	["E 2","S 3","W 1"]	    [0,0]
        ["XXX", "XSX", "XXX"]       ["E 2", "S 3", "W 1"]   [1,1]
     */
    public int[] solution(String[] park, String[] routes) {

        int[] start = {};

        for (int i = 0; i < park.length; i++)
            if (park[i].indexOf("S") != -1) {
                start = new int[]{i, park[i].indexOf("S")};
                break;
            }

        for (String route : routes) {
            String op = route.split(" ")[0];
            int move = Integer.parseInt(route.split(" ")[1]);
            int dy = start[0], dx = start[1];

            boolean isDirection = false;

            switch (op) {
                case "E":
                    if (dx + move <= park[dy].length() - 1)
                        if (!(park[dy].substring(dx, dx + move + 1).contains("X")))
                            start[1] += move;
                    break;

                case "W":
                    if (dx - move >= 0)
                        if (!(park[dy].substring(dx - move, dx + 1).contains("X")))
                            start[1] -= move;
                    break;

                case "S":
                    if (dy + move <= park.length - 1) {
                        for (int i = dy; i <= dy + move; i++)
                            if (park[i].charAt(dx) == 'X')
                                isDirection = true;

                        if (!isDirection) start[0] += move;
                    }
                    break;

                case "N":
                    if (dy - move >= 0) {
                        for (int i = dy; i >= dy - move; i--)
                            if (park[i].charAt(dx) == 'X')
                                isDirection = true;

                        if (!isDirection) start[0] -= move;
                    }
                    break;
            }
        }

        return start;
    }
}