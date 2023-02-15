package org.example.seminar1.hw2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        int sum = 0;
        while (n != 0) {
            if (n > 0) {
                sum += n;
            } else {
                result = sum;
            }
            n = scanner.nextInt();
        }
        System.out.println(result);
    }
}

