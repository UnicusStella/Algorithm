package Agorithm.Programmers.Level_1;

import java.util.ArrayList;
import java.util.Arrays;

public class 소인수분해 {
    public static void main(String[] args) {

        소인수분해 stella = new 소인수분해();

        int n1 = 12;

        int n2 = 17;

        int n3 = 420;

        System.out.println("Answer1 = " + Arrays.toString(stella.solution(n1)));
        System.out.println("Answer2 = " + Arrays.toString(stella.solution(n2)));
        System.out.println("Answer3 = " + Arrays.toString(stella.solution(n3)));
    }

    /*
        n	    result
        12	    [2, 3]
        17	    [17]
        420	    [2, 3, 5, 7]
    */
    public int[] solution(int n) {
        int target = n;
        int divisor = 2;

        ArrayList<Integer> list = new ArrayList<>();

        // target 값이 '2'일 경우도 While 문을 한번 타야함.
        while (target >= 2) {
            if (target % divisor == 0) {
                target /= divisor;
                list.add(divisor);
            } else {
                divisor++;
            }
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .distinct()
                .toArray();
    }
}
