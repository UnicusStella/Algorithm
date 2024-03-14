package Agorithm.Reference.Search;

public class BackTracking {
    public static void main(String[] args) {

        BackTracking stella = new BackTracking();

        int[] number1 = {-2, 3, 0, 2, -5};

        int[] number2 = {-3, -2, -1, 0, 1, 2, 3};

        int[] number3 = {-1, 1, -1, 1};

        System.out.println("Answer = " + stella.solution(number1));
        System.out.println("Answer = " + stella.solution(number2));
        System.out.println("Answer = " + stella.solution(number3));
    }

    /*
        number	                    result
        [-2, 3, 0, 2, -5]	        2
        [-3, -2, -1, 0, 1, 2, 3]	5
        [-1, 1, -1, 1]	            0
     */
    public int solution(int[] number) {

        int answer = 0;
        boolean[] visited = new boolean[number.length];

        answer += BackTracking(number, visited, 0, 3);

        return answer;
    }

    private int BackTracking(int[] number, boolean[] visited, int start, int r) {

        int zeroCheck = 0;

        if (r == 0) {
            for (int i = 0; i < number.length; i++)
                if (visited[i]) zeroCheck += number[i];

            return zeroCheck == 0 ? 1 : 0;
        }

        for (int i = start; i < number.length; i++) {
            visited[i] = true;
            zeroCheck += BackTracking(number, visited, i + 1, r - 1);
            visited[i] = false;
        }

        return zeroCheck;
    }
}
