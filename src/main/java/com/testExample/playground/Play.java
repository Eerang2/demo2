package com.testExample.playground;

import java.util.*;

public class Play {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(3);
        System.out.println(hashSet);

        for(int item : hashSet) {
            System.out.println(item);
        }

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(3);
        System.out.println(treeSet);

        System.out.println(Integer.valueOf("10"));


        Map<Object, Object> userMap = new HashMap<>();

        userMap.put("이진우", 19);
        userMap.put("이길주",44);
        userMap.put("이진우1", 19);
        System.out.println(userMap);

    }
}
