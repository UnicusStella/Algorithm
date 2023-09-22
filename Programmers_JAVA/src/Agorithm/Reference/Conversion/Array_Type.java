package Agorithm.Reference.Conversion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Array_Type {
    public static void main(String[] args) {
        Int_();
    }

    public static void String_() {

        // String => String[]
        // 방법1. split("")
        String str1 = "s1, s2, s3";

        String[] strList1 = str1.split(",");

        // String[] => String
        String str2 = Arrays.stream(strList1).collect(Collectors.joining());
    }

    public static void Int_() {

        // int => int[]
        // 방법1. 반복문.
        int num1 = 1234;
        String numString = num1 + "";

        int[] numArr1 = new int[numString.length()];

        for (int i = 0; i < numString.length(); i++) {
            numArr1[i] = Integer.parseInt("" + numString.charAt(i));
        }

        // 방법2. Stream.
        int num2 = 1234;
        String numString2 = num2 + "";

        int[] numArr2 = Arrays.stream(numString2.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        /* ********************************************************************** */

        // int[] => int (합계)
        int num2Sum = Arrays.stream(numArr2).sum();

        // int[] => int (이어붙이기)
        int sum = Integer.parseInt(Arrays.stream(numArr2)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining()));

    }
}