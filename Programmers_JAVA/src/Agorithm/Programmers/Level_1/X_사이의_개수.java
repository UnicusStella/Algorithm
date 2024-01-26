
package Agorithm.Programmers.Level_1;

import java.util.Arrays;

public class X_사이의_개수 {
    public static void main(String[] args) {

        X_사이의_개수 stella = new X_사이의_개수();

        String myString1 = "oxooxoxxox";

        String myString2 = "xabcxdefxghi";

        System.out.println("Answer = " + Arrays.toString(stella.solution(myString1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(myString2)));
    }

    /*
        myString	        result
        "oxooxoxxox"	    [1, 2, 1, 0, 1, 0]
        "xabcxdefxghi"	    [0, 3, 3, 3]
     */
    public int[] solution(String myString) {

        return Arrays.stream(myString.split("x", -1))
                .mapToInt(String::length)
                .toArray();
    }
}
