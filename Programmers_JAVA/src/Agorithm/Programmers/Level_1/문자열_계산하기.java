package Agorithm.Programmers.Level_1;

import java.util.ArrayList;
import java.util.Arrays;

public class 문자열_계산하기 {
    public static void main(String[] args) {

        문자열_계산하기 stella = new 문자열_계산하기();

        String my_string1 = "3 + 4";

        String my_string2 = "1 + 2 3 - 1 4 + 1 0";

        System.out.println("Answer1 = " + stella.solution(my_string1));
        System.out.println("Answer2 = " + stella.solution(my_string2));
    }

    /*
        my_string	result
        "3 + 4"     7
     */

    // "1 + 2 3 - 1 4 + 1 0"
    // 위와 같은식으로 숫자가 연속으로 올 경우도 처리.
    // 프로그래머스 문제가 위와같은 조건식으로 착각함...
    public int solution(String my_string) {
        int answer = my_string.charAt(0) - '0';

        String opperator = "";
        String number = "";
        String[] strArr = my_string.split(" ");

        ArrayList<String> list = new ArrayList<>();


        // input 값 재정렬.
        for (int i = 0; i < strArr.length; i++) {
            // "2 2 2" 와 같은 식으로 연산자가 아닐경우 숫자 합치기.
            if (!(strArr[i].equals("+") || strArr[i].equals("-"))) {
                // 숫자 이어붙이기.
                number += strArr[i];
                // "3 + 2 2" 이와 같을 때 22를 넣어줘야 함.
                if (i == strArr.length - 1) list.add(number);
            } else {
                // 연산자가 들어올 경우 이어붙인 숫자 + 연산자 추가
                list.add(number);
                list.add(strArr[i]);
                // 이어붙이는 변수 초기화;
                number = "";
            }
        }

        for (int i = 0; i < list.size(); i++) {
            // List 를 돌면서 연산자가 나올경우 그 값을 더해주고 연산자는 초기화 시킴.
            if (opperator.equals("+")) {
                answer += Integer.parseInt(list.get(i));
                opperator = "";
                continue;
            } else if (opperator.equals("-")) {
                answer -= Integer.parseInt(list.get(i));
                opperator = "";
                continue;
            }
            // 연산자가 나올시 연산을 해야 하므로 opperator 세팅.
            if (list.get(i).equals("+") || list.get(i).equals("-")) {
                opperator = list.get(i);
            }
        }

        return answer;
    }

    // 올바른 정답 식
    public int solution2(String my_string) {

        return Arrays.stream(my_string.replace("- ", "-")
                        .replaceAll("[+] ", "")
                        .trim()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
