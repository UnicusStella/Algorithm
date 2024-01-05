package Agorithm.Programmers.Level_1;

public class 다음에_올_숫자 {
    public static void main(String[] args) {

        다음에_올_숫자 stella = new 다음에_올_숫자();

        int[] common1 = {1, 2, 3, 4};

        int[] common2 = {2, 4, 8};


        System.out.println("Answer = " + stella.solution(common1));
        System.out.println("Answer = " + stella.solution(common2));
    }

    /*
        common	        result
        [1, 2, 3, 4]	5
        [2, 4, 8]	    16
     */
    public int solution(int[] common) {
        boolean arithmetic = false;
        int sequence = 0;

        // 등차수열, 등비수열 판별
        // true : 등차, false : 등비
        if (common[1] - common[0] == common[2] - common[1]) {
            arithmetic = true;
        }

        if (arithmetic) {
            sequence = common[1] - common[0];
            return common[common.length - 1] + sequence;
        }

        sequence = common[1] / common[0];

        return common[common.length - 1] * sequence;
    }
}