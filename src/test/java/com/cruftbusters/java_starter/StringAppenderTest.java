package com.cruftbusters.java_starter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringAppenderTest {
    @Test
    void AppendString() {
        StringAppender strAppend = new StringAppender();
        Assertions.assertEquals(2, strAppend.Appender("amaze", "amazon"));
        Assertions.assertEquals(3, strAppend.Appender("nozama", "amazon"));
        Assertions.assertEquals(4, strAppend.Appender("zonnnamedzdddno", "amazon"));
        Assertions.assertEquals(0, strAppend.Appender("aamzonmazonnazzoon", "amazon"));
        Assertions.assertEquals(1, strAppend.Appender("x]x{xaxmxaxzxo", "]{amazon"));
        Assertions.assertEquals(6, strAppend.Appender("efg", "amazon"));
    }
}
