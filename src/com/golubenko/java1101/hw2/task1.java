package com.golubenko.java1101.hw2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        String name = "golubenko katerina vladimirovna";
        char[] val = name.toCharArray();
        for(char b: val) {
            int c = b;
            System.out.println("значение Ascii буквы " + b + " равно: " + c);
        }

    }
}