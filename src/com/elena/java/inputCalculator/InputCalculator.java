package com.elena.java.inputCalculator;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        InputCalculator calllc= new InputCalculator();
        calllc.inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int count = 0;

        while (true){
            int order = count +1;
            boolean checker = scanner.hasNextInt();
            if (checker){
                sum += scanner.nextInt();
                avg = Math.round((double)(sum)/(double)(order));
                count++;
            }
            else {
                break;
            }
            scanner.nextLine();

        }
        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();

    }
}
