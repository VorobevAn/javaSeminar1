package org.example.seminar1.hw2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;

        for(int sum = 0; n != 0; n = scanner.nextInt()) {
            if (n > 0) {
                sum += n;
            } else {
                result = sum;
            }
        }
        System.out.println(result);
    }
}

