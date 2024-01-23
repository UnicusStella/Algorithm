package Agorithm.Programmers.Level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 배열_만들기_4 {
    public static void main(String[] args) {

        배열_만들기_4 stella = new 배열_만들기_4();

        int[] arr1 = {1, 4, 2, 5, 3};

        int[] arr2 = {5, 3, 4, 1, 2};

        System.out.println("Answer = " + Arrays.toString(stella.solution(arr1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(arr2)));

    }

    /*
        arr	                result
        [1, 4, 2, 5, 3]	    [1, 2, 3]
     */
    public int[] solution(int[] arr) {

        ArrayList<Integer> stk = new ArrayList<>();

        // 1. arr.length 만큼 반복을 돈다.

        // 2. stk 가 빈 배열 조건 및 arr[i] > stk.get(stk.size() - 1) 시 i + 1 추가한다.
        // 2-1. stk 가 빈 배열 일경우 stk.add(arr[count];, count++
        // 2-2. arr[i] > stk.get(stk.size() - 1) 경우 stk.add(arr[count];
        // 2-3. 반복중 arr[i] < stk.get(stk.size() - 1) 경우 stk.remove(stk.size() - 1) 후 빠져 나온다.
        // 2-4. 반복중 카운터 만큼 i 시작;

        // 3. arr[i] <= stk.get(stk.size() - 1) 경우 stk.remove(stk.size() - 1)

        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty() || arr[i] > stk.get(stk.size() - 1)) {
                while (i != arr.length) {
                    if (stk.isEmpty()) {
                        stk.add(arr[i]);
                    } else if (arr[i] > stk.get(stk.size() - 1)) {
                        stk.add(arr[i]);
                    } else {
                        stk.remove(stk.size() - 1);
                        i--;
                        break;
                    }
                    i++;
                }
            } else {
                stk.remove(stk.size() - 1);
                i--;
            }
        }

        return stk.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution2(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        int i = 0;

        while (i < arr.length) {
            if (stack.empty() || stack.peek() < arr[i]) {
                stack.push(arr[i]);
                i++;
            } else if (stack.peek() >= arr[i]) {
                stack.pop();
            }
        }
        return stack.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
