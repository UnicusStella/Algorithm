package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.HashMap;

public class 가장_많이_받은_선물 {
    public static void main(String[] args) {

        가장_많이_받은_선물 stella = new 가장_많이_받은_선물();

        String[] friends1 = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts1 = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};

        String[] friends2 = {"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts2 = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};

        String[] friends3 = {"a", "b", "c"};
        String[] gifts3 = {"a b", "b a", "c a", "a c", "a c", "c a"};

        System.out.println("Answer = " + stella.solution(friends1, gifts1));
        System.out.println("Answer = " + stella.solution(friends2, gifts2));
        System.out.println("Answer = " + stella.solution(friends3, gifts3));
    }

    /*
        friends	                                            gifts
        ["muzi", "ryan", "frodo", "neo"]	                ["muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"]
        ["joy", "brad", "alessandro", "conan", "david"]	    ["alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"]
        ["a", "b", "c"]	                                    ["a b", "b a", "c a", "a c", "a c", "c a"]

        result
        2
        4
        0
     */
    public int solution(String[] friends, String[] gifts) {

        int[][] giftMatrix = new int[friends.length][friends.length];
        int[] giftNumberMatrix = new int[friends.length];
        int[] nextMonthGift = new int[friends.length];

        HashMap<String, Integer> friendNumber = new HashMap<>();

        // friend Numbering
        for (int i = 0; i < friends.length; i++)
            friendNumber.put(friends[i], i);

        // 선물 지수 & 선물 주고 받은 내역
        for (String str : gifts) {
            String[] gift = str.split(" ");
            giftNumberMatrix[friendNumber.get(gift[0])]++;
            giftNumberMatrix[friendNumber.get(gift[1])]--;

            giftMatrix[friendNumber.get(gift[0])][friendNumber.get(gift[1])]++;
        }

        // 다음달 선물 받을 개수 구하기
        for (int i = 0; i < friends.length; i++) {
            for (int j = i; j < friends.length; j++) {
                if (i == j) continue;

                // 선물을 더 많이 준 사람이 다음달 선물 + 1;
                if (giftMatrix[i][j] > giftMatrix[j][i])
                    nextMonthGift[i]++;
                else if (giftMatrix[i][j] < giftMatrix[j][i])
                    nextMonthGift[j]++;

                    // 선물을 주고 받지 않거나 주고 받은 개수가 같다면 선물 지수로 비교 후 큰쪽을 + 1
                    // 선물 지수가 같으면 받는 선물 없음
                else if (giftMatrix[i][j] == giftMatrix[j][i]) {
                    if (giftNumberMatrix[friendNumber.get(friends[i])] > giftNumberMatrix[friendNumber.get(friends[j])])
                        nextMonthGift[i]++;
                    else if (giftNumberMatrix[friendNumber.get(friends[i])] < giftNumberMatrix[friendNumber.get(friends[j])])
                        nextMonthGift[j]++;
                }
            }
        }

        return Arrays.stream(nextMonthGift).max().getAsInt();
    }
}