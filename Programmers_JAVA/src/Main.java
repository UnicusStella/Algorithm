public class Main {
    public static void main(String[] args) {

        int n1 = 7;

        int n2 = 10;


        System.out.println("Answer1 = " + solution(n1));
        System.out.println("Answer2 = " + solution(n2));
    }

    /*
        n	    result
        24	    [1, 2, 3, 4, 6, 8, 12, 24]
        29	    [1, 29]
    */
    public static int solution(int n) {
        int answer = 0;

        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                answer += Math.pow(i, 2);
            }
        } else {
            for (int i = 1; i <= n; i += 2) {
                answer += i;
            }
        }
        return answer;
    }
}