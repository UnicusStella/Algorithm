package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 배열_뒤집기 {

    public int[] solution(int[] num_list) {
        int[] answer = {};

        // Sudo
        // 1. 배열을 뒤집기 위해서는 우선 Collections 메소드 활용
        // 2. 해당 메소드 사용하려면 List 로 변환 해야함.
        List<Integer> integerList = Arrays.stream(num_list).boxed().collect(Collectors.toList());

        Collections.reverse(integerList);

        return integerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
