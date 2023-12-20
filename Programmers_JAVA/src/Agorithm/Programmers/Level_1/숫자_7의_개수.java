package Agorithm.Programmers.Level_1;

public class 숫자_7의_개수 {
    public static void main(String[] args) {

        숫자_7의_개수 stella = new 숫자_7의_개수();

        int[] array1 = {7, 77, 17};

        int[] array2 = {10, 29};

        System.out.println("Answer1 = " + stella.solution(array1));
        System.out.println("Answer1 = " + stella.solution(array2));
    }

    /*
        array	        result
        [7, 77, 17]	    4
        [10, 29]	    0
     */
    public int solution(int[] array) {
        int answer = 0;
        String seven = "";

        for (int num : array) {
            seven += num;
        }

        return seven.replaceAll("[^7]","").length();
    }
}
