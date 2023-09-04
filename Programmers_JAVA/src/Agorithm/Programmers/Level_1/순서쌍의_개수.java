package Agorithm.Programmers.Level_1;

public class 순서쌍의_개수 {
    public static void main(String[] args) {

        순서쌍의_개수 stella = new 순서쌍의_개수();

        int n1 = 20;
        int n2 = 100;


        System.out.println("Answer1 = " + stella.solution(n1));
        System.out.println("Answer2 = " + stella.solution(n2));
    }

    /*
            n	result
            20	6
            100	9
     */
    public int solution(int n) {
        int answer = 0;

        // 약수의 중복이므로 n 의 제곱근 까지만 반복을 돌면 됨.
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) answer++;
        }

        // 제곱근 까지만 돌았으므로 중복된 값을 구하려면 x2 를 해줘야 함.
        answer *= 2;

        // 제곱근이 딱떨어지면 순서쌍이 같으므로 -1 을 해줘야 함
        if (Math.sqrt(n) == (int) Math.sqrt(n))
            answer--;

        return answer;
    }
}
