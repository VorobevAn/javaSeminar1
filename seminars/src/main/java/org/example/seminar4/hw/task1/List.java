package org.example.seminar4.hw.task1;

import java.util.LinkedList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Сколько элементов будет в списке?: ");
        int n = scaner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.addFirst(scaner.nextInt());
        }
        scaner.close();
        System.out.println(list);
    }
}
