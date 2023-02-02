package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> hashSet1 = new HashSet<>();
        for (int i = 0; i < sourceList.size(); i++) {
            if (sourceList.get(i) % 2 == 0) {
                hashSet.add(sourceList.get(i));
                hashSet.add(sourceList.get(i) / 2);
            } else if (sourceList.get(i) % 2 != 0) {
                hashSet.add(sourceList.get(i));
                hashSet.add(sourceList.get(i) * 2);
            }

        }
        return hashSet;
    }

    public static void main(String[] args) {
        HashSetCreator hashSetCreator = new HashSetCreator();
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(8);
        list.add(16);
        list.add(4);

        System.out.println(hashSetCreator.createHashSet(list));
    }
}
