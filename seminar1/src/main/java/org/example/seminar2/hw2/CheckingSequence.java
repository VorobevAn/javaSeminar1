package org.example.seminar2.hw2;

import java.util.Scanner;

public class CheckingSequence {
    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел через пробел для проверки на возростание");
        Scanner scan = new Scanner(System.in);
        String[] nums = scan.nextLine().split( " ");
        scan.close();
        String rezult = "";
        for (int i = 0; i < nums.length - 1; i++) {
            if (Integer.parseInt(nums[i]) < Integer.parseInt(nums[i + 1])) {
                rezult = "Последовательность возростает";}
            else {
                rezult = "Последовательность не возростающая";
                break;
            }

        }System.out.println(rezult);


    }
}
