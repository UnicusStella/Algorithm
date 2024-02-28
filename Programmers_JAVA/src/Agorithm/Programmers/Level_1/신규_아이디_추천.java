package Agorithm.Programmers.Level_1;

public class 신규_아이디_추천 {
    public static void main(String[] args) {

        신규_아이디_추천 stella = new 신규_아이디_추천();

        String new_id1 = "...!@BaT#*..y.abcdefghijklm";
        String new_id2 = "z-+.^.";
        String new_id3 = "=.=";
        String new_id4 = "123_.def";
        String new_id5 = "abcdefghijklmn.p";

        System.out.println("Answer = " + stella.solution(new_id1));
        System.out.println("Answer = " + stella.solution(new_id2));
        System.out.println("Answer = " + stella.solution(new_id3));
        System.out.println("Answer = " + stella.solution(new_id4));
        System.out.println("Answer = " + stella.solution(new_id5));
    }

    /*
        no	    new_id	                        result
        예1	    "...!@BaT#*..y.abcdefghijklm"	"bat.y.abcdefghi"
        예2	    "z-+.^."	                    "z--"
        예3	    "=.="	                        "aaa"
        예4	    "123_.def"	                    "123_.def"
        예5	    "abcdefghijklmn.p"	            "abcdefghijklmn"
     */
    public String solution(String new_id) {

        // 1. 대문자 -> 소문자 치환
        new_id = new_id.toLowerCase();

        // 2. 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 제외한 문자 제거
        new_id = new_id.replaceAll("[^a-z0-9._-]", "");

        // 3. 마침표(.)가 2번 이상 연속시 하나의 마침표(.)로 치환
        new_id = new_id.replaceAll("[..]+", ".");

        // 4. 마침표(.)가 처음이나 끝에 있다면 제거
        if (new_id.startsWith(".")) new_id = new_id.substring(1);
        if (new_id.endsWith(".")) new_id = new_id.substring(0, new_id.length() - 1);

        // 5. 빈 문자열이면 "a" 대입
        new_id = new_id.isEmpty() ? "a" : new_id;

        // 6. 길이가 16자 이상이면 15자 까지 자름
        if (new_id.length() >= 16) new_id = new_id.substring(0, 15);
        // 6-1. 길이 제거 후 끝에 마침표(.)가 있다면 제거
        if (new_id.endsWith(".")) new_id = new_id.substring(0, new_id.length() - 1);

        // 7. 길이가 2자 이하면 마지막 문자를 길이가 3 될 때까지 반복
        if (new_id.length() <= 2) {
            for (int i = new_id.length(); i < 3; i++)
                new_id += String.valueOf(new_id.charAt(new_id.length() - 1));
        }

        return new_id;
    }
}
