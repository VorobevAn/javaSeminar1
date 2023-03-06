package org.example.seminar6.hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Catalog book = new Catalog();
        book.mybook();
        System.out.println("По какому пораметру подобрать ноутбук 1:ram, 2:ssd, 3:os, 4:color? ");
        Scanner scanner = new Scanner(System.in);
        Integer key = scanner.nextInt();
        book.print(key);
        scanner.close();

    }
}