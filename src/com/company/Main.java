package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("pleas enter the number :");
        int k = 1;
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int b = number;
        while (b / 10 != 0) {
            k++;
            b = b / 10;
        }
        //System.out.println(k);
        if (k < 100) {
            for (int i = 1; i <= k; i++) {
                int c = (int) (number / Math.pow(10, k - i));
                System.out.printf("%d:", c);
                for (int j = 0; j < c; j++) {
                    System.out.printf(" %d ", c);

                }
                number = (int) (number % Math.pow(10, k - i));
                System.out.println();


            }


        }
    }
}
