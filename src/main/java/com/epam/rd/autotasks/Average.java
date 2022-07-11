package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Use Scanner methods to read input
        int inp = sc.nextInt();
        int sum=inp;
        int count = 0;
        while (true) {
            inp = sc.nextInt();
            if(inp==0) break;
            sum = inp + sum;
            count++;}
        count++;
        System.out.println(sum/count);


}}