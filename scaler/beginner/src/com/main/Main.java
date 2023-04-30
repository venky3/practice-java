package com.main;

import com.main.pattern.Pattern1;
import com.main.pattern.Pattern2;

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
        System.out.println("\n\tPlease enter the input: ");
        Integer n = Integer.parseInt(reader.readLine());
        Pattern2 pattern2  = new Pattern2();
        System.out.println("---------------------Solution 1---------------------------------");

        pattern2.printVShape(n);

        System.out.println("---------------------Solution 2---------------------------------");
        pattern2.printVShape1(n);
    }
}