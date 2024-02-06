package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class 완주하지_못한_선수 {
    public static void main(String[] args) {

        완주하지_못한_선수 stella = new 완주하지_못한_선수();

        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"kiki", "eden"};

        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"marina", "josipa", "nikola", "filipa"};

        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "mislav", "ana"};

        System.out.println("Answer = " + stella.solution(participant1, completion1));
        System.out.println("Answer = " + stella.solution(participant2, completion2));
        System.out.println("Answer = " + stella.solution(participant3, completion3));
    }

    /*
        participant	                                       completion	                                return
        ["leo", "kiki", "eden"]	                            ["eden", "kiki"]	                        "leo"
        ["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
        ["mislav", "stanko", "mislav", "ana"]	            ["stanko", "ana", "mislav"]	                "mislav"
     */
    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        return map.keySet()
                .stream()
                .filter(s -> map.get(s) == 1)
                .collect(Collectors.joining());
    }

    public String solution2(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;
        for (; i < completion.length; i++) {
            if (participant[i] != completion[i]) break;
        }

        return participant[i];
    }
}
