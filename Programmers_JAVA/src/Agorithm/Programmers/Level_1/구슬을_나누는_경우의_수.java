package Agorithm.Programmers.Level_1;

public class 구슬을_나누는_경우의_수 {
    public static void main(String[] args) {

        구슬을_나누는_경우의_수 stella = new 구슬을_나누는_경우의_수();

        int balls1 = 3;
        int share1 = 2;

        int balls2 = 5;
        int share2 = 3;

        System.out.println("Answer1 = " + stella.solution(balls1, share1));
        System.out.println("Answer2 = " + stella.solution(balls2, share2));
    }

    /*
            balls	share	result
            3	    2   	3
            5	    3   	10
     */
    public long solution(int balls, int share) {

        long answer = 1;

        // 5C3 == 5C2 경우의 수가 같다는 점을 이용하여 Share 부분에 대해
        // 더 작은 경우의 수를 구하도록 체크
        share = Math.min(balls - share, share);

        for (int i = 0; i < share; i++) {
            // 조합 5C2 의 경우
            // 5x4 / 2*1 공식으로 풀 수 있음.
            answer *= balls - i;
            answer /= i + 1;
        }
        return answer;
    }
}
