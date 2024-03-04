package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.HashMap;

public class 데이터_분석 {
    public static void main(String[] args) {

        데이터_분석 stella = new 데이터_분석();

        int[][] data1 = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext1 = "date";
        int val_ext1 = 20300501;
        String sort_by1 = "remain";

        System.out.println("Answer = " + Arrays.deepToString(stella.solution(data1, ext1, val_ext1, sort_by1)));
    }

    /*
        data	                                                                    ext
        [[1, 20300104, 100, 80], [2, 20300804, 847, 37], [3, 20300401, 10, 8]]	    "date"

        val_ext	    sort_by	    result
        20300501	"remain"	[[3,20300401,10,8],[1,20300104,100,80]]
     */
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        String[] checkExt = {"code", "date", "maximum", "remain"};
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 4; i++)
            map.put(checkExt[i], i);

        return Arrays.stream(data).filter(ints -> ints[map.get(ext)] < val_ext)
                .sorted((o1, o2) ->
                        Integer.valueOf(o1[map.get(sort_by)]).compareTo(o2[map.get(sort_by)]))
                .toArray(int[][]::new);
    }
}
