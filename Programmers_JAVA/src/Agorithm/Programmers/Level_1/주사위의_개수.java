package Agorithm.Programmers.Level_1;

public class 주사위의_개수 {
    public static void main(String[] args) {

        주사위의_개수 stella = new 주사위의_개수();

        int[] box1 = {1, 1, 1};
        int n1 = 1;

        int[] box2 = {10, 8, 6};
        int n2 = 3;

        System.out.println("Answer1 = " + stella.solution(box1, n1));
        System.out.println("Answer2 = " + stella.solution(box2, n2));
    }

    /*
        box	            n      result
        [1, 1, 1]	    1	    1
        [10, 8, 6]	    3	    12
     */
    public int solution(int[] box, int n) {
        int answer = 0;
        return ((box[0] / n) * (box[1] / n)) * (box[2] / n);
    }
}
