package org.example.seminar4.hw.task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Ert {
    public static void main(String[] args) {
        String str = "()[](){}";
        LinkedList<Character> stack = new LinkedList<>();
        for (char i : str.toCharArray()) {
            if (i == '(')
                stack.push(')');
            else if (i == '{')
                stack.push('}');
            else if (i == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != i)
                System.out.println("Falce");
        }
        System.out.println(stack.isEmpty());
   }

        }







