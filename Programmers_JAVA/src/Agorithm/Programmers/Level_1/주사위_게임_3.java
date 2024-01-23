package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 주사위_게임_3 {
    public static void main(String[] args) {

        주사위_게임_3 stella = new 주사위_게임_3();

        int a1 = 2;
        int b1 = 2;
        int c1 = 2;
        int d1 = 2;

        int a2 = 4;
        int b2 = 1;
        int c2 = 4;
        int d2 = 4;

        int a3 = 6;
        int b3 = 3;
        int c3 = 3;
        int d3 = 6;

        int a4 = 2;
        int b4 = 5;
        int c4 = 2;
        int d4 = 6;

        int a5 = 6;
        int b5 = 4;
        int c5 = 2;
        int d5 = 5;

        System.out.println("Answer = " + stella.solution(a1, b1, c1, d1));
        System.out.println("Answer = " + stella.solution(a2, b2, c2, d2));
        System.out.println("Answer = " + stella.solution(a3, b3, c3, d3));
        System.out.println("Answer = " + stella.solution(a4, b4, c4, d4));
        System.out.println("Answer = " + stella.solution(a5, b5, c5, d5));

    }

    /*
        a	b	c	d	result
        2	2	2	2	2222
        4	1	4	4	1681
        6	3	3	6	27
        2	5	2	6	30
        6	4	2	5	2
     */
    public int solution(int a, int b, int c, int d) {

        int answer = 0;
        int p = 0;
        int q = 0;

        int[] dices = new int[7];
        dices[a] += 1;
        dices[b] += 1;
        dices[c] += 1;
        dices[d] += 1;

        int maxDice = Arrays.stream(dices).max().getAsInt();

        // 4개의 dice 가 같을 경우
        if (maxDice == 4) {
            return answer = 1111 * a;
        }

        // 3개의 dice 가 같을 경우
        if (maxDice == 3) {
            for (int i = 0; i < dices.length; i++) {
                if (dices[i] == 3) {
                    p = i;
                } else if (dices[i] == 1) {
                    q = i;
                }
            }
            return (int) Math.pow(10 * p + q, 2);
        }

        // 2 + 2개의 dice 일 경우
        if (maxDice == 2) {
            boolean match = Arrays.stream(dices).anyMatch(value -> value == 1);
            // 2 + 1 + 1개의 dice 일 경우
            if (match) {
                for (int i = 0; i < dices.length; i++) {
                    if (dices[i] == 1) {
                        if (p == 0) {
                            p = i;
                        } else {
                            q = i;
                        }
                    }
                }
                return p * q;
                // 2 + 2개의 dice 일 경우
            } else {
                for (int i = 0; i < dices.length; i++) {
                    if (dices[i] == 2) {
                        if (p == 0) {
                            p = i;
                        } else {
                            q = i;
                        }
                    }
                }
            }
            return (p + q) * (Math.abs(p - q));
        }

        // dice 가 전부 다를 경우
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}
