package Agorithm.Programmers.Level_1;

import java.util.ArrayList;
import java.util.Arrays;

public class 그림_확대 {
    public static void main(String[] args) {

        그림_확대 stella = new 그림_확대();

        String[] picture1 = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k1 = 2;

        String[] picture2 = {"x.x", ".x.", "x.x"};
        int k2 = 3;

        System.out.println("Answer = " + Arrays.toString(stella.solution(picture1, k1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(picture2, k2)));
    }

    /*
        picture	        k	        result
        [".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."]
        2
        ["..xxxx......xxxx..", "..xxxx......xxxx..", "xx....xx..xx....xx", "xx....xx..xx....xx", "xx......xx......xx", "xx......xx......xx", "..xx..........xx..", "..xx..........xx..", "....xx......xx....", "....xx......xx....", "......xx..xx......", "......xx..xx......", "........xx........", "........xx........"]

        ["x.x", ".x.", "x.x"]
        3
        ["xxx...xxx", "xxx...xxx", "xxx...xxx", "...xxx...", "...xxx...", "...xxx...", "xxx...xxx", "xxx...xxx", "xxx...xxx"]
     */
    public String[] solution(String[] picture, int k) {

        ArrayList<String> list = new ArrayList<>();

        String[] array = Arrays.stream(picture).map(s -> {
            String pic = "";
            for (int i = 0; i < s.length(); i++) {
                pic += String.valueOf(s.charAt(i)).repeat(k);
            }
            return pic;
        }).toArray(String[]::new);

        for (String str : array) {
            for (int i = 0; i < k; i++) {
                list.add(str);
            }
        }

        return list.toArray(String[]::new);
    }

    public String[] solution2(String[] picture, int k) {

        String[] answer = new String[picture.length * k];
        int idx = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < k; j++) {
                sb.setLength(0);
                for (int x = 0; x < picture[i].length(); x++) {
                    sb.append(String.valueOf(picture[i].charAt(x)).repeat(k));
                }
                answer[idx++] = sb.toString();
            }
        }

        return answer;
    }
}
