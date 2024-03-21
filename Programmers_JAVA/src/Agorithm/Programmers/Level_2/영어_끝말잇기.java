package Agorithm.Programmers.Level_2;

import java.util.ArrayList;
import java.util.Arrays;

public class 영어_끝말잇기 {
    public static void main(String[] args) {

        영어_끝말잇기 stella = new 영어_끝말잇기();

        int n1 = 3;
        String[] words1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        int n2 = 5;
        String[] words2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};

        int n3 = 2;
        String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"};

        System.out.println("Answer = " + Arrays.toString(stella.solution(n1, words1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(n2, words2)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(n3, words3)));
    }

    /*
        n	    words
        3	    ["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]
        5	    ["hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"]
        2	    ["hello", "one", "even", "never", "now", "world", "draw"]

        result
        [3,3]
        [0,0]
        [1,3]
     */
    public int[] solution(int n, String[] words) {

        int[] answer = {0, 0};
        String tagWords = "";

        ArrayList<String> onceWordArr = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (onceWordArr.contains(words[i])) return new int[]{i % n + 1, i / n + 1};
            else if (tagWords.isEmpty() || tagWords.charAt(tagWords.length() - 1) == words[i].charAt(0)) {
                tagWords = words[i];
                onceWordArr.add(words[i]);
            } else return new int[]{i % n + 1, i / n + 1};
        }

        return answer;
    }
}