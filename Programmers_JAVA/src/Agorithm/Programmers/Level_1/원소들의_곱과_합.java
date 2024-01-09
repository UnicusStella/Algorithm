package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 원소들의_곱과_합 {
    public static void main(String[] args) {

        원소들의_곱과_합 stella = new 원소들의_곱과_합();

        int[] num_list1 = {3, 4, 5, 2, 1};

        int[] num_list2 = {5, 7, 8, 3};

        System.out.println("Answer = " + stella.solution(num_list1));
        System.out.println("Answer = " + stella.solution(num_list2));
    }

    /*
        num_list	        result
        [3, 4, 5, 2, 1]	    1
        [5, 7, 8, 3]	    0
     */
    public int solution(int[] num_list) {
        int answer = 0;

        int multiple = Arrays.stream(num_list).reduce((left, right) -> left * right).getAsInt();
        int sumToPow = (int) Math.pow(Arrays.stream(num_list).sum(), 2);

        return multiple < sumToPow ? 1 : 0;
    }
}