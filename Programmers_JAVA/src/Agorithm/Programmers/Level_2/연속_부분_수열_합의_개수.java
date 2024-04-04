package Agorithm.Programmers.Level_2;

import java.util.Arrays;
import java.util.HashSet;

public class 연속_부분_수열_합의_개수 {
    public static void main(String[] args) {

        연속_부분_수열_합의_개수 stella = new 연속_부분_수열_합의_개수();

        int[] elements1 = {7, 9, 1, 1, 4};

        System.out.println("Answer = " + stella.solution(elements1));
    }

    /*
        elements	    result
        [7,9,1,1,4]	    18
     */
    public int solution(int[] elements) {

        int num = 0;
        int count = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                count = 0;
                while (i >= count) {
                    num += elements[(j + count) % elements.length];
                    count++;
                }
                set.add(num);
                num = 0;
            }
        }

        return set.size();
    }
}