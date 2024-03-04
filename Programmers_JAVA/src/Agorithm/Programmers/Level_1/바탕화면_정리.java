package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class 바탕화면_정리 {
    public static void main(String[] args) {

        바탕화면_정리 stella = new 바탕화면_정리();

        String[] wallpaper1 = {".#...", "..#..", "...#."};
        String[] wallpaper2 = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        String[] wallpaper3 = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        String[] wallpaper4 = {"..", "#."};

        System.out.println("Answer = " + Arrays.toString(stella.solution(wallpaper1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(wallpaper2)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(wallpaper3)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(wallpaper4)));
    }

    /*
        wallpaper	                                                                                result
        [".#...", "..#..", "...#."]	                                                                [0, 1, 3, 4]
        ["..........", ".....#....", "......##..", "...##.....", "....#....."]	                    [1, 3, 5, 8]
        [".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."]	[0, 0, 7, 9]
        ["..", "#."]	                                                                            [1, 0, 2, 1]
     */
    public int[] solution(String[] wallpaper) {

        int lux = 50, luy = 50, rdx = 0, rdy = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#") && i < lux) lux = i;
            if (wallpaper[i].contains("#") && wallpaper[i].indexOf("#") < luy)
                luy = wallpaper[i].indexOf("#");
            if (wallpaper[i].contains("#") && i > rdx) rdx = i;
            if (wallpaper[i].contains("#") && wallpaper[i].lastIndexOf("#") > rdy)
                rdy = wallpaper[i].lastIndexOf("#");

        }

        return new int[]{lux, luy, rdx + 1, rdy + 1};
    }
}
