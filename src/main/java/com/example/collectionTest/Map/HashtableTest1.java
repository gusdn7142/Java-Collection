package com.example.collectionTest.Map;

import java.util.*;

public class HashtableTest1 {

    public static void main(String[] args) {

        //1) Hashtable 선언
        Map<String, Double> hashtable = new Hashtable<>();

        //2) Hashtable에 Value 저장
        hashtable.put("홍길동이", Double.valueOf(1240.34));
        hashtable.put("김영순이", Double.valueOf(223.39));
        hashtable.put("퀵군", Double.valueOf(1378.00));
        hashtable.put("글라이더님", Double.valueOf(9999.55));
        hashtable.put("존 도", Double.valueOf(-122.08));
        //hashtable.put("뎁스님", null);    //null 값은 예외처리됨

        //3) Hashtable 엔트리의 컬렉션 집합 set 조회
        Set<Map.Entry<String, Double>> set = hashtable.entrySet();

        //4) set의 반복자를 얻는다.
        Iterator<?> iterator = set.iterator();
        //System.out.println("iterator : " + iterator);

        //5) Hashtable 요소 출력
        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            //System.out.println("entry : " + entry);
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }

        //6) Hashtable 요소 변경
        double originValue = hashtable.get("존 도").doubleValue();
        hashtable.put("존 도", Double.valueOf(originValue + 1000));
        System.out.println("존 도's new value: " + hashtable.get("존 도"));

        //7) (Key 혹은 Value가) 존재하면 True
        System.out.println(hashtable.containsKey("홍길동"));
        System.out.println(hashtable.containsValue(223.39));

        //8) String 타입 key를 Set에 담기
        Set<String> keys = hashtable.keySet();
        System.out.println(keys);

        //9) Double 타입인 값을 Collection에 담기
        Collection<Double> values = hashtable.values();
        System.out.println(values);
    }
}
