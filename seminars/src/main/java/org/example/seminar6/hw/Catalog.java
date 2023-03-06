package org.example.seminar6.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catalog {
    Laptop book1 = new Laptop(1, 2, 256, "Windows", "Черный");
    Laptop book2 = new Laptop(2, 4, 512, "Windows", "Серый");
    Laptop book3 = new Laptop(3, 6, 512, "Windows", "Серый");
    Laptop book4 = new Laptop(4, 6, 512, "Macbook", "Красный");
    Laptop book5 = new Laptop(5, 16, 512, "Windows", "Синий");
    Laptop book6 = new Laptop(6, 4, 128, "Ubuntu", "Серый");
    Laptop book7 = new Laptop(7, 8, 512, "Windows", "Белый");

    List<Laptop> mylist = new ArrayList<>();

    public List<Laptop> getMylist() {
        mylist.add(book1);
        mylist.add(book2);
        mylist.add(book3);
        mylist.add(book4);
        mylist.add(book5);
        mylist.add(book6);
        mylist.add(book7);
        return mylist;
    }

    public void mybook() {
        System.out.println("имеющиеся ноутбуки: ");
        for (Laptop i : getMylist()) {
            System.out.println(i);
        }
    }


    public void filter(Integer key, Integer velye) {
        List<Laptop> rezylt = new ArrayList<>();
        for (Laptop i : getMylist()) {
            if (key == 1) {
                if (i.getRam() >= velye) {
                    rezylt.add(i);
                }
            }
            if (key == 2) {
                if (i.getSsd() >= velye) {
                    rezylt.add(i);
                }
            }
        }
        System.out.println("Подходящие ноутбуки:");
        for (Laptop i : rezylt) {
            System.out.println(i);
        }
    }

    public void filter2(Integer key, String velye) {
        List<Laptop> rezylt = new ArrayList<>();
        for (Laptop i : getMylist()) {
            if (key == 3) {
                if (i.getOs().equals(velye)) {
                    rezylt.add(i);
                }
            } else if (key == 4) {
                if (i.getColor().equals(velye)) {
                    rezylt.add(i);
                }
            }
        }
        for (Laptop i : rezylt) {
            System.out.println(i);
        }
    }
    public void print(Integer key){
        Scanner scanner = new Scanner(System.in);
        if (key == 1  || key == 2) {
            System.out.print("Введите минимальное значение: ");
            Integer velye = scanner.nextInt();
            filter(key,velye);


        } else {
            System.out.print("Ведите параметр: ");
            String velye = scanner.nextLine();
            filter2(key, velye.toLowerCase());
        }
    }

}