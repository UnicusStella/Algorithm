package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
    public static void main(String[] args) {

        폰켓몬 stella = new 폰켓몬();

        int[] nums1 = {3, 1, 2, 3};

        int[] nums2 = {3, 3, 3, 2, 2, 4};

        int[] nums3 = {3, 3, 3, 2, 2, 2};

        System.out.println("Answer = " + stella.solution(nums1));
        System.out.println("Answer = " + stella.solution(nums2));
        System.out.println("Answer = " + stella.solution(nums3));
    }

    /*
        nums	        result
        [3,1,2,3]	    2
        [3,3,3,2,2,4]	3
        [3,3,3,2,2,2]	2
     */
    public int solution(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        return nums.length / 2 >= set.size() ? set.size() : nums.length / 2;
    }

    public int solution2(int[] nums) {

        return (int) Arrays.stream(nums)
                .distinct()
                .limit(nums.length / 2)
                .count();
    }
}
