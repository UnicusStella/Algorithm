package Agorithm.Programmers.Level_1;

public class 이진수_더하기 {
    public static void main(String[] args) {

        이진수_더하기 stella = new 이진수_더하기();

        String bin1_1 = "10";
        String bin2_1 = "11";

        String bin1_2 = "1001";
        String bin2_2 = "1111";

        System.out.println("Answer = " + stella.solution(bin1_1, bin2_1));
        System.out.println("Answer = " + stella.solution(bin1_2, bin2_2));
    }

    /*
        bin1	bin2	result
        "10"	"11"	"101"
        "1001"	"1111"	"11000"
     */
    public String solution(String bin1, String bin2) {
        String answer = "";

        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }
}