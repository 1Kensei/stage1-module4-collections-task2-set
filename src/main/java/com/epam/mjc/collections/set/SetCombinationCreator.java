package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new HashSet<>(firstSet);
        Set<String> union12 = new HashSet<>(firstSet);
        union12.addAll(secondSet);

        set.retainAll(secondSet);
        set.removeAll(thirdSet);
        thirdSet.removeAll(union12);
        set.addAll(thirdSet);
        return set;
    }
}
