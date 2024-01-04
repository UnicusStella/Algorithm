package Agorithm.Programmers.Level_1;

public class 로그인_성공 {
    public static void main(String[] args) {

        로그인_성공 stella = new 로그인_성공();

        String[] id_pw1 = {"meosseugi", "1234"};
        String[][] db1 = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};

        String[] id_pw2 = {"programmer01", "15789"};
        String[][] db2 = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};

        String[] id_pw3 = {"rabbit04", "98761"};
        String[][] db3 = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};

        System.out.println("Answer = " + stella.solution(id_pw1, db1));
        System.out.println("Answer = " + stella.solution(id_pw2, db2));
        System.out.println("Answer = " + stella.solution(id_pw3, db3));
    }

    /*
        id_pw	                    db	                                                                            result
        ["meosseugi", "1234"]	    [["rardss", "123"],     ["yyoom", "1234"], ["meosseugi", "1234"]]	            "login"
        ["programmer01", "15789"]	[["programmer02", "111111"], ["programmer00", "134"], ["programmer01", "1145"]]	"wrong pw"
        ["rabbit04", "98761"]	    [["jaja11", "98761"], ["krong0313", "29440"], ["rabbit00", "111333"]]	        "fail"
     */
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";

        for (String[] loginCheck : db) {
            if (loginCheck[0].equals(id_pw[0])) {
                if (loginCheck[1].equals(id_pw[1])) {
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                }
            }
        }
        return answer;
    }
}