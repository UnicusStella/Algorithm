package Agorithm.Programmers.Level_2;

import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;

public class 괄호_회전하기 {
    public static void main(String[] args) {

        괄호_회전하기 stella = new 괄호_회전하기();

        String s1 = "[](){}";

        String s2 = "}]()[{";

        String s3 = "[)(]";

        String s4 = "}}}";

        String s5 = "(}";

        System.out.println("Answer = " + stella.solution(s1));
        System.out.println("Answer = " + stella.solution(s2));
        System.out.println("Answer = " + stella.solution(s3));
        System.out.println("Answer = " + stella.solution(s4));
        System.out.println("Answer = " + stella.solution(s5));
    }

    /*
        s	        result
        "[](){}"	3
        "}]()[{"	2
        "[)(]"	    0
        "}}}"	    0
     */
    public int solution(String s) {

        int answer = 0;
        boolean isCheck;

        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        if (s.length() % 2 != 0) return 0;

        for (int i = 0; i < s.length(); i++) {
            String initStr = String.valueOf(s.charAt(0));
            isCheck = true;

            if (s.startsWith(")") || s.startsWith("}") || s.startsWith("]")) {
                s = s.substring(1) + initStr;
                continue;
            }

            for (char target : s.toCharArray()) {
                if (target == '(' || target == '{' || target == '[') stack.add(target);
                else if (!stack.isEmpty() && map.get(stack.peek()) == target)
                    stack.pop();
                else {
                    s = s.substring(1) + initStr;
                    isCheck = false;
                    break;
                }
            }

            if (isCheck) {
                answer++;
                s = s.substring(1) + initStr;
            }
            stack.clear();
        }

        return answer;
    }
}