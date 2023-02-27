package org.example.seminar5.hw;

import java.util.HashMap;
import java.util.Map;

public class WordsLine {
    public static void main(String[] args) {
        Map<String, Integer> words = new HashMap<>();
        String str = "Россия идет вперед всей - планеты. Планета — это не Россия.";
        String[] str2 = str.replace(".", "").split(" ");
        for (int i = 0; i < str2.length; i++) {
            words.putIfAbsent(str2[i].toLowerCase(), 0);
            words.put(str2[i].toLowerCase(), words.get(str2[i].toLowerCase()) + 1);
        }
        for (var entry : words.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue() + " раз");
    }
}
