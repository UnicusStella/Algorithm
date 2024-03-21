package Agorithm.Programmers.Level_2;

public class N개의_최소공배수 {
    public static void main(String[] args) {

        N개의_최소공배수 stella = new N개의_최소공배수();

        int[] arr1 = {2, 6, 8, 14};

        int[] arr2 = {1, 2, 3};

        System.out.println("Answer = " + stella.solution(arr1));
        System.out.println("Answer = " + stella.solution(arr2));
    }

    /*
        arr	            result
        [2,6,8,14]	    168
        [1,2,3]	        6
     */
    public int solution(int[] arr) {

        int initNUm = arr[0];

        for (int i = 1; i < arr.length; i++)
            initNUm = LCM(initNUm, arr[i]);

        return initNUm;
    }

    private int LCM(int num1, int num2) {

        return num1 * num2 / GCD(num1, num2);
    }

    private int GCD(int num1, int num2) {
        if (num1 % num2 == 0) return num2;

        return GCD(num2, num1 % num2);
    }
}