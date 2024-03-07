package Agorithm.Programmers.Level_2;

public class 최솟값_만들기 {
    public static void main(String[] args) {

        최솟값_만들기 stella = new 최솟값_만들기();

        int[] A1 = {1, 4, 2};
        int[] B1 = {5, 4, 4};

        int[] A2 = {1, 2};
        int[] B2 = {3, 4};

        System.out.println("Answer = " + stella.solution(A1, B1));
        System.out.println("Answer = " + stella.solution(A2, B2));
    }

    /*
        A	        B	        answer
        [1, 4, 2]	[5, 4, 4]	29
        [1,2]	    [3,4]	    10
     */
    public int solution(int[] A, int[] B) {

        int answer = 0;

        LeftQuickSort(A, 0, A.length - 1);
        MiddleQuckSort(B, 0, B.length - 1);

        for (int i = 0; i < A.length; i++)
            answer += A[i] * B[i];

        return answer;
    }

    private void LeftQuickSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int low = left;
        int high = right;
        int pivot = arr[left];

        while (low < high) {
            while (pivot >= arr[low] && low < high) low++;
            while (pivot < arr[high]) high--;

            if (low < high) Swap(arr, low, high);
        }
        Swap(arr, left, high);
        LeftQuickSort(arr, left, high - 1);
        LeftQuickSort(arr, high + 1, right);
    }

    private void MiddleQuckSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int low = left;
        int high = right;
        int pivot = arr[(left + right) / 2];

        while (low <= high) {
            while (pivot < arr[low]) low++;
            while (pivot > arr[high]) high--;

            if (low <= high) {
                Swap(arr, low, high);
                low++;
                high--;
            }
        }

        MiddleQuckSort(arr, left, high);
        MiddleQuckSort(arr, low, right);
    }

    private void Swap(int[] arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}
