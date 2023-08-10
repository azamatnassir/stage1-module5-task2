package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return arg -> {
            List<Integer> newList = new ArrayList<>();
            for (Integer num : arg) {
                newList.add(num / divider);
            }
            return newList;
        };
    }
}
