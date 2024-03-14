package Agorithm.Reference.Sort;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {

        Quick_Sort stella = new Quick_Sort();

        int[] sort = {5, 2, 9, 7, 3, 1, 6};
        int[] dupSort = {5, 5, 2, 9, 7, 3, 1, 6};

        int[] A1 = {1, 4, 2};
        int[] B1 = {5, 4, 4};

        int[] A2 = {1, 2};
        int[] B2 = {3, 4};

        System.out.println("Answer = " + Arrays.toString(stella.solution(sort)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(dupSort)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(A1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(A2)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(B1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(B2)));
    }

    /*
        sort                result
        [5,2,9,7,3,1,6]     [1,2,3,5,6,7,9]
    */
    public int[] solution(int[] sortArr) {

        LeftQuickSort(sortArr, 0, sortArr.length - 1);
        MiddleQuickSort(sortArr, 0, sortArr.length - 1);

        return sortArr;
    }

    private void LeftQuickSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int low = left;
        int high = right;
        int pivot = arr[left];

        while (low < high) {
            // pivot 이 sort[low] 크거나 같으면 증가
            // [ 왼쪽 정렬 ] pivot
            while (pivot >= arr[low] && low < high) low++;
            // pivot 이 sort[high]보다 작으면 감소
            // 즉 pivot 이 비교대상보다 작아야 비교대상이 오른쪽으로 정렬이 됨.
            // pivot [ 오른쪽 정렬 ]
            while (pivot < arr[high]) high--;

            if (low < high) Swap(arr, low, high);
        }

        Swap(arr, left, high);

            /*
            sort[left] = sort[high];
            sort[high] = pivot;
            */

        LeftQuickSort(arr, left, high - 1);
        LeftQuickSort(arr, high + 1, right);
    }

    private void MiddleQuickSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int low = left;
        int high = right;
        int pivot = arr[(left + right) / 2];

        while (low <= high) {
            while (pivot > arr[low]) low++;
            while (pivot < arr[high]) high--;

            if (low <= high) {
                Swap(arr, low, high);
                low++;
                high--;
            }
        }

        MiddleQuickSort(arr, left, high);
        MiddleQuickSort(arr, low, right);
    }

    private void Swap(int[] sort, int low, int high) {
        int temp = sort[low];
        sort[low] = sort[high];
        sort[high] = temp;
    }
}