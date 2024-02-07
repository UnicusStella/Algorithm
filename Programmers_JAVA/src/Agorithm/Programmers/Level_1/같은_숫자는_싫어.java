package Agorithm.Programmers.Level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 같은_숫자는_싫어 {
    public static void main(String[] args) {

        같은_숫자는_싫어 stella = new 같은_숫자는_싫어();

        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};

        int[] arr2 = {4, 4, 4, 3, 3};

        System.out.println("Answer = " + Arrays.toString(stella.solution(arr1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(arr2)));
    }

    /*
        arr	                answer
        [1,1,3,3,0,1,1]	    [1,3,0,1]
        [4,4,4,3,3]	        [4,3]
     */
    public int[] solution(int[] arr) {

        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int num : arr) {
            queue.offer(num);
        }

        arrayList.add(queue.poll());

        for (int i = 0; i < arr.length -1; i++) {
            Integer q = queue.poll();
            if (arrayList.get(arrayList.size() - 1) != q)
                arrayList.add(q);
        }

        return arrayList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
    public int[] solution2(int[] arr) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (linkedList.getLast() != arr[i]) linkedList.add(arr[i]);
        }

        return linkedList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
