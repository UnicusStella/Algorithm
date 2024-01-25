package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 왼쪽_오른쪽 {
    public static void main(String[] args) {

        왼쪽_오른쪽 stella = new 왼쪽_오른쪽();

        String[] str_list1 = {"u", "u", "l", "r"};

        String[] str_list2 = {"l"};

        System.out.println("Answer = " + Arrays.toString(stella.solution(str_list1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(str_list2)));
    }

    /*
        str_list	            result
        ["u", "u", "l", "r"]	["u", "u"]
        ["l"]	                []
     */
    public String[] solution(String[] str_list) {
        String[] answer = {};

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }

        return answer;
    }
}
