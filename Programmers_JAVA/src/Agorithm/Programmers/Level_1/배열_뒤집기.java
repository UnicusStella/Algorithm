package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 배열_뒤집기 {
    public static void main(String[] args) {

        배열_뒤집기 stella = new 배열_뒤집기();

        int[] num_list1 = {1, 2, 3, 4, 5};
        int[] num_list2 = {1, 1, 1, 1, 1, 2};
        int[] num_list3 = {1, 0, 1, 1, 1, 3, 5};

        System.out.println("Answer1 = " + Arrays.toString(stella.solution(num_list1)));
        System.out.println("Answer1 = " + Arrays.toString(stella.solution(num_list2)));
        System.out.println("Answer1 = " + Arrays.toString(stella.solution(num_list3)));
    }
    
    /*
            num_list1               result
            [1, 2, 3, 4, 5]     	[5, 4, 3, 2, 1]
            [1, 1, 1, 1, 1, 2]	    [2, 1, 1, 1, 1, 1]
            [1, 0, 1, 1, 1, 3, 5]	[5, 3, 1, 1, 1, 0, 1]
     */
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
