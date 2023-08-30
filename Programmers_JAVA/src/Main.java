import Agorithm.Programmers.Level_1.구슬을_나누는_경우의_수;

public class Main {
    public static void main(String[] args) {

        구슬을_나누는_경우의_수 stella = new 구슬을_나누는_경우의_수();

        int balls1 = 3;
        int share1 = 2;

        int balls2 = 5;
        int share2 = 3;

        System.out.println("Answer1 = " + stella.solution(balls1, share1));
        System.out.println("Answer2 = " + stella.solution(balls2, share2));
    }
}
/*
        balls	share	result
        3	    2   	3
        5	    3   	10
 */