package Agorithm.Programmers.Level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class 콜라츠_수열_만들기 {
    public static void main(String[] args) {

        콜라츠_수열_만들기 stella = new 콜라츠_수열_만들기();

        int n1 = 10;

        System.out.println("Answer = " + Arrays.toString(stella.solution2(n1)));
    }

    /*
        n	result
        10	[10, 5, 16, 8, 4, 2, 1]
     */
    public int[] solution(int n) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList();

        list.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            list.add(n);
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public int[] solution2(int n) {

        // 초기값, 조건, 실행 문
        // 종료 시점인 1인경우에 0 (조건 이하의 수)으로 만들어서 종료 시키기
        // 조건을 value > 0 으로 하면 콜라츠 수열에 의하여 0 밑으로는 만들어 지지가 않음;
        return IntStream.iterate(n, value -> value >= 1, value -> value == 1
                        ? 0
                        : value % 2 == 0
                            ? value / 2
                            : value * 3 + 1)
                .toArray();
    }
}
