package Agorithm.Programmers.Level_2;

import java.util.HashMap;

public class 귤_고르기 {
    public static void main(String[] args) {

        귤_고르기 stella = new 귤_고르기();

        int k1 = 6;
        int[] tangerine1 = {1, 3, 2, 5, 4, 5, 2, 3};

        int k2 = 4;
        int[] tangerine2 = {1, 3, 2, 5, 4, 5, 2, 3};

        int k3 = 2;
        int[] tangerine3 = {1, 1, 1, 1, 2, 2, 2, 3};

        int k4 = 10;
        int[] tangerine4 = {1,1,3,3,3,4,5,2};

        System.out.println("Answer = " + stella.solution(k1, tangerine1));
        System.out.println("Answer = " + stella.solution(k2, tangerine2));
        System.out.println("Answer = " + stella.solution(k3, tangerine3));
        System.out.println("Answer = " + stella.solution(k4, tangerine4));
    }

    /*
        k	tangerine	result
        6	[1, 3, 2, 5, 4, 5, 2, 3]	3
        4	[1, 3, 2, 5, 4, 5, 2, 3]	2
        2	[1, 1, 1, 1, 2, 2, 2, 3]	1
     */
    public int solution(int k, int[] tangerine) {

        int fruitBox = 0;
        int fruitKind = 0;
        int[] fruitSize = {};

        HashMap<Integer, Integer> fruitMap = new HashMap<>();

        for (int fruit : tangerine)
            fruitMap.put(fruit, fruitMap.getOrDefault(fruit, 0) + 1);

        fruitSize = fruitMap.keySet().stream().map(fruitMap::get).mapToInt(Integer::intValue).toArray();

        MiddleQuickSort(fruitSize, 0, fruitSize.length - 1);

        for (int i = 0; i < fruitSize.length; i++) {
            fruitBox += fruitSize[i];
            fruitKind++;
            if (fruitBox >= k) return fruitKind;
        }

        return fruitKind;
    }

    private void MiddleQuickSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int low = left;
        int high = right;
        int pivot = arr[(left + right) / 2];

        while (low <= high) {
            while (pivot < arr[low]) low++;
            while (pivot > arr[high])  high--;

            if (low <= high) {
                Swap(arr, low, high);
                low++;
                high--;
            }
        }
        MiddleQuickSort(arr, left, high);
        MiddleQuickSort(arr, low, right);
    }

    private void Swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}