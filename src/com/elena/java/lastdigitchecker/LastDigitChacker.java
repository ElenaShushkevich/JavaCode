package com.elena.java.lastdigitchecker;

public class LastDigitChacker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(10, 99,999));
    }
    public static boolean hasSameLastDigit(int number, int number2, int number3) {
        if ((number >= 10 && number <= 1000) && (number2 >= 10 && number2 <= 1000)&& (number3 >= 10 && number3 <= 1000)) {
            while (number != 0 && number2 !=0 && number3!=0) {
                int firstD = number % 10;
                int secondD = number2 % 10;
                int thirdD = number3 % 10;
                if (firstD == thirdD || firstD==secondD || secondD == thirdD) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
