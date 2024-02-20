package Agorithm.Programmers.Level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 실패율 {
    public static void main(String[] args) {

        실패율 stella = new 실패율();

        int n1 = 5;
        int[] stages1 = {2, 1, 2, 6, 2, 4, 3, 3};

        int n2 = 4;
        int[] stages2 = {4, 4, 4, 4, 4};

        System.out.println("Answer = " + Arrays.toString(stella.solution(n1, stages1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(n2, stages2)));
    }

    /*
        N	stages	                        result
        5	[2, 1, 2, 6, 2, 4, 3, 3]	    [3,4,2,1,5]
        4	[4, 4, 4, 4, 4]	                [4,1,2,3]
     */
    public int[] solution(int N, int[] stages) {

        int[] stageFailure = new int[N + 2];
        int[] stageReached = new int[N + 2];
        Double[] stageFailureRate = new Double[N + 1];

        for (int stage : stages) {
            for (int i = 1; i <= stage; i++) {
                stageReached[i]++;
            }
            stageFailure[stage]++;
        }

        // 실패율 =  스테이지 실패 인원 / 스테이지 성공 인원
        for (int i = 1; i <= N; i++) {
            stageFailureRate[i] = (double) stageFailure[i] / stageReached[i];
        }

        HashMap<Integer, Double> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        // Key : num, Value : failureRate
        for (int i = 1; i <= N; i++) {
            map.put(i, stageFailureRate[i]);
        }

        for (int i = 2; i <= map.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (map.get(i) > map.get(list.get(j))) {
                    list.add(j, i);
                    break;
                }
                if (j == list.size() - 1) {
                    list.add(i);
                    break;
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
