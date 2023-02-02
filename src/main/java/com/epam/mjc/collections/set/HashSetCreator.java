package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int it = 0; it < sourceList.size(); it++) {

            if (sourceList.get(it) % 2 != 0){
                hashSet.add(sourceList.get(it));
                hashSet.add(sourceList.get(it)*2);
            }else {
                int now = sourceList.get(it);
                while(now > 0){
                    hashSet.add(now);
                    now /= 2;
                    if (now % 2 != 0){
                        hashSet.add(now);
                        break;
                    }
                }
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
