package Agorithm.Programmers.Level_2;

import java.util.Stack;

public class 짝지어_제거하기 {
    public static void main(String[] args) {

        짝지어_제거하기 stella = new 짝지어_제거하기();

        String s1 = "baabaa";
        String s2 = "cdcd";
        String s3 = "effffef";

        System.out.println("Answer = " + stella.solution(s1));
        System.out.println("Answer = " + stella.solution(s2));
        System.out.println("Answer = " + stella.solution(s3));
    }

    /*
        s	        result
        baabaa	    1
        cdcd	    0
     */
    public int solution(String s) {

        Stack<String> stack = new Stack<>();
        String[] strs = s.split("");

        for (int i = 0; i < strs.length; i++)
            if (!stack.isEmpty() && stack.peek().equals(strs[i]))
                stack.pop();
            else
                stack.push(strs[i]);

        return stack.isEmpty() ? 1 : 0;
    }
}