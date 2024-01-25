package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 순서_바꾸기 {
    public static void main(String[] args) {

        순서_바꾸기 stella = new 순서_바꾸기();

        int[] num_list1 = {2, 1, 6};
        int n1 = 1;

        int[] num_list2 = {5, 2, 1, 7, 5};
        int n2 = 3;

        System.out.println("Answer = " + Arrays.toString(stella.solution(num_list1, n1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(num_list2, n2)));
    }

    /*
        num_list	        n	    result
        [2, 1, 6]	        1	    [1, 6, 2]
        [5, 2, 1, 7, 5]	    3	    [7, 5, 5, 2, 1]
     */
    public int[] solution(int[] num_list, int n) {

        int[] arr1 = Arrays.copyOfRange(num_list, 0, n);
        int[] arr2 = Arrays.copyOfRange(num_list, n, num_list.length);

        return IntStream.concat(Arrays.stream(arr2), Arrays.stream(arr1)).toArray();
    }

    public int[] solution2(int[] num_list, int n) {

        return IntStream.range(0, num_list.length)

                // 초기 값을 n 으로 잡고 num_list.length 로 나누면
                // 초기값 부터 순회
                .map(operand -> num_list[(operand + n) % num_list.length])
                .toArray();
    }
}
