package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.HashMap;

public class 추억_점수 {
    public static void main(String[] args) {

        추억_점수 stella = new 추억_점수();

        String[] name1 = {"may", "kein", "kain", "radi"};
        int[] yearning1 = {5, 10, 1, 3};
        String[][] photo1 = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        String[] name2 = {"kali", "mari", "don"};
        int[] yearning2 = {11, 1, 55};
        String[][] photo2 = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};

        String[] name3 = {"may", "kein", "kain", "radi"};
        int[] yearning3 = {5, 10, 1, 3};
        String[][] photo3 = {{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}};

        System.out.println("Answer = " + Arrays.toString(stella.solution(name1, yearning1, photo1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(name2, yearning2, photo2)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(name3, yearning3, photo3)));
    }

    /*
        name	                            yearning
        ["may", "kein", "kain", "radi"]	    [5, 10, 1, 3]
        ["kali", "mari", "don"]	            [11, 1, 55]
        ["may", "kein", "kain", "radi"]	    [5, 10, 1, 3]
        photo	                                                                                            result
        [["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]]	[19, 15, 6]
        [["kali", "mari", "don"], ["pony", "tom", "teddy"], ["con", "mona", "don"]]	                        [67, 0, 55]
        [["may"],["kein", "deny", "may"], ["kon", "coni"]]	                                                [5, 15, 0]
     */
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        return Arrays.stream(photo).mapToInt(strings -> Arrays.stream(strings)
                        .mapToInt(s -> map.getOrDefault(s, 0))
                        .sum())
                .toArray();
    }
}
