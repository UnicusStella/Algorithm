package Agorithm.Programmers.Level_1;

public class 옷가게_할인_받기 {
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
