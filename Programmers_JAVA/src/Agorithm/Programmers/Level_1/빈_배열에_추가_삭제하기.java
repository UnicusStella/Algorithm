package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.Stack;

public class 빈_배열에_추가_삭제하기 {
    public static void main(String[] args) {

        빈_배열에_추가_삭제하기 stella = new 빈_배열에_추가_삭제하기();

        int[] arr1 = {3, 2, 4, 1, 3};

        boolean[] flag1 = {true, false, true, false, false};

        System.out.println("Answer = " + Arrays.toString(stella.solution(arr1, flag1)));
    }

    /*
        arr	                flag	                            result
        [3, 2, 4, 1, 3]	    [true, false, true, false, false]	[3, 3, 3, 3, 4, 4, 4, 4]
     */
    public int[] solution(int[] arr, boolean[] flag) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) stack.push(arr[i]);
            } else {
                for (int j = 0; j < arr[i]; j++) stack.pop();
            }
        }

        return stack.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
