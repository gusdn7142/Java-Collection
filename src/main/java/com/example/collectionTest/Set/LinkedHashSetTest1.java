package com.example.collectionTest.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest1 {
    public static void main(String[] args) {

        //1) LinkedHashSet 선언
        Set<String> linkHashSet = new LinkedHashSet<String>();

        //2) linkHashSet에 Value 저장
        linkHashSet.add("B");
        linkHashSet.add("A");
        linkHashSet.add("D");
        linkHashSet.add("E");
        linkHashSet.add("C");
        linkHashSet.add("F");

        //3) LinkedHashSet Value 출력
        System.out.println("1st linkHashSet: " + linkHashSet);

        //4) LinkedHashSet에서 특정 요소 삭제
        linkHashSet.remove("B");
        System.out.println("2st LinkedHashSet: " + linkHashSet);
    }
}
