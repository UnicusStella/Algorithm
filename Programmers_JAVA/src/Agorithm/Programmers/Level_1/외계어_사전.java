package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 외계어_사전 {
    public static void main(String[] args) {

        외계어_사전 stella = new 외계어_사전();

        String[] spell1 = {"p", "o", "s"};
        String[] dic1 = {"sod", "eocd", "qixm", "adio", "soo"};

        String[] spell2 = {"z", "d", "x"};
        String[] dic2 = {"def", "dww", "dzx", "loveaw"};

        String[] spell3 = {"s", "o", "m", "d"};
        String[] dic3 = {"moos", "dzx", "smm", "sunmmo", "som"};

        System.out.println("Answer = " + stella.solution(spell1, dic1));
        System.out.println("Answer = " + stella.solution(spell2, dic2));
        System.out.println("Answer = " + stella.solution(spell3, dic3));
    }

    /*
        spell	                dic	                                        result
        ["p", "o", "s"]	        ["sod", "eocd", "qixm", "adio", "soo"]	    2
        ["z", "d", "x"]	        ["def", "dww", "dzx", "loveaw"]	            1
        ["s", "o", "m", "d"]	["moos", "dzx", "smm", "sunmmo", "som"]	    2
     */
    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        Arrays.sort(spell);

        // dic 정렬, 중복 삭제, replace()
        String word = "";
        for (String str : spell) {
            word += str;
        }


        String[] array = Arrays.stream(dic).map(string -> Arrays.stream(string.split(""))
                        .distinct()
                        .sorted()
                        .collect(Collectors.joining()))
                .toArray(String[]::new);

        for (String str : array) {
            if (str.indexOf(word) != -1) {
                return 1;
            }
        }

        return answer;
    }
}
