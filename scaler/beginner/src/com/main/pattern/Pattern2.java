package com.main.pattern;

/**
 * Project:  practice-java
 * Created by Devesh Kumar on 30/04/2023
 */

/*
Print Pattern in reverse stare case
 */
public class Pattern2 {
    public void printVShape(int n) {
        if (n == 0) return;
        for (int i = 1; i <= n; i++) {
            String print = i == 1 || i == n ? "*" : "-";
            System.out.print(print);
        }
        System.out.println("");
        printVShape(n-1);
    }

    public void printVShape1(int n) {
        int counter = n;
        while (counter > 0){
            for (int i = 1; i <= counter; i++) {
                if ( i == 1 || i == counter) {
                    System.out.print("*");
                }else {
                    System.out.print("_");
                }
            }
            System.out.println("");
            counter--;
        }
    }
}
