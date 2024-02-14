package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 모의고사 {
    public static void main(String[] args) {

        모의고사 stella = new 모의고사();

        int[] answers1 = {1, 2, 3, 4, 5};

        int[] answers2 = {1, 3, 2, 4, 2};

        System.out.println("Answer = " + Arrays.toString(stella.solution(answers1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(answers2)));
    }

    /*
        answers	        return
        [1,2,3,4,5]	    [1]
        [1,3,2,4,2]	    [1,2,3]
     */
    public int[] solution(int[] answers) {

        int[] answer = new int[3];
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i % person1.length]) answer[0]++;
            if (answers[i] == person2[i % person2.length]) answer[1]++;
            if (answers[i] == person3[i % person3.length]) answer[2]++;
        }

        int max = Math.max(answer[0], Math.max(answer[1], answer[2]));

        return IntStream.range(1, answer.length + 1).filter(value -> answer[value - 1] == max).toArray();
    }
}
