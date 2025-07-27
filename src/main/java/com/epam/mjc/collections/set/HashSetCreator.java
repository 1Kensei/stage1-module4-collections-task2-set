package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer num : sourceList) {
            if(num%2 == 0) {
                int cur = num;
                while(cur%2 == 0) {
                    set.add(cur);
                    cur = cur/2;
                }
                set.add(cur);
            } else {
                set.add(num);
                set.add(num*2);
            }
        }
        return set;
    }
}
