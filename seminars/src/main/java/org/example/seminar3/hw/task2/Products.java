package org.example.seminar3.hw.task2;

import java.util.ArrayList;
import java.util.List;

public class Products {
    public static void main(String[] args) {
        Geters product1 = new Geters("яблоки", "Абхазия", 10, 25, 2);
        Geters product2 = new Geters("яблоки", "Россия", 15, 20, 2);
        Geters product3 = new Geters("груши", "Грузия", 11, 23, 1);
        Geters product4 = new Geters("абрикосы", "Армения", 10, 22, 2);
        List<Geters> getList = new ArrayList<>();
        getList.add(product1);
        getList.add(product2);
        getList.add(product3);
        getList.add(product4);

        int rightVariety = 2;
        List<Geters> rezultList = new ArrayList<>();
        for (int i = 0; i < getList.size(); i++) {
            if (getList.get(i).getVariety().equals(rightVariety)) {
                boolean flag = true;
                for (int j = 0; j < rezultList.size(); j++) {
                    if (getList.get(i).getName().equals(rezultList.get(j).getName())) {
                        if (getList.get(i).getPrice() < rezultList.get(j).getPrice()) {
                            rezultList.set(j, getList.get(i));
                            flag = false;
                        }
                    }
                }
                if (flag) {
                    rezultList.add(getList.get(i));
                }
            }
        }
        System.out.println("Продукты с наименьшей ценой: ");
        for (int j = 0; j < rezultList.size(); j++) {
            System.out.println(rezultList.get(j).getName() + " " + rezultList.get(j).getPrice());
        }
    }
}
