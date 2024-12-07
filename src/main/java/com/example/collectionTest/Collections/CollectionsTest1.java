package com.example.collectionTest.Collections;


import java.util.*;

public class CollectionsTest1 {
    public static void main(String[] args) {

        //1) LinkedList 선언
        LinkedList<Integer> linkedList = new LinkedList<>();

        //2) LinkedList에 Value 저장
        linkedList.add(Integer.valueOf(-8));
        linkedList.add(Integer.valueOf(20));
        linkedList.add(Integer.valueOf(-20));
        linkedList.add(Integer.valueOf(8));

        //3) 역순의 비교자를 생성.
        Comparator<Integer> reverseComparator = Collections.reverseOrder();

        //4) 비교자를 사용해 linkedList 역순 정렬
        Collections.sort(linkedList, reverseComparator);

        //5) linkedList로부터 반복자를 얻어 출력
        Iterator<Integer> iterator = linkedList.iterator();

        System.out.print("List sorted in reverse: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        //6) linkedList shuffle
        Collections.shuffle(linkedList);

        //7) linkedList 내부의 임의의 데이터 출력
        iterator = linkedList.iterator();
        System.out.print("List shuffled: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        //8) linkedList 내부의 가장 작은 값과 가장 큰 값 출력
        System.out.println("Minimum: " + Collections.min(linkedList));
        System.out.println("Maximum: " + Collections.max(linkedList));

        //9) Collection's Empty List Test
        List<Integer> nonRecommendedlist = Collections.EMPTY_LIST;       // 비권장
        Map<String, Object> nonRecommendedMap = Collections.EMPTY_MAP; // 비권장
        Set<String> nonRecommendedSet = Collections.EMPTY_SET;         // 비권장

        List<Integer> recommendedlist = Collections.emptyList();        // 권장 (타입 안정성 보장)
        Map<String, String> recommendedMap = Collections.emptyMap();   // 권장 (타입 안정성 보장)
        Set<String> recommendedSet = Collections.emptySet();           // 권장 (타입 안정성 보장)

        //public static final List EMPTY_LIST = new EmptyList<>();

    }
}
