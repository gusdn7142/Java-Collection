package com.example.collectionTest.List;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest1 {
    public static void main(String args[]) {

        //1) ArrayList 선언
        List<String> arrayList1 = new ArrayList<>();
        System.out.println("Initial size of arrayList1: " + arrayList1.size());

        //2) ArrayList에 Value 저장
        arrayList1.add("C");
        arrayList1.add("A");
        arrayList1.add("E");
        arrayList1.add("B");
        arrayList1.add("D");
        arrayList1.add("F");
        arrayList1.add(1, "A2");  
        System.out.println("Size of arrayList1 after additions: " + arrayList1.size());

        //3) ArrayList Value 출력
        System.out.println("Contents of arrayList1: " + arrayList1);

        //4) ArrayList에서 특정 요소 삭제
        arrayList1.remove("F");
        arrayList1.remove(2);

        //5) ArrayList Value 출력
        System.out.println("Size of arrayList1 after deletions: " + arrayList1.size());
        System.out.println("Contents of arrayList1: " + arrayList1);

        //6) ArrayList가 비어있는지 확인
        System.out.println("리스트가 비어있는지 확인? " + arrayList1.isEmpty());

        //7) ArrayList 특정 요소 포함여부 확인
        boolean containsApple = arrayList1.contains("Apple");
        System.out.println("사과과 포함되어 있나? " + containsApple);

        //8) 반복을 통해 ArrayList 출력
        System.out.println("list iterating :");
        for (String fruit : arrayList1) {
            System.out.println(fruit);
        }

        //9) 반복자를 통해 ArrayList 출력
        ListIterator<String> listIterator = arrayList1.listIterator();
        System.out.println("list 반복자 사용 :");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        //10) ArrayList 하위 요소 출력
        List<String> subList = arrayList1.subList(1, 3);
        System.out.println("SubList index 1부터 3까지: " + subList);

        //11) ArrayList 내부 요소 초기화
        arrayList1.clear();
        System.out.println("list 초기화: " + arrayList1);
        System.out.println("리스트가 비어있는가? " + arrayList1.isEmpty());

        //12) ArrayList를 배열로 변환
        List<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(4);

        Object objArray[] = arrayList2.toArray();
        int sum=0;

        //13) 배열 요소들의 합계 출력
        for(int i=0; i<objArray.length; i++){
            sum += ((Integer) objArray[i]).intValue();
        }
        System.out.println("Sum is: " + sum);
    }
}
