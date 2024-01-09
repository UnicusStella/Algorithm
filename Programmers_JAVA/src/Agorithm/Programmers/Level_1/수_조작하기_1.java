package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.HashMap;

public class 수_조작하기_1 {
    public static void main(String[] args) {

        수_조작하기_1 stella = new 수_조작하기_1();

        int n1 = 0;
        String control1 = "wsdawsdassw";

        System.out.println("Answer = " + stella.solution(n1, control1));
    }

    /*
        n	control	        result
        0	"wsdawsdassw"	-1
     */
    public int solution(int n, String control) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("w", 1);
        map.put("s", -1);
        map.put("a", -10);
        map.put("d", 10);

        return n + Arrays.stream(control.split(""))
                .mapToInt(s -> map.get(s))
                .sum();
    }

    public int solution2(int n, String control) {

        return control.chars().reduce(n, (acc, c) -> acc + (c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10 : -10));
    }
}
