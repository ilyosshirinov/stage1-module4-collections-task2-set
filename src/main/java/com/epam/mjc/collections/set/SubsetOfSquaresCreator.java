package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < sourceList.size(); i++) {
            if (Math.pow(sourceList.get(i), 2) >= lowerBound && Math.pow(sourceList.get(i), 2) <= upperBound) {
                list.add((int) Math.pow(sourceList.get(i), 2));
            }
        }
        return list;
    }

//    public static void main(String[] args) {
//        SubsetOfSquaresCreator subsetOfSquaresCreator = new SubsetOfSquaresCreator();
//        int lowerBound = 25, upperBound = 49;
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(-1);
//        list.add(5);
//        list.add(-7);
//        list.add(4);
//        list.add(6);
//        list.add(-9);
//        list.add(8);
//        System.out.println(subsetOfSquaresCreator.createSubsetOfSquares(list, lowerBound, upperBound));
//    }
}
