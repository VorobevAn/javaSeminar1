package org.example.seminar3.hw.task1;

import java.util.ArrayList;
import java.util.List;

public class Product {

    public static void main(String[] args) {
        Items item = new Items("банан высший", 22, 2);
        Items item1 = new Items("яблоки", 18, 1 );
        Items item2 = new Items("картофель высший", 21, 2);
        Items item3 = new Items("кабачок", 12, 1);
        List<Items> itemsList = new ArrayList<>();
        itemsList.add(item);
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        System.out.println(itemsList);

        int maxPrice = 0;
        String nameLooking = "высший";
        List<String> neim = new ArrayList<>();
        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getNeim().contains(nameLooking)) {
                if (itemsList.get(i).getVariety() == 2 || itemsList.get(i).getVariety() == 1) {
                    if (itemsList.get(i).getPrice() > maxPrice) {
                        maxPrice = itemsList.get(i).getPrice();
                        neim.add(itemsList.get(i).getNeim());
                    }
                }
            }
        }
        System.out.println("Наибольшая цена товара: "+neim.get(neim.size()-1) +" " + maxPrice);
    }

    }

