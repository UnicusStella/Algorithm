package Agorithm.Programmers.Level_1;

import java.util.HashMap;

public class 수_조작하기_2 {
    public static void main(String[] args) {

        수_조작하기_2 stella = new 수_조작하기_2();

        int[] numLog1 = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};

        System.out.println("Answer = " + stella.solution(numLog1));
    }

    /*
        numLog	                                    result
        [0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1]	"wsdawsdassw"
     */
    public String solution(int[] numLog) {

        String answer = "";

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "w");
        map.put(-1, "s");
        map.put(-10, "a");
        map.put(10, "d");

        for (int i = 0; i < numLog.length - 1; i++) {

            int word = numLog[i + 1] - numLog[i];

            map.get(word);

            answer += map.get(word);
        }

        return answer;
    }
}
