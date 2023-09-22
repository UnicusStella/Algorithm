package Agorithm.Reference.Conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collection_Type {
    public static void main(String[] args) {
        List_();
    }

    public static void List_() {

        // String[] => ArrayList

        String[] strArr = {"a", "b", "c", "d"};

        // 방법1. Stream
        List<String> list1 = Arrays.stream(strArr).collect(Collectors.toList());


        // 방법2. 초기화.
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(strArr));

        // 방법3. 반복문.
        ArrayList<String> list3 = new ArrayList<>();

        for (String el : strArr) {
            list3.add(el);
        }

        /* ******************************************************************** */

        // String => ArrayList[]
        String[] array = list1.toArray(new String[list1.size()]);

        System.out.println("array = " + Arrays.toString(array));

    }
}
