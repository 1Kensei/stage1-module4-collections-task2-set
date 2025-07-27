package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> set = new TreeSet<>();
        for (Integer num : sourceList) {
            int p = (num*num);
            if(p >=lowerBound && p <= upperBound) {
                set.add(p);
            }
        }
        return set;
    }
}
