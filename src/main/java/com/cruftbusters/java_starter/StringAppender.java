package com.cruftbusters.java_starter;

public class StringAppender {
    public int Appender(String searchWord, String resultWord) {
        for (char character : searchWord.toCharArray()) {
            if (resultWord.isEmpty()) {
                return 0;
            }
            if (character == resultWord.charAt(0)) {
                resultWord = resultWord.substring(1);
            }
        }
        return resultWord.length();
    }
}
