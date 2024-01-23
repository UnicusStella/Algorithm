package Agorithm.Programmers.Level_1;

import java.util.stream.IntStream;

public class 접미사인지_확인하기 {
    public static void main(String[] args) {

        접미사인지_확인하기 stella = new 접미사인지_확인하기();

        String my_string1 = "banana";
        String is_suffix1 = "ana";

        String my_string2 = "programmers";
        String is_suffix2 = "nan";

        String my_string3 = "programmers";
        String is_suffix3 = "wxyz";

        String my_string4 = "programmers";
        String is_suffix4 = "abanana";

        System.out.println("Answer = " + stella.solution(my_string1, is_suffix1));
        System.out.println("Answer = " + stella.solution(my_string2, is_suffix2));
        System.out.println("Answer = " + stella.solution(my_string3, is_suffix3));
        System.out.println("Answer = " + stella.solution(my_string4, is_suffix4));

    }

    /*
        my_string	is_suffix	result
        "banana"	"ana"	    1
        "banana"	"nan"	    0
        "banana"	"wxyz"	    0
        "banana"	"abanana"	0
     */
    public int solution(String my_string, String is_suffix) {

        return IntStream.range(0, my_string.length())
                .mapToObj(my_string::substring)
                .anyMatch(s -> s.equals(is_suffix)) ? 1 : 0;

    }

    public int solution2(String my_string, String is_suffix) {

        return my_string.endsWith(is_suffix) ? 1 : 0;

    }
}
