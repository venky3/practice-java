package com.practice;

import java.util.Scanner;

public class First_vs_Last {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();
        for (int i = 0; i < noOfTestCases; i++) {
            int n = scanner.nextInt();
            int lastDigit = n % 10;
            int firstDigit = 0;
            while (n > 0) {
                firstDigit = n % 10;
                n = n / 10;
            }
            System.out.println(firstDigit + " " + lastDigit);
        }
    }
}