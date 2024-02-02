package Agorithm.Programmers.Level_1;

public class 삼총사 {
    public static void main(String[] args) {

        삼총사 stella = new 삼총사();

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

        int sum = 0;

        // 순열 탐색시 이전에 탐색 했는지를 체크를 하기 위한 로직
        boolean[] visited = new boolean[number.length];

        // 원소 3개를 더해서 0이 되는 개수 카운트
        sum += combination(number, visited, 0, number.length, 3);

        return sum;
    }

    private int combination(int[] array, boolean[] visited, int start, int end, int r) {

        int sum = 0;

        // r 만큼 visited[] true 가 있으므로 true 인 경우에만 원소를 더하여 0이 되는지 판단.
        if (r == 0) {
            for (int i = 0; i < end; i++) {
                if (visited[i]) {
                    sum += array[i];
                }
            }
            return sum == 0 ? 1 : 0;
        }

        // number.length 개수 중에서 r 개의 원소를 뽑아야 하므로
        // 재귀조건으로  r - 1 때까지 재귀 호출
        for (int i = start; i < end; i++) {
            visited[i] = true;
            sum += combination(array, visited, i + 1, end, r - 1);
            visited[i] = false;
        }

        return sum;
    }
}
