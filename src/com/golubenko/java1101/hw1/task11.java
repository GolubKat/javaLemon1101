package com.golubenko.java1101.hw1;
import java.util.Scanner;
public class task11 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();

            for(int i=1; i<=10; ++i){
                StringBuilder builder = new StringBuilder();
                builder.append(a).append(" * ").append(i).append(" = ").append(i*a);
                System.out.println(builder.toString());
            }

        }

    }