package org.example.seminar1.hw1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] text2 = text.replace("  ", " ").split(" ");
        String newtext = "";

        for(int i = text2.length - 1; i >= 0; --i) {
            newtext += text2[i].strip() + " ";
        }

        System.out.print(newtext.strip());
    }
}

