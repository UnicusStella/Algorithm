package Agorithm.Programmers.Level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;

public class 명예의_전당_1 {
    public static void main(String[] args) {

        명예의_전당_1 stella = new 명예의_전당_1();

        int k1 = 3;
        int[] score1 = {10, 100, 20, 150, 1, 100, 200};

        int k2 = 4;
        int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};

        int k3 = 3;
        int[] score3 = {100, 30, 40, 150, 300, 200, 200};

        System.out.println("Answer = " + Arrays.toString(stella.solution(k1, score1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(k2, score2)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(k3, score3)));
    }

    /*
        k	score	                                        result
        3	[10, 100, 20, 150, 1, 100, 200]	                [10, 10, 10, 20, 20, 100, 100]
        4	[0, 300, 40, 300, 20, 70, 150, 50, 500, 1000]	[0, 0, 0, 0, 20, 40, 70, 70, 150, 300]
        3   [100, 30, 40, 150, 300, 200, 200]               [100, 30, 30, 40, 100, 150, 200]
     */
    public int[] solution(int k, int[] score) {

        ArrayList<Integer> answer = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        stack.add(score[0]);
        answer.add(score[0]);

        for (int i = 1; i < score.length; i++) {
            if (stack.size() <= k) {
                for (int j = 0; j < stack.size(); j++) {
                    if (score[i] >= stack.get(j)) {
                        stack.add(j, score[i]);
                        break;
                    }
                    if (j == stack.size() - 1) {
                        stack.push(score[i]);
                        break;
                    }
                }
            } else {
                for (int j = 0; j < stack.size(); j++) {
                    if (score[i] >= stack.get(j)) {
                        stack.add(j, score[i]);
                        if (stack.size() > k) {
                            stack.pop();
                        }
                        break;
                    }
                }
            }
            answer.add(stack.peek());
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public int[] solution2(int k, int[] score) {

        int[] answer = new int[score.length];
        int idx = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int num : score) {
            queue.offer(num);

            if (queue.size() > k) {
                queue.poll();
            }

            answer[idx] = queue.peek();
            idx++;
        }

        return answer;
    }
}
