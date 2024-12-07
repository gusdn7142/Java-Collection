package com.example.collectionTest.Map;

import java.util.*;

public class HashMapTest1 {

    public static void main(String[] args) {

        //1) HashMap 선언
        Map<String, Double> hashMap = new HashMap<String, Double>();

        //2) hashMap에 Value 저장
        hashMap.put("홍길동이", Double.valueOf(1240.34));
        hashMap.put("김영순이", Double.valueOf(223.39));
        hashMap.put("퀵군", Double.valueOf(1378.00));
        hashMap.put("글라이더님", Double.valueOf(9999.55));
        hashMap.put("존 도", Double.valueOf(-122.08));
        hashMap.put("뎁스님", null);

        //3) HashMap 엔트리의 컬렉션 집합 set 조회
        Set<Map.Entry<String, Double>> set = hashMap.entrySet();

        //4) set의 반복자를 얻는다.
        Iterator<?> iterator = set.iterator();
        //System.out.println("iterator : " + iterator);

        //5) HashMap 요소 출력
        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            //System.out.println("entry : " + entry);
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }

        //6) HashMap 요소 변경
        double originValue = hashMap.get("존 도").doubleValue();
        hashMap.put("존 도", Double.valueOf(originValue + 1000));
        System.out.println("존 도's new value: " + hashMap.get("존 도"));

        //7) (Key 혹은 Value가) 존재하면 True
        System.out.println(hashMap.containsKey("홍길동"));
        System.out.println(hashMap.containsValue(223.39));


        //8) String 타입 key를 Set에 담기
        Set<String> keys = hashMap.keySet();
        System.out.println(keys);


        //9) Double 타입인 값을 Collection에 담기
        Collection<Double> values = hashMap.values();
        System.out.println(values);
    }
}
