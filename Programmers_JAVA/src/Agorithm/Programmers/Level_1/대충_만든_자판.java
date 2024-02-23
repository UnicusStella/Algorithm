package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 대충_만든_자판 {
    public static void main(String[] args) {

        대충_만든_자판 stella = new 대충_만든_자판();

        String[] keymap1 = {"ABACD", "BCEFD"};
        String[] targets1 = {"ABCD", "AABB"};

        String[] keymap2 = {"AA"};
        String[] targets2 = {"B"};

        String[] keymap3 = {"AGZ", "BSSS"};
        String[] targets3 = {"ASA", "BGZ"};

        System.out.println("Answer = " + Arrays.toString(stella.solution(keymap1, targets1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(keymap2, targets2)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(keymap3, targets3)));
    }

    /*
        keymap	            targets	            result
        ["ABACD", "BCEFD"]	["ABCD","AABB"]	    [9, 4]
        ["AA"]	            ["B"]	            [-1]
        ["AGZ", "BSSS"]	    ["ASA","BGZ"]	    [4, 6]
     */
    public int[] solution(String[] keymap, String[] targets) {

        int[] answer = new int[targets.length];
        int[] keyNumber = new int[26];

        for (String key : keymap)
            for (int i = 0; i < key.length(); i++) {
                int target = key.charAt(i) - 'A';
                if (keyNumber[target] == 0) keyNumber[target] = i + 1;
                else if (keyNumber[target] != 0 && keyNumber[target] > i + 1) keyNumber[target] = i + 1;
            }

        for (int i = 0; i < targets.length; i++)
            for (char target : targets[i].toCharArray()) {
                if (keyNumber[target - 'A'] == 0) {
                    answer[i] = -1;
                    break;
                }
                answer[i] += keyNumber[target - 'A'];
            }

        return answer;
    }
}
