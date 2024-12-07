package com.example.collectionTest.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest1 {
    public static void main(String args[]) {

        //1) HashSet 선언
        Set<String> hashSet1 = new HashSet<>();

        //2) HashSet에 Value 저장
        hashSet1.add("B");
        hashSet1.add("A");
        hashSet1.add("D");
        hashSet1.add("E");
        hashSet1.add("C");
        hashSet1.add("F");

        //3) HashSet Value 출력
        System.out.println("1st hashSet1: " + hashSet1);

        //4) HashSet에서 특정 요소 삭제
        hashSet1.remove("B");
        System.out.println("2st hashSet1: " + hashSet1);

    }
}
