package Agorithm.Programmers.Level_1;

import java.util.stream.IntStream;

public class 소수_만들기 {

    public static void main(String[] args) {

        소수_만들기 stella = new 소수_만들기();

        int[] nums1 = {1, 2, 3, 4};

        int[] nums2 = {1, 2, 7, 6, 4};

        System.out.println("Answer = " + stella.solution(nums1));
        System.out.println("Answer = " + stella.solution(nums2));
    }

    /*
        nums	        result
        [1,2,3,4]	    1
        [1,2,7,6,4]	    4
     */
    public int solution(int[] nums) {

        boolean[] visited = new boolean[nums.length];
        int decimals = 0;

        return Backtracking(nums, visited, 0, 3, decimals);
    }

    private int Backtracking(int[] nums, boolean[] visited, int start, int n, int decimals) {

        // 2. 종료 조건
        if (n == 0) {
            int isDecimal = IntStream.range(0, visited.length)
                    .map(operand -> visited[operand] == true ? nums[operand] : 0)
                    .sum();

            decimals += DecimalChecking(isDecimal);

            return decimals;
        }

        // 1. 수행 조건
        for (int i = start; i < nums.length; i++) {

            visited[i] = true;
            decimals = Backtracking(nums, visited, i + 1, n - 1, decimals);
            visited[i] = false;
        }

        return decimals;
    }

    private int DecimalChecking(int isDecimal) {

        if (isDecimal == 2) return 1;

        for (int i = 2; i < isDecimal; i++) {
            if (isDecimal % i == 0) return 0;
        }

        return 1;
    }
}
