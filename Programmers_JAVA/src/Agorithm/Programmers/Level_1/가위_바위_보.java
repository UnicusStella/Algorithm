package Agorithm.Programmers.Level_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class 가위_바위_보 {
    public String solution(String rsp) {
        String answer = "";
        return Arrays.stream(rsp.split(""))
                .map(s -> s.equals("0") ? "5"
                        : s.equals("2")
                        ? "0"
                        : "2")
                .collect(Collectors.joining());
    }

    public String solution1(String rsp) {
        String answer = "";

        Map<String, String> map = new HashMap<>();

        // 주먹, 가위, 보 를 입력하면 이기는 수 출력
        map.put("0", "5");
        map.put("2", "0");
        map.put("5", "2");

        return Arrays.stream(rsp.split("")).map(s -> map.get(s)).collect(Collectors.joining());
    }
}
