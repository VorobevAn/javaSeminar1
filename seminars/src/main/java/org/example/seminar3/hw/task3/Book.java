package org.example.seminar3.hw.task3;

//Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.

import java.util.ArrayList;
import java.util.List;

public class Book {
    public static void main(String[] args) {
        Items book = new Items("Война и мир", "Л.Н.Аолстой", 800, 2010, 13);
        Items book1 = new Items("Мёртвые души", "Н. В. Гоголя", 450, 1842, 1743);
        Items book2 = new Items("Отцы и дети", "И.С. Афанфсьев", 700, 2020, 7);
        Items book3 = new Items("Преступление и наказание", "Ф.М. Достоевского", 650, 1873, 1257);
        List<Items> bookList = new ArrayList<>();
        bookList.add(book);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        String search = "А";
        int count = 0;
        System.out.println("Книги удовлетворящие требованиям: ");
        for (Items items : bookList) {
            if (items.getFio().contains(search) && items.getYear() >= 2010) {
                for (int j = 1; j <= items.getNumberPages(); j++) {
                    if (items.getNumberPages() % j == 0) {
                        count++;
                    }
                }
            }
            if (count == 2) {
                System.out.println(items.getTitleBook());
            }
        }
    }
}
