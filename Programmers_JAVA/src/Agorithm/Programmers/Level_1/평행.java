package Agorithm.Programmers.Level_1;

public class 평행 {
    public static void main(String[] args) {

        평행 stella = new 평행();

        int[][] dot1 = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};

        int[][] dot2 = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};

        System.out.println("Answer = " + stella.solution(dot1));
        System.out.println("Answer = " + stella.solution(dot2));
    }

    /*
        dots	                                result
        [[1, 4], [9, 2], [3, 8], [11, 6]]	    1
        [[3, 5], [4, 1], [2, 4], [5, 10]]	    0
     */
    public int solution(int[][] dots) {
        int answer = 0;

        if ((Math.abs(dots[0][1] - dots[1][1]) / (double) Math.abs(dots[0][0] - dots[1][0])) == (Math.abs(dots[2][1] - dots[3][1]) / (double) Math.abs(dots[2][0] - dots[3][0]))) {
            return 1;
        }

        if ((Math.abs(dots[0][1] - dots[2][1]) / (double) Math.abs(dots[0][0] - dots[2][0])) == (Math.abs(dots[1][1] - dots[3][1]) / (double) Math.abs(dots[1][0] - dots[3][0]))) {
            return 1;
        }

        if ((Math.abs(dots[0][1] - dots[3][1]) / (double) Math.abs(dots[0][0] - dots[3][0])) == (Math.abs(dots[1][1] - dots[2][1]) / (double) Math.abs(dots[1][0] - dots[2][0]))) {
            return 1;
        }
        return answer;
    }
    // Refactoring
    public int solution2(int[][] dots) {

        int answer = 0;

        if (slope(dots, 0, 1, 2, 3)) return 1;
        if (slope(dots, 0, 2, 1, 3)) return 1;
        if (slope(dots, 0, 3, 1, 2)) return 1;

        return answer;
    }

    private boolean slope(int[][] dots, int a, int b, int c, int d) {

        double d1 = (Math.abs(dots[a][1] - dots[b][1]) / (double) Math.abs(dots[a][0] - dots[b][0]));
        double d2 = (Math.abs(dots[c][1] - dots[d][1]) / (double) Math.abs(dots[c][0] - dots[d][0]));

        return d1 == d2;
    }
}