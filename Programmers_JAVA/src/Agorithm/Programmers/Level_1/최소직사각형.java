package Agorithm.Programmers.Level_1;

public class 최소직사각형 {
    public static void main(String[] args) {

        최소직사각형 stella = new 최소직사각형();

        int[][] sizes1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        int[][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};

        int[][] sizes3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        System.out.println("Answer = " + stella.solution(sizes1));
        System.out.println("Answer = " + stella.solution(sizes2));
        System.out.println("Answer = " + stella.solution(sizes3));
    }

    /*
        sizes	                                        result
        [[60, 50], [30, 70], [60, 30], [80, 40]]	    4000
        [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	120
        [[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]	133
     */
    public int solution(int[][] sizes) {

        int weight = 0, height = 0;

        for (int[] size : sizes) {
            weight = Math.max(weight, Math.max(size[0], size[1]));
            height = Math.max(height, Math.min(size[0], size[1]));
        }

        return weight * height;
    }
}
