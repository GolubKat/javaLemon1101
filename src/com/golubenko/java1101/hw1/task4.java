package com.golubenko.java1101.hw1;

public class task4 {
    public static void main (String[] args){
        int a = 193;
        int b = a%10;
        int c = a/100;
        int e = (a%100)/10;
        int d = b+c+e;

        System.out.println(d);
    }
}
