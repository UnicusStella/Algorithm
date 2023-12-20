package Agorithm.Programmers.Level_1;

public class 직사각형_넓이_구하기 {
    public static void main(String[] args) {

        직사각형_넓이_구하기 stella = new 직사각형_넓이_구하기();

        int[][] dots1 = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};

        int[][] dots2 = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};

        System.out.println("Answer1 = " + stella.solution2(dots1));
        System.out.println("Answer2 = " + stella.solution2(dots2));
    }

    /*
        dots	                                    result
        [[1, 1], [2, 1], [2, 2], [1, 2]]	        1
        [[-1, -1], [1, 1], [1, -1], [-1, 1]]	    4
     */

    public int solution(int[][] dots) {
        int answer = 0;
        int x_small = dots[0][0];
        int x_big = dots[0][0];

        int y_small = dots[0][1];
        int y_big = dots[0][1];

        int x = 0;
        int y = 0;

        for (int i = 0; i < dots.length; i++) {
            if (dots[i][0] > x_big) {
                x_big = dots[i][0];
            } else if (dots[i][0] < x_small) {
                x_small = dots[i][0];
            }

            if (dots[i][1] > y_big) {
                y_big = dots[i][1];
            } else if (dots[i][1] < y_small) {
                y_small = dots[i][1];
            }
        }

        x = Math.abs(x_big - x_small);
        y = Math.abs(y_big - y_small);

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        return x * y;
    }

    public int solution2(int[][] dots) {
        int answer = 0;
        int x_center = dots[0][0];
        int y_center = dots[0][1];
        int x = 0;
        int y = 0;

        // Center(x,y) 를 기준으로 X 와 Y 의 최대값을 구한 뒤 그 차이만큼 곱함.
        for (int i = 0; i < dots.length; i++) {
            if (dots[i][0] > x_center) {
                x = dots[i][0];
            } else if (dots[i][1] > y_center) {
                y = dots[i][1];
            }
        }

        return Math.abs(x - x_center) * Math.abs(y - y_center);
    }
}
