package org.example.seminar2.hw3;

import java.util.Scanner;

public class Arrey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите длину массива");
        int[] arrey = new int[scan.nextInt()];
        System.out.println("Заполните массив цыфрами");
        for (int i = 0; i < arrey.length; i++) {
            arrey[i] = scan.nextInt();
        }
        int summIndex = 0;
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] > 9 && arrey[i] < 99) {
                summIndex += i;
            }
        }
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] < 0) {
                arrey[i] = summIndex;
            }
        }
        for (int j : arrey) {
            System.out.print(j + " ");
        }

    }
}
