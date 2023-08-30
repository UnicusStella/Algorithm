import Agorithm.Programmers.Level_1.가위_바위_보;

public class Main {
    public static void main(String[] args) {

        가위_바위_보 stella = new 가위_바위_보();

        String rsp1 = "2";
        String rsp2 = "205";

        System.out.println("Answer1 = " + stella.solution(rsp1));
        System.out.println("Answer2 = " + stella.solution(rsp2));
    }
}
/*
        rsp	    result
        "2"	    "0"
        "205"	"052"
 */