package Agorithm.Programmers.Level_1;

public class 옷가게_할인_받기 {
    public static void main(String[] args) {

        옷가게_할인_받기 stella = new 옷가게_할인_받기();

        int price1 = 150000;
        int price2 = 580000;

        System.out.println("Answer1 = " + stella.solution(price1));
        System.out.println("Answer2 = " + stella.solution(price2));
    }

    /*
            price	result
            150,000	142,500
            580,000	464,000
     */
    public int solution(int price) {
        int answer = 0;
        return price >= 500000
                ? (int) (price * 0.8)
                : price >= 300000
                ? (int) (price * 0.9)
                : price >= 100000
                ? (int) (price * 0.95)
                : price;
    }
}
