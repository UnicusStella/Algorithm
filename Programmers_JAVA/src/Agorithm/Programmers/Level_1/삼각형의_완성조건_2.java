package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 삼각형의_완성조건_2 {
    public static void main(String[] args) {

        삼각형의_완성조건_2 stella = new 삼각형의_완성조건_2();

        int[] sides1 = {1, 2};

        int[] sides2 = {3, 6};

        int[] sides3 = {11, 7};

        System.out.println("Answer = " + stella.solution(sides1));
        System.out.println("Answer = " + stella.solution(sides2));
        System.out.println("Answer = " + stella.solution(sides3));
    }

    /*
        sides	    result
        [1, 2]	    1
        [3, 6]	    5
        [11, 7]	    13
     */
    public int solution(int[] sides) {
        int answer = 0;

        // 정렬
        Arrays.sort(sides);

        int big = sides[1];
        int small = sides[0];

        int gap = big - small;
        int max = big + small;

        // side 에서 큰 수 가 가장 긴 변일 경우
        // big - small == answer
        // answer < x <= big
        while (gap < big) {
            answer++;
            gap++;
        }

        // 가장 긴 변이 있을경우
        // big < x < small + big
        while (big + 1 < max) {
            answer++;
            big++;
        }

        return answer;
    }
    public int solution2(int[] sides) {
        int answer = 0;

        // 공식인가...?
        return Math.min(sides[0], sides[1]) * 2 - 1;
    }
}
