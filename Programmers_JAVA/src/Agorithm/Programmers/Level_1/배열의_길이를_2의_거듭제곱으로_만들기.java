package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 배열의_길이를_2의_거듭제곱으로_만들기 {
    public static void main(String[] args) {

        배열의_길이를_2의_거듭제곱으로_만들기 stella = new 배열의_길이를_2의_거듭제곱으로_만들기();

        int[] arr1 = {1, 2, 3, 4, 5, 6};

        int[] arr2 = {58, 172, 746, 89};

        System.out.println("Answer = " + Arrays.toString(stella.solution(arr1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(arr2)));
    }

    /*
        arr	                result
        [1, 2, 3, 4, 5, 6]	[1, 2, 3, 4, 5, 6, 0, 0]
        [58, 172, 746, 89]	[58, 172, 746, 89]
     */
    public int[] solution(int[] arr) {

        int[] newArr = null;

        for (int i = 0; i < 11; i++) {
            if ((int) Math.pow(2, i) >= arr.length) {
                if ((int) Math.pow(2, i) == arr.length) {
                    return arr;
                }
                newArr = new int[(int) Math.pow(2, i)];

                System.arraycopy(arr, 0, newArr, 0, arr.length);
                break;
            }
        }
        return newArr;
    }

    // while 문을 이용한 거듭제곱으로 값 비교.
    public int[] solution2(int[] arr) {

        int pow = 1;

        while (pow < arr.length) {
            pow *= 2;
        }

        return Arrays.copyOf(arr, pow);

    }
}
