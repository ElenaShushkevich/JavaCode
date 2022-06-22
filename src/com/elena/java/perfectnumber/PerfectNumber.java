package com.elena.java.perfectnumber;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));

    }

    public static boolean isPerfectNumber(int number) {
        if (number >= 1) {
            int x = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    x += i;
                }
            }
            return x == number;
        } else {
            return false;
        }
    }
}
