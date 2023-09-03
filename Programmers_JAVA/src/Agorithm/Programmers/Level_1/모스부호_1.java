package Agorithm.Programmers.Level_1;

import java.util.HashMap;
import java.util.Map;

public class 모스부호_1 {
    public String solution(String letter) {
        String answer = "";
        String[] morse = new String[]{
                ".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.."
        };

        Map<String, String> map = new HashMap<>();

        // [] morse 순서대로 a~z 까지 해당 모스부호르 Key 값으로 삽입
        for (int i = 0; i < morse.length; i++) {
            map.put(morse[i], String.valueOf((char) (i + 97)));
        }

        // letter 의 공백을 기준으로 split
        String[] letters = letter.split(" ");

        // map 에서 letter 의 morse 부호에 맞는 Value 출력
        for (int i = 0; i < letters.length; i++) {
            answer += map.get(letters[i]);
        }

        return answer;
    }
}
