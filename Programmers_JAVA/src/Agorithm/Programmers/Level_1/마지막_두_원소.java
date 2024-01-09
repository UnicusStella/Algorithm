package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 마지막_두_원소 {
    public static void main(String[] args) {

        마지막_두_원소 stella = new 마지막_두_원소();

        int[] num_list1 = {2, 1, 6};

        int[] num_list2 = {5, 2, 1, 7, 5};

        System.out.println("Answer = " + Arrays.toString(stella.solution(num_list1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(num_list2)));
    }

    /*
        num_list	        result
        [2, 1, 6]	        [2, 1, 6, 5]
        [5, 2, 1, 7, 5]	    [5, 2, 1, 7, 5, 10]
     */
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        int lastOne = num_list[num_list.length - 1];
        int lastTwo = num_list[num_list.length - 2];

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        if (lastOne > lastTwo) {
            answer[answer.length - 1] = lastOne - lastTwo;
        } else {
            answer[answer.length - 1] = lastOne * 2;
        }

        return answer;
    }
}
