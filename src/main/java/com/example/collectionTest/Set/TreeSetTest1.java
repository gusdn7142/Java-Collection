package com.example.collectionTest.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest1 {
    public static void main(String args[]) {

        //1) HashSet 선언
        Set<String> treeSet1 = new TreeSet<>();

        //2) HashSet에 Value 저장
        treeSet1.add("B");
        treeSet1.add("A");
        treeSet1.add("D");
        treeSet1.add("E");
        treeSet1.add("C");
        treeSet1.add("F");

        //3) HashSet Value 출력
        System.out.println("1st treeSet1: " + treeSet1);

        //4) HashSet에서 특정 요소 삭제
        treeSet1.remove("B");
        System.out.println("2st treeSet1: " + treeSet1);

    }
}
