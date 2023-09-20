package Agorithm.Programmers.Level_1;

public class 영어가_싫어요 {
    public static void main(String[] args) {

        영어가_싫어요 stella = new 영어가_싫어요();

        String numbers1 = "onetwothreefourfivesixseveneightnine";

        String numbers2 = "onefourzerosixseven";

        System.out.println("Answer1 = " + stella.solution(numbers1));
        System.out.println("Answer2 = " + stella.solution(numbers2));
    }

    /*
        numbers                                 	result
        "onetwothreefourfivesixseveneightnine"  	123456789
        "onefourzerosixseven"	                    14067
     */
    public long solution(String numbers) {
        long answer = 0;
        String[] numList = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numList.length; i++) {
            if (numbers.indexOf(numList[i]) != -1) {
                numbers = numbers.replace(numList[i], i + "");
            }
        }

        return Long.parseLong(numbers);
    }

    // 다른 사람 코드 성능면에서는 이게 훨씬 좋음.
    public long solution2(String numbers) {
        return Long.parseLong(
                numbers.replace("zero", "0")
                        .replace("one", "1")
                        .replace("two", "2")
                        .replace("three", "3")
                        .replace("four", "4")
                        .replace("five", "5")
                        .replace("six", "6")
                        .replace("seven", "7")
                        .replace("eight", "8")
                        .replace("nine", "9")
        );
    }
}
