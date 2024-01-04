package Agorithm.Programmers.Level_1;

public class 옹알이_1 {
    public static void main(String[] args) {

        옹알이_1 stella = new 옹알이_1();

        String[] babbling1 = {"aya", "yee", "u", "maa", "wyeoo"};

        String[] babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        System.out.println("Answer = " + stella.solution(babbling1));
        System.out.println("Answer = " + stella.solution(babbling2));
    }

    /*
        babbling	                                    result
        ["aya", "yee", "u", "maa", "wyeoo"]	            1
        ["ayaye", "uuuma", "ye", "yemawoo", "ayaa"]	    3
     */
    public int solution(String[] babbling) {
        int answer = 0;
        String[] word = {"aya", "ye", "woo", "ma"};

        // 방법 1 For 문을 이용한 해결
/*        for (String baby : babbling) {
            for (String check : word) {
                baby = baby.replace(check, "-");
            }

            if (baby.replace("-", "").isEmpty()) {
                answer++;
            }
        }*/

        // 방법 2 정규표현식 사용
        for (String baby : babbling) {
            // ?!(word) : 앞쪽 문자열 기준으로 뒤쪽문자열에 (?!word)가 나오지 않는지 체크
            // Ex) aya(?!aya) 라면 aya 뒤에 연속으로 ayaaya 가 나오지 않아야 함.
            // 조건문으로 옹알이는 한번만 나와야 하기 때문
            if (baby.matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")) {
                answer++;
            }
        }

        return answer;
    }
}