package org.example.seminar2.hw2;

import com.sun.source.tree.TryTree;

import java.util.Scanner;

public class checking2 {
    public static void main(String[] args) {
        System.out.println("Введите чичсло");
        Scanner scanner = new Scanner(System.in);
        int nam = scanner.nextInt();
            int nam2 = scanner.nextInt();
            if (nam < nam2){
                nam = nam2;
            }
        System.out.println(nam);
        }
    }

