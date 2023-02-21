package org.example.seminar3.cw3;

import java.util.ArrayList;
import java.util.List;

public class neim {
    public static void main(String[] args) {
        Items item = new Items("qve", "dh", 3);
        Items item1 = new Items("qve1", "er", 3);
        Items item2 = new Items("qve2", "erw", 3);
        List<Items> itemsList = new ArrayList<>();
        itemsList.add(item);
        itemsList.add(item1);
        itemsList.add(item2);
        System.out.println(itemsList);
        String searchName = "qve";
        Integer summ = 0;
        List<String> country = new ArrayList<>();
        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getName().equals(searchName)){
                summ+=itemsList.get(i).getVolume();
            boolean f = true;
                for (int j = 0; j < country.size(); j++) {
                    if(itemsList.get(i).getCountry().equals(country.get(j))){
                        f = false;
                    }
            }
                if (f) {
                    country.add(itemsList.get(i).getCountry());
                }

                }
        }
        System.out.println("c = "+country);
        System.out.println("summ = " + summ);
    }
}
