package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 덧칠하기 {
    public static void main(String[] args) {

        덧칠하기 stella = new 덧칠하기();

        int n1 = 8;
        int m1 = 4;
        int[] section1 = {2, 3, 6};

        int n2 = 5;
        int m2 = 4;
        int[] section2 = {1, 3};

        int n3 = 4;
        int m3 = 1;
        int[] section3 = {1, 2, 3, 4};

        System.out.println("Answer = " + stella.solution(n1, m1, section1));
        System.out.println("Answer = " + stella.solution(n2, m2, section2));
        System.out.println("Answer = " + stella.solution(n3, m3, section3));
    }

    /*
        n	m	section	        result
        8	4	[2, 3, 6]	    2
        5	4	[1, 3]	        1
        4	1	[1, 2, 3, 4]	4
     */
    public int solution(int n, int m, int[] section) {

        int answer = 0;
        Boolean[] isPaint = new Boolean[n + 1];

        Arrays.fill(isPaint, true);

        for (int num : section) {
            isPaint[num] = false;
        }

        for (int num : section) {
            if (!isPaint[num]) {
                int len = num + m > n ? n : num + m -1;
                for (int i = num; i <= len; i++) {
                    isPaint[i] = true;
                }
                answer++;
            }
        }

        return answer;
    }
    public int solution2(int n, int m, int[] section) {

        int start = section[0];
        int cnt = 1;

        for (int i = 1; i < section.length; i++) {
            if (section[i] > start + m - 1) {
                cnt++;
                start = section[i];
            }
        }

        return cnt;
    }
}
