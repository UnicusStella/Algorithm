package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.Stack;

public class 배열_만들기_6 {
    public static void main(String[] args) {

        배열_만들기_6 stella = new 배열_만들기_6();

        int[] arr1 = {0, 1, 1, 1, 0};

        int[] arr2 = {0, 1, 0, 1, 0};

        int[] arr3 = {0, 1, 1, 0};

        System.out.println("Answer = " + Arrays.toString(stella.solution(arr1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(arr2)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(arr3)));
    }

    /*
        arr	                result
        [0, 1, 1, 1, 0]	    [0, 1, 0]
        [0, 1, 0, 1, 0]	    [0, 1, 0, 1, 0]
        [0, 1, 1, 0]	    [-1]
     */
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            if (stack.isEmpty() || num != stack.peek()) {
                stack.push(num);
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty() ? new int[]{-1} : stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
