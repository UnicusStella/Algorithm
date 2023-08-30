import Agorithm.Programmers.Level_1.배열의_평균값;
import Agorithm.Programmers.Level_1.옷가게_할인_받기;

public class Main {
    public static void main(String[] args) {

        옷가게_할인_받기 stella = new 옷가게_할인_받기();

        int price1 = 150000;
        int price2 = 580000;

        System.out.println("Answer1 = " + stella.solution(price1));
        System.out.println("Answer2 = " + stella.solution(price2));
    }
}
/*
        price	result
        150,000	142,500
        580,000	464,000
 */