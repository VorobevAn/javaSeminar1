package org.example.seminar5.hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberWords {
    public static void main(String[] args) {
        String str = "С праздником мужества, славы и силы!\n" +
                "Чествуем вам, дорогие мужчины!\n" +
                "И от души вам желаем с любовью,\n" +
                "Чтоб богатырским было здоровье.\n" +
                "Ясного неба, лишь мирных сражений,\n" +
                "Роста карьерного и достижений.\n" +
                "Пусть на все блага жизнь будет щедра.\n" +
                "Радости, счастья, любви вам, добра.\n" ;
        String[] str2 = str.replace(",","").replace(".","").split(" ");
        Map<String,Integer> word = new HashMap<>();
        System.out.println("Введите искомое слово: ");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        scanner.close();
        for (int i = 0; i <str2.length; i++) {
            word.putIfAbsent(str2[i].toLowerCase(), 0);
            word.put(str2[i].toLowerCase(), word.get(str2[i].toLowerCase())+1);
            }
            System.out.println("Колличество вхождений: " + word.get(key));
        }
    }


