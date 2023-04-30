package com.problems.main;

import com.problems.Problem1;
import com.problems.Problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Project:  Default (Template) Project
 * Created by Devesh Kumar on 30/04/2023
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the input:");
        Integer n = Integer.parseInt(reader.readLine());

        System.out.println("------------------Problem 1------------------------------");
        Problem2 problem2 = new Problem2();

        problem2.printVShape(n);
        System.out.println("---------------------------Problem 2--------------------------------------");
        problem2.printVShape1(n);
    }
}