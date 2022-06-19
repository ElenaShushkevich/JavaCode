package com.elena.java.polindrom;

public class SumFirstAndLast {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit (869));
    }
        public static int sumFirstAndLastDigit(int number) {
            if (number < 0) {
                return -1;
            }
            else if (number == 0) {
                return 0;
            }
            else if (number > 0) {
                int lastDigit = number % 10;

                while (number > 9){
                    number = number / 10;
                }

                return lastDigit + number;
            }
            return 0;
        }
    }