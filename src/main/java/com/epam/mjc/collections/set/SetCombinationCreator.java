package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new HashSet<>();
        set.addAll(firstSet);
        set.retainAll(secondSet);
        set.removeAll(thirdSet);
        Set<String> set2 = new HashSet<>();
        set2.addAll(thirdSet);
        set2.removeAll(firstSet);
        set2.removeAll(secondSet);
        set.addAll(set2);

        return set;

    }

    public static void main(String[] args) {
        SetCombinationCreator creator = new SetCombinationCreator();
        Set<String> firstSet = new HashSet<>();
        firstSet.add("Java");
        firstSet.add("Collection");
        firstSet.add("framework");
        firstSet.add("interface");
        firstSet.add("class");
        firstSet.add("Queue");

        Set<String> secondSet = new HashSet<>();
        secondSet.add("Queue");
        secondSet.add("iterator");
        secondSet.add("Java");
        secondSet.add("Collection");
        secondSet.add("comparator");

        Set<String> thirdSet = new HashSet<>();
        thirdSet.add("Java");
        thirdSet.add("Set");
        thirdSet.add("Map");
        thirdSet.add("List");
        System.out.println(creator.createSetCombination(firstSet, secondSet, thirdSet));
    }
}
