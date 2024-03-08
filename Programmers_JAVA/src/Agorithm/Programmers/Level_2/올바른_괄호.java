package Agorithm.Programmers.Level_2;

public class 올바른_괄호 {
    public static void main(String[] args) {

        올바른_괄호 stella = new 올바른_괄호();

        String s1 = "()()";

        String s2 = "(())()";

        String s3 = ")()(";

        String s4 = "(()(";

        String s5 = "())((()))(()";

        System.out.println("Answer = " + stella.solution(s1));
        System.out.println("Answer = " + stella.solution(s2));
        System.out.println("Answer = " + stella.solution(s3));
        System.out.println("Answer = " + stella.solution(s4));
        System.out.println("Answer = " + stella.solution(s5));
    }

    /*
        s	            answer
        "()()"	        true
        "(())()"	    true
        ")()("	        false
        "(()("	        false
        "())((()))(()"  false
     */
    boolean solution(String s) {

        int left = 0;
        int right = 0;

        for (char target : s.toCharArray()) {
            if (left < right) return false;
            if (target == ('(')) left++;
            else if (target == (')')) right++;
        }

        return left == right ? true : false;
    }
}
