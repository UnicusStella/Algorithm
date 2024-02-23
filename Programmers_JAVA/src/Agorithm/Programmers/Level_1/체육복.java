package Agorithm.Programmers.Level_1;

import java.util.ArrayList;
import java.util.Arrays;

public class 체육복 {
    public static void main(String[] args) {

        체육복 stella = new 체육복();

        int n1 = 5;
        int[] lost1 = {2, 4};
        int[] reserve1 = {1, 3, 5};

        int n2 = 5;
        int[] lost2 = {2, 4};
        int[] reserve2 = {3};

        int n3 = 3;
        int[] lost3 = {3};
        int[] reserve3 = {1};

        int n4 = 3;
        int[] lost4 = {1, 2, 3};
        int[] reserve4 = {1, 2, 3};

        int n5 = 7;
        int[] lost5 = {2, 3, 4};
        int[] reserve5 = {1, 2, 3, 6};

        System.out.println("Answer = " + stella.solution(n1, lost1, reserve1));
        System.out.println("Answer = " + stella.solution(n2, lost2, reserve2));
        System.out.println("Answer = " + stella.solution(n3, lost3, reserve3));
    }

    /*
        n	lost	reserve	    return
        5	[2, 4]	[1, 3, 5]	5
        5	[2, 4]	[3]	        4
        3	[3] 	[1]	        2
     */
    public int solution(int n, int[] lost, int[] reserve) {

        int answer = 0;
        boolean isFilter = true;

        ArrayList<Integer> lostList = new ArrayList<>();
        ArrayList<Integer> reserveList = new ArrayList<>();

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            isFilter = true;
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    isFilter = false;
                }
            }
            if (isFilter) lostList.add(lost[i]);
        }

        for (int i = 0; i < reserve.length; i++) {
            isFilter = true;
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    isFilter = false;
                }
            }
            if (isFilter) reserveList.add(reserve[i]);
        }

        answer = lostList.size();

        for (int i = 0; i < lostList.size(); i++) {
            for (int j = 0; j < reserveList.size(); j++) {
                if (answer == 0) return n - answer;
                int target = reserveList.get(j);
                if (lostList.get(i) == target - 1 || lostList.get(i) == target + 1) {
                    answer--;
                    reserveList.remove(j);
                }
            }
        }
        return n - answer;
    }

    public int solution2(int n, int[] lost, int[] reserve) {

        int answer = n;
        int[] clothes = new int[n];

        for (int target : lost)
            clothes[target - 1]--;
        for (int target : reserve)
            clothes[target - 1]++;

        for (int i = 0; i < n; i++) {
            if (clothes[i] == -1) {
                if (i - 1 >= 0 && clothes[i - 1] == 1) {
                    clothes[i - 1]--;
                    clothes[i]++;
                } else if (i + 1 < n && clothes[i + 1] == 1) {
                    clothes[i + 1]--;
                    clothes[i]++;
                } else answer--;
            }

        }
        return answer;
    }
}
