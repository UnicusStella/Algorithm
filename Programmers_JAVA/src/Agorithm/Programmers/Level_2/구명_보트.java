package Agorithm.Programmers.Level_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class 구명_보트 {
    public static void main(String[] args) {

        구명_보트 stella = new 구명_보트();

        int[] people1 = {70, 50, 80, 50};
        int limit1 = 100;

        int[] people2 = {70, 80, 50};
        int limit2 = 100;

        System.out.println("Answer = " + stella.solution(people1, limit1));
        System.out.println("Answer = " + stella.solution(people2, limit2));
    }

    /*
        people	            limit	return
        [70, 50, 80, 50]	100	    3
        [70, 80, 50]	    100	    3
     */
    public int solution(int[] people, int limit) {

        int answer = 0;

        Arrays.sort(people);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = people.length - 1; i >= 0; i--) {

            if (pq.isEmpty()) {
                if (limit - people[i] >= 40)
                    pq.add(limit - people[i]);
                answer++;
            } else {
                if (pq.peek() >= people[i]) pq.poll();
                else {
                    if (limit - people[i] >= 40)
                        pq.add(limit - people[i]);
                    answer++;
                }
            }
        }

        return answer;
    }

    public int solution2(int[] people, int limit) {

        Arrays.sort(people);

        int i = 0;
        for (int j = people.length - 1; j > i; j--) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
        }

        return people.length - i;
    }
}