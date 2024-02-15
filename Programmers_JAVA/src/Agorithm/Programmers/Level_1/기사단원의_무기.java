package Agorithm.Programmers.Level_1;

import java.util.stream.IntStream;

public class 기사단원의_무기 {
    public static void main(String[] args) {

        기사단원의_무기 stella = new 기사단원의_무기();

        int number1 = 5;
        int limit1 = 3;
        int power1 = 2;

        int number2 = 10;
        int limit2 = 3;
        int power2 = 2;

        System.out.println("Answer = " + stella.solution(number1, limit1, power1));
        System.out.println("Answer = " + stella.solution(number2, limit2, power2));
    }

    /*
        number	limit	power	result
        5	    3	    2	    10
        10	    3	    2	    21
     */
    public int solution(int number, int limit, int power) {

        return IntStream.rangeClosed(1, number)
                .map(operand -> {
                    int count = 0;
                    for (int i = 1; i <= (int) Math.sqrt(operand); i++) {
                        if (Math.sqrt(operand) == i) {
                            count++;
                        } else if (operand % i == 0) {
                            count += 2;
                        }
                    }
                    return count;
                })
                .map(value -> value > limit ? power : value)
                .sum();
    }
}
