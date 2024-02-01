package Agorithm.Programmers.Level_1;

public class 크기가_작은_부분_문자열 {
    public static void main(String[] args) {

        크기가_작은_부분_문자열 stella = new 크기가_작은_부분_문자열();

        String t1 = "3141592";
        String p1 = "271";

        String t2 = "500220839878";
        String p2 = "7";

        String t3 = "10203";
        String p3 = "15";

        System.out.println("Answer = " + stella.solution(t1, p1));
        System.out.println("Answer = " + stella.solution(t2, p2));
        System.out.println("Answer = " + stella.solution(t3, p3));
    }

    /*
        t	            p	        result
        "3141592"	    "271"	    2
        "500220839878"	"7"	        8
        "10203"	        "15"	    3
     */
    public int solution(String t, String p) {

        int answer = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            if (Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p)) answer++;
        }
        return answer;
    }
}
