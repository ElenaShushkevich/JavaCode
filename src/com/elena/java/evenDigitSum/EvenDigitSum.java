package com.elena.java.evenDigitSum;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-125));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int sum = 0;
            while (number !=0) {
                sum += number%10;// sum =sum + number%10
                number /= 10;
            }
            return sum;
        }
    }
}
