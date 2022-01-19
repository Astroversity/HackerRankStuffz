package com.cruftbusters.java_starter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BigMaxNumber {
    public long someMaxer(List<Integer> someList) {
        List<Long> maxList = new ArrayList<>();
        for (int i = 0; i < someList.size() - 2;i++) {
            long addNumberOne = someList.get(i);
            long addNumberTwo = someList.get(i + 1);
            long addNumberThree = someList.get(i + 2);
            if (addNumberOne != addNumberTwo
                    && addNumberTwo != addNumberThree
                    && addNumberOne != addNumberThree) {
                maxList.add(addNumberOne + addNumberTwo + addNumberThree);
            }
        }
        return Collections.max(maxList);
    }
}
