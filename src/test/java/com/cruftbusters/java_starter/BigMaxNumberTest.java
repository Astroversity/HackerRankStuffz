package com.cruftbusters.java_starter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BigMaxNumberTest {
    @Test
    void FindMaxNumberFromList(){
        BigMaxNumber bigMaxNumber = new BigMaxNumber();
        List<Integer> someList = new ArrayList<>() {{
            add(1);
            add(4);
            add(9);
            add(12);
        }};
        Assertions.assertEquals(25, bigMaxNumber.someMaxer(someList));
    }
    @Test
    void FindMaxNumberFromRepeatingElements(){
        BigMaxNumber bigMaxNumber = new BigMaxNumber();
        List<Integer> someList = new ArrayList<>() {{
            add(1);
            add(4);
            add(12);
            add(12);
            add(9);
        }};
        Assertions.assertEquals(17, bigMaxNumber.someMaxer(someList));
    }
    @Test
    void FindMaxNumberFromRepeatingElementsSeperated(){
        BigMaxNumber bigMaxNumber = new BigMaxNumber();
        List<Integer> someList = new ArrayList<>() {{
            add(1);
            add(12);
            add(4);
            add(12);
            add(9);
        }};
        Assertions.assertEquals(25, bigMaxNumber.someMaxer(someList));
    }
    @Test
    void FindMaxNumberWithLong(){
        BigMaxNumber bigMaxNumber = new BigMaxNumber();
        List<Integer> someList = new ArrayList<>() {{
            add(2_000_000_000);
            add(2_000_000_001);
            add(2_000_000_002);
            add(12);
            add(9);
        }};
        Assertions.assertEquals(6_000_000_003L, bigMaxNumber.someMaxer(someList));
    }
}
