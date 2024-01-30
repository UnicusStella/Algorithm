package Agorithm.Programmers.Level_1;

import java.util.*;

public class 특이한_정렬 {
    public static void main(String[] args) {

        특이한_정렬 stella = new 특이한_정렬();

        int[] numlist1 = {1, 2, 3, 4, 5, 6};
        int n1 = 4;

        int[] numlist2 = {10000, 20, 36, 47, 40, 6, 10, 7000};
        int n2 = 30;

        System.out.println("Answer = " + Arrays.toString(stella.solution(numlist1, n1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(numlist2, n2)));
    }

    /*
        numlist	                        n	    result
        [1, 2, 3, 4, 5, 6]	            4	    [4, 5, 3, 6, 2, 1]
        [10000,20,36,47,40,6,10,7000]	30	    [36, 40, 20, 47, 10, 6, 7000, 10000]
     */
    public int[] solution(int[] numlist, int n) {
        List<String> answer = new ArrayList<>();

        List<String> list = new ArrayList<>();

        Arrays.sort(numlist);

        // N 과의 차이만큼 오름차순 정렬
        List<String> numSortList = Arrays.stream(numlist)
                .mapToObj(value -> Math.abs(value - n) + "-" + value)
                .sorted(Comparator.comparingInt(s -> Integer.parseInt(s.split("-")[0])))
                .toList();

        // N 과의 갭 차이가 같은 수는 별도로 판별
        String previous = numSortList.get(0).split("-")[0];

        for (int i = 0; i < numSortList.size(); i++) {
            String[] num = numSortList.get(i).split("-");

            // previous 와 GAP 값이 같은지 판별
            if (num[0].equals(previous)) {
                // previous 가 같으면 list 에 추가
                list.add(num[1]);
            } else {
                // previous 변경
                previous = num[0];

                // previous 가 틀릴때까지 저장한 list 배열 정렬
                // 같은 GAP 차이 배열에서 내림차순 -> 오름차순 으로 변경
                Collections.reverse(list);

                for (String number : list) {
                    answer.add(number);
                }
                // list 초기화
                list.clear();
                // 새로운 previous 배열 추가
                list.add(num[1]);
            }

            // 마지막 반복에서 if 문을 탈 경우 list 배열 Answer 에 넣어주기
            if (i == numSortList.size() - 1) {
                Collections.reverse(list);

                for (String number : list) {
                    answer.add(number);
                }
            }
        }

        return answer.stream()
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    // compare 메소드와 compareTo 메소드 이해하기
    public int[] solution2(int[] numlist, int n) {

        return Arrays.stream(numlist)
                .boxed()
                // a b 가 같을 경우
                .sorted((a, b) -> Math.abs(a - n) == Math.abs(b - n)
                        // a와 b 차이가 같을 경우 내림차순 으로 정렬
                        // 오름차순 : a.compareTo(b), 내림차순 : b.compareTo(a)
                        ? b.compareTo(a)
                        // a와 b가 같지 않을 경우에는 오름차순으로 정렬
                        : Integer.compare(Math.abs(a - n), Math.abs(b - n)))
                // unboxing Integer -> int
                .mapToInt(Integer::intValue)
                .toArray();
    }
}