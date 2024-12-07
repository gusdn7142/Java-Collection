package com.example.collectionTest.List;

import java.util.LinkedList;

public class LinkedListTest1 {
    public static void main(String[] args) {

        //1) LinkedList 선언
        LinkedList<String> linkedList1 = new LinkedList<String>();

        //2) LinkedList에 Value 저장
        linkedList1.add("F");
        linkedList1.add("B");
        linkedList1.add("D");
        linkedList1.add("E");
        linkedList1.add("C");
        linkedList1.addLast("Z");
        linkedList1.addFirst("A");
        linkedList1.add(1, "A2");

        //3) LinkedList Value 출력
        System.out.println("Original contents of linkedList1: " + linkedList1);

        //4) LinkedList에서 특정 요소 삭제
        linkedList1.remove("F");
        linkedList1.remove(2);

        System.out.println("Contents of linkedList1 after deletion: " + linkedList1);

        //4) LinkedList에서 특정 요소 삭제
        linkedList1.removeFirst();
        linkedList1.removeLast();
        System.out.println("linkedList1 after deleting first and last: " + linkedList1);

        //5) LinkedList에서 Value를 가져오고 새로 설정
        Object val = linkedList1.get(2);
        linkedList1.set(2, (String) val + " Changed");

        //6) LinkedList Value 출력
        System.out.println("linkedList1 after change: " + linkedList1);
    }
}
