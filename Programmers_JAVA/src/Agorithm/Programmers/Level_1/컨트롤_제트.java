package Agorithm.Programmers.Level_1;

import java.util.Stack;

public class 컨트롤_제트 {
    public static void main(String[] args) {

        컨트롤_제트 stella = new 컨트롤_제트();

        String s1 = "1 2 Z 3";

        String s2 = "10 20 30 40";

        String s3 = "10 Z 20 Z 1";

        String s4 = "10 Z 20 Z";

        String s5 = "-1 -2 -3 Z";

        System.out.println("Answer1 = " + stella.solution(s1));
        System.out.println("Answer2 = " + stella.solution(s2));
        System.out.println("Answer3 = " + stella.solution(s3));
        System.out.println("Answer5 = " + stella.solution(s4));
        System.out.println("Answer4 = " + stella.solution(s5));
    }

    /*
        s	            result
        "1 2 Z 3"   	4
        "10 20 30 40"	100
        "10 Z 20 Z 1"	1
        "10 Z 20 Z"	    0
        "-1 -2 -3 Z"	-3
    */
    public int solution(String s) {
        int answer = 0;

        Stack<String> stack = new Stack<>();

        for (String target : s.split(" ")) {
            if (target.equals("Z")) {
                stack.pop();
            } else {
                stack.push(target);
            }

        }

        return stack.stream()
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
