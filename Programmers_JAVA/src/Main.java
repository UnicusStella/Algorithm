import Agorithm.Programmers.Level_1.최빈값_구하기;

public class Main {
    public static void main(String[] args) {

        최빈값_구하기 stella = new 최빈값_구하기();

        int[] array1 = {1, 2, 3, 3, 3, 4};
        int[] array2 = {1, 1, 2, 2};
        int[] array3 = {1};

        System.out.println("array1 = " + stella.solution(array1)); // 3
        System.out.println("array2 = " + stella.solution(array2)); // -1
        System.out.println("array3 = " + stella.solution(array3)); // 1
    }
}
/*
    array	result
    [1, 2, 3, 3, 3, 4]	3
    [1, 1, 2, 2]	-1
    [1]	1
 */