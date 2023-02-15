package org.example.seminar2.hw1;

import java.util.Scanner;


public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько будет чисел?: ");
        int count = scan.nextInt();
        System.out.println("Водите числа по одному");
        int summ = 0;
        for (int i = 1; i <= count; i++) {
            int nam1 = scan.nextInt();
            if (nam1 == 2 || nam1 == 3) {
                summ += nam1;
            } else if (nam1 % 2 != 0 && nam1 % 3 != 0 && nam1 > 0 && nam1 != 1) {
                summ += nam1;
            }

        }
        scan.close();
        System.out.println("Сумма всех простых чисел: " + summ);
    }

}
