package Agorithm.Programmers.Level_1;

import java.util.*;
import java.util.stream.Collectors;

public class 진료순서_정하기 {
    public static void main(String[] args) {

        진료순서_정하기 stella = new 진료순서_정하기();

        int[] emergency1 = {3, 76, 24};
        int[] emergency2 = {1, 2, 3, 4, 5, 6, 7};
        int[] emergency3 = {30, 10, 23, 6, 100};


        System.out.println("Answer1 = " + Arrays.toString(stella.solution(emergency1)));
        System.out.println("Answer1 = " + Arrays.toString(stella.solution(emergency2)));
        System.out.println("Answer1 = " + Arrays.toString(stella.solution(emergency3)));
    }

    /*
            emergency	            result
            [3, 76, 24]	            [3, 1, 2]
            [1, 2, 3, 4, 5, 6, 7]	[7, 6, 5, 4, 3, 2, 1]
            [30, 10, 23, 6, 100]	[2, 4, 3, 5, 1]
     */
    public int[] solution(int[] emergency) {

        // answer size 초기화
        int[] answer = new int[emergency.length];

        // int[] 을 reverse 하기 위해서 list emergency 를 list화 시키기
        ArrayList<Integer> arrayList = new ArrayList<>();

        // list 안에 Value 삽입
        for (Integer number : emergency) {
            arrayList.add(number);
        }

        // 응급도 순서를 아기위해 내림차순 정렬
        List<Integer> collect = arrayList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        Map<Integer, Integer> map = new HashMap<>();

        // 내림 차순 배열의 Value 값으 Key 값으로 map 에 저장
        for (int i = 0; i < collect.size(); i++) {
            map.put(collect.get(i), i + 1);
        }

        // 배열 emergency 를 돌면서 emergency[i] 해당하는 map Key 값을 조회
        for (int i = 0; i < map.size(); i++) {
            answer[i] = map.get(emergency[i]);
        }
        return answer;
    }
}
