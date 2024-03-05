package Agorithm.Programmers.Level_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class 개인정보_수집_유효기간 {
    public static void main(String[] args) {

        개인정보_수집_유효기간 stella = new 개인정보_수집_유효기간();

        String today1 = "2022.05.19";
        String[] terms1 = {"A 6", "B 12", "C 3"};
        String[] privacies1 = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        String today2 = "2020.01.01";
        String[] terms2 = {"Z 3", "D 5"};
        String[] privacies2 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

        String today3 = "2009.12.31";
        String[] terms3 = {"A 13"};
        String[] privacies3 = {"2008.11.03 A"};

        System.out.println("Answer = " + Arrays.toString(stella.solution(today1, terms1, privacies1)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(today2, terms2, privacies2)));
        System.out.println("Answer = " + Arrays.toString(stella.solution(today3, terms3, privacies3)));
    }

    /*
        today	        terms               	privacies
        "2022.05.19"	["A 6", "B 12", "C 3"]	["2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"]
        "2020.01.01"    ["Z 3", "D 5"]	        ["2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"]

        result
        [1, 3]
        [1, 4, 5]
     */
    public int[] solution(String today, String[] terms, String[] privacies) {

        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();

        today = today.replace(".", "");

        for (String target : terms)
            map.put(target.split(" ")[0], Integer.parseInt(target.split(" ")[1]));

        for (int i = 0; i < privacies.length; i++) {
            String[] privacies_Split = privacies[i].split(" ");
            String[] date = privacies_Split[0].split("\\.");

            String year = date[0], month = date[1], day = date[2];

            // 일(日) 계산 : 유효기간은 약정 시점 - 1일 이다.
            // 약정 시점이 1일일 경우 전달 28일 까지 유효기간이다.
            int minusMonth = 0;
            if (day.equals("01")) {
                sb.append(28);
                minusMonth--;
            } else sb.append(String.format("%02d", Integer.parseInt(day) - 1));

            // 월(月) 계산 : 12월이 넘을 경우 넘는 만큼 년(年)에 추가
            int newMonth = (Integer.parseInt(month) + map.get(privacies_Split[1]) + minusMonth);
            int yearRound = newMonth / 12;
            newMonth %= 12;

            // newMonth % 12 == 0 일 경우 12월달이 0월이 되므로 0일 경우 12로 바꿔 줘야 함.
            // 또한 올림도 0 일경우 하나 빼줘야 함.
            if (newMonth == 0) {
                sb.insert(0, 12);
                yearRound--;
            } else sb.insert(0, String.format("%02d", newMonth));

            // 년(年) 계산 : 12월에 추가된 월만큼 더하기
            sb.insert(0, (Integer.parseInt(year) + yearRound));

            // 약정 만료 검증
            if (Integer.parseInt(today) > Integer.parseInt(sb.toString())) list.add(i + 1);
            sb.setLength(0);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution2(String today, String[] terms, String[] privacies) {

        List<Integer> answer = new ArrayList();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate date = LocalDate.parse(today, formatter);

        // 찾기 쉽도록 termsMap 구성
        Map<String, Integer> termsMap = new HashMap<>();

        for (int i = 0; i < terms.length; i++) {
            String[] term = terms[i].split(" ");
            termsMap.put(term[0], Integer.valueOf(term[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            LocalDate privacyRegisterYmdt = LocalDate.parse(privacy[0], formatter).plusMonths(termsMap.get(privacy[1])).minusDays(1);

            if (privacyRegisterYmdt.isBefore(date)) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
